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
String name=request.getParameter("name");
String mobile=request.getParameter("mobile");
String email=request.getParameter("email");
String password=request.getParameter("password");

String dob=request.getParameter("dob");
String qua=request.getParameter("qua");
String gender=request.getParameter("gender");


Connection con=DBConnectivity.getCon();


Statement st=con.createStatement();
st.execute("insert into customer (customer_id, name, email, pwd, customer_type, customer_status, mobile,dob,qua,gender) values ('0','"+name+"','"+email+"','"+password+"','Customer','active','"+mobile+"','"+dob+"','"+qua+"','"+gender+"')");


%>
<script type="text/javascript">
window.location="index.jsp?status=Account Created Successfully";
</script>
</body>
</html>