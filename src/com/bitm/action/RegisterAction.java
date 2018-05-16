package com.bitm.action;

import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.bitm.form.RegisterForm;

public class RegisterAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		RegisterForm registerForm = (RegisterForm) form;
		

		String name=registerForm.getName();
		String mobile = registerForm.getMobile();
		String uName=registerForm.getUserName();
		String pwd = registerForm.getPwd();
		
		Connection con = DBConnectivity.getCon();
		Statement st = con.createStatement();
		st.execute("insert into users(user_id, name, mobile, user_name, pwd, user_status) values(0,'"+name+"','"+mobile+"','"+uName+"','"+pwd+"','active')");
		
	
			return mapping.findForward("success");
	}

}
