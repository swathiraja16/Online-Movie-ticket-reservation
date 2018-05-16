package com.bitm.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.bitm.form.RegisterForm;

public class RecipeAddAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
				

		String no_persions=request.getParameter("no_persions");
		String dish_name=request.getParameter("name");

		int dish_id=0;
		Connection con = DBConnectivity.getCon();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select max(dish_id) as dish_id from dish");
		while(rs.next())
		{
			dish_id=rs.getInt("dish_id");
		}
		HttpSession session = request.getSession();
		
		dish_id++;
		st.execute("insert into dish(dish_id, added_date, dish_name, no_persons, dish_status,user_id) values(0,now(),'"+dish_name+"','"+no_persions+"','active',"+session.getAttribute("session_id")+")");
		
		for(int i=1;i<=10;i++)
		{
			if(!request.getParameter("receipe"+i).equals(""))
			{
			Statement st1 = con.createStatement();
			st1.execute("insert into dish_recipe(recipe_id, dish_id, recipe, qty) values(0,'"+dish_id+"','"+request.getParameter("receipe"+i)+"','"+request.getParameter("qty"+i)+"')");
			}
		}
			return mapping.findForward("success");
	}

}
