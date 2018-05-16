<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="db.DBConnectivity"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
<%
String email=request.getParameter("email");
String password=request.getParameter("password");

Connection con=DBConnectivity.getCon();


Statement st=con.createStatement();
ResultSet rs = st.executeQuery("select customer_id, name, email, pwd, customer_type, customer_status from customer where email='"+email+"' and pwd='"+password+"'");
while(rs.next())
{	
	session.setAttribute("session_id",rs.getString("customer_id"));
	session.setAttribute("session_name",rs.getString("email"));
	session.setAttribute("session_type",rs.getString("customer_type"));
}
response.sendRedirect("index.jsp");
%>
</body>
</html>