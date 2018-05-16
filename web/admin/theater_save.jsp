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
String name=request.getParameter("name");
String address=request.getParameter("address");
String place=request.getParameter("place");
String seats=request.getParameter("seats");
String cost=request.getParameter("cost");

String session_id=request.getParameter("session_id");
Connection con=DBConnectivity.getCon();
Statement st = con.createStatement();

Statement st1=con.createStatement();
st1.execute("insert into theater (theater_id, theater_name, place, theater_status, no_seats,cost)"
+"values (0,'"+name+"','"+place+"','active','"+seats+"','"+cost+"')");


%>
<script>
window.location="theater_add.jsp?status=Theater Added Successfully";
</script>
</body>
</html>