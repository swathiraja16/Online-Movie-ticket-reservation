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
String user_id="0";
if(session.getAttribute("session_id")!=null)
{
	user_id=(String)session.getAttribute("session_id");
}

String booking_date=request.getParameter("booking_date");
String total_seats=request.getParameter("total_seats");
String seats=request.getParameter("seats");

String mid=request.getParameter("mid");
String tid=request.getParameter("tid");
String cost=request.getParameter("billing_amt");
String show=request.getParameter("show");


Connection con=DBConnectivity.getCon();
int booking_id=0;
Statement st2 = con.createStatement();
ResultSet rs2 = st2.executeQuery("select max(booking_id) as booking_id from booking");
while(rs2.next())
{
	booking_id=rs2.getInt("booking_id");
}booking_id++;

Statement st=con.createStatement();
st.execute("insert into booking (booking_id, movie_id, theater_id, booking_date, booking_status, show_date,customer_id,shows) values ('"+booking_id+"','"+mid+"','"+tid+"',now(),'Done','"+booking_date+"','"+session.getAttribute("session_id")+"','"+show+"')");

String temp[]=seats.split(",");
for(int i=1;i<temp.length;i++)
{
	st.execute("insert into booking_seats (id, booking_id, movie_id, theater_id, show_date, seat_no,customer_id,shows) values ('0','"+booking_id+"','"+mid+"','"+tid+"','"+booking_date+"','"+temp[i]+"','"+session.getAttribute("session_id")+"','"+show+"')");

}
String mobile="",name="";
Statement st10 = con.createStatement();
ResultSet rs10 = st10.executeQuery("select mobile,name from customer where customer_id='"+session.getAttribute("session_id")+"'");
while(rs10.next())
{
	name=rs10.getString("name");
	mobile=rs10.getString("mobile");
}
String msg="Dear "+name+", Your Ticket has been booked. Ref No : "+booking_id+", Seat No:"+seats+". Billing Amt :"+cost;
%>
<embed src="http://167.114.60.246/VidyaSMS/SendSMS.aspx?User=testsms&Pwd=testsms@123&SenderId=TESTNG&MobileNo=<%=mobile %>&Message=<%=msg%>">
<script type="text/javascript">
setTimeout(function() { window.location="index.jsp?status=Account Created Successfully"; }, 5000);
</script>
</body>
</html>