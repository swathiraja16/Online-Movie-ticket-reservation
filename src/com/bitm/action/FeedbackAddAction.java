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

public class FeedbackAddAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
				

Connection con = DBConnectivity.getCon();
		Statement st = con.createStatement();
		
		HttpSession session = request.getSession();
		
		st.execute("insert into feedback(feedback_id, added_date, dish_id,feedback,user_id) values(0,now(),'"+request.getParameter("did")+"','"+request.getParameter("feedback")+"',"+session.getAttribute("session_id")+")");
		return mapping.findForward("success");
	}

}
