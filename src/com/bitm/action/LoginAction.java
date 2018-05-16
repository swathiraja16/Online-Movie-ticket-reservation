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

import com.bitm.form.LoginForm;

public class LoginAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		LoginForm loginForm = (LoginForm) form;

		HttpSession session = request.getSession();
		
		Connection con = DBConnectivity.getCon();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select customer_id, name, email, pwd, customer_type, customer_status from customer where email='"+loginForm.getEmail()+"' and pwd='"+loginForm.getPassword()+"'");
		while(rs.next())
		{
			System.out.println("Hello");
			
			session.setAttribute("session_id", rs.getInt("customer_id"));
			session.setAttribute("session_name", rs.getString("name"));
			return mapping.findForward("success");
		}
		return mapping.findForward("failure");
	}

}
