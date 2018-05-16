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
String theater=request.getParameter("theater");
String movie=request.getParameter("movie");
String date=request.getParameter("date");


String session_id=request.getParameter("session_id");
Connection con=DBConnectivity.getCon();
Statement st = con.createStatement();


st.execute("update movie_theater set movie_status='inactive' where theater_id='"+theater+"'");
Statement st1=con.createStatement();
st1.execute("insert into movie_theater (id, movie_id, theater_id,start_date)"
+"values (0,'"+movie+"','"+theater+"','"+date+"')");


%>
<script>
window.location="movie_update.jsp?status=Movie Updated To Theater Successfully";
</script>
</body>
</html>