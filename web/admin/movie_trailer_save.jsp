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
String mid=request.getParameter("mid");
String name=request.getParameter("name");


String session_id=request.getParameter("session_id");
Connection con=DBConnectivity.getCon();
Statement st = con.createStatement();

Statement st1=con.createStatement();
st1.execute("insert into movie_trailer(trailer_id, movie_id, trailer)values(0,'"+mid+"','"+name+"')");


%>
<input type="hidden" id="mid" value='<%=mid%>'>
<script>
var mid=document.getElementById("mid").value
window.location="movie_trailer.jsp?mid="+mid+"&status=Movie Trailer Added Successfully";
</script>
</body>
</html>