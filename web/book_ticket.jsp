<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.bitm.action.DBConnectivity"%>
<%@page import="java.sql.Connection"%>
<html>
<head>
<title>Home</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<!-- Custom Theme files -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Hotel Deluxe Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--webfont-->
<link href='//fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="js/login.js"></script>
<script src="js/jquery.easydropdown.js"></script>
<!--Animation-->
<script src="js/wow.min.js"></script>
<link href="css/animate.css" rel='stylesheet' type='text/css' />
<script>
	new WOW().init();
</script>

<script type="text/javascript">
function get_trailer_videos(mid,tid)
{
	
	var xmlhttp;

	if (window.XMLHttpRequest)
	{// code for IE7+, Firefox, Chrome, Opera, Safari
	xmlhttp=new XMLHttpRequest();
	}
	else
	{// code for IE6, IE5
	xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
	}
	xmlhttp.onreadystatechange=function()
	{
	if (xmlhttp.readyState==4 && xmlhttp.status==200)
	{
    	document.getElementById("trailers").innerHTML=xmlhttp.responseText;
	}
	
	}
	

	xmlhttp.open("GET","get_trailers.jsp?mid="+mid,true);
	xmlhttp.send();
	
	}

</script>

</head>
<body>
<jsp:include page="include/header.jsp"></jsp:include>
   
   
   <div class="content_middle">
   	  <div class="container">
   	    <div class="content_middle_box">
          
   	    <div class="middle_grid wow fadeInUp" data-wow-delay="0.4s">
   			<div class="col-md-6 index-grids">
   			   <div class="grid1">
   			     
   			     <table class="table table-bordered table-hover">
   			     <%
					Connection con = DBConnectivity.getCon();
   			     Statement st = con.createStatement();
   			     ResultSet rs = st.executeQuery("select id, movie_id, theater_id, start_date, movie_status from movie_theater where movie_id='"+request.getParameter("mid")+"'");
   			     while(rs.next())
   			     {
   			    	 
   			    	String movie_name="",theater_name="";
   			 	Statement st1 = con.createStatement();
   			 	ResultSet rs1 = st1.executeQuery("select movie_name from movies where movie_id='"+rs.getInt("movie_id")+"'");
   			 	while(rs1.next())
   			 	{
   			 		movie_name=rs1.getString("movie_name");
   			 	}
   			  	ResultSet rs2 = st1.executeQuery("select theater_name from theater where theater_id='"+rs.getInt("theater_id")+"'");
   				while(rs2.next())
   				{
   					theater_name=rs2.getString("theater_name");
   				}
   			     %>
   			     <tr>
   			     <td><%=theater_name %></td>
   			     
   			     <td>
   			     <%if(session.getAttribute("session_id")!=null){ %>
   			     11:00 AM <a href="seat.jsp?show=1&mid=<%=rs.getInt("movie_id")%>&tid=<%=rs.getInt("theater_id")%>&bdate=<%=request.getParameter("booking_date")%>">Book Now</a><br/>
   			     02:00 PM <a href="seat.jsp?show=2&mid=<%=rs.getInt("movie_id")%>&tid=<%=rs.getInt("theater_id")%>&bdate=<%=request.getParameter("booking_date")%>">Book Now</a><br/>
   			     05:30 PM <a href="seat.jsp?show=3&mid=<%=rs.getInt("movie_id")%>&tid=<%=rs.getInt("theater_id")%>&bdate=<%=request.getParameter("booking_date")%>">Book Now</a><br/>
   			     08:30 PM <a href="seat.jsp?show=4&mid=<%=rs.getInt("movie_id")%>&tid=<%=rs.getInt("theater_id")%>&bdate=<%=request.getParameter("booking_date")%>">Book Now</a>
   			     <%}else{ %>Login To Book<%} %>
   			     </td>
   			     <td><a href="javascript:void(0)" onclick="get_trailer_videos(<%=rs.getInt("movie_id")%>,<%=rs.getInt("theater_id")%>)">View Trailer</a></td>
   			     <td><a href="cast.jsp?mid=<%=rs.getInt("movie_id")%>">View Caste/Crew</a></td>
   			     </tr>	 
   			     <% }
					%>
   			     
   			     </table>
   			     
   			   </div>
   			</div>
   			<div class="col-md-6 index-grids">
   			   <div class="grid1">
   			     <div id="trailers" ></div>
   			    
   			     
   			   </div>
   			</div>
   			
   			<div class="clearfix"> </div>
   		</div>
   		
   		
   		  </div>
   		  
   		  </div>
   	  </div>
   </div>
   <div class="footer">
   	<div class="container">
   	 
	  <div class="footer_grids">
	     <div class="footer-grid">
			<h4>Ipsum Quis</h4>
			<ul class="list1">
				<li><a href="contact.html">Contact</a></li>
				<li><a href="#">Mirum est</a></li>
				<li><a href="#">Placerat facer</a></li>
				<li><a href="#">Claritatem</a></li>
				<li><a href="#">Sollemnes </a></li>
			</ul>
		  </div>
		  <div class="footer-grid">
			<h4>Quis Ipsum</h4>
			<ul class="list1">
				<li><a href="#">Placerat facer</a></li>
				<li><a href="#">Claritatem</a></li>
				<li><a href="#">Sollemnes </a></li>
				<li><a href="#">Claritas</a></li>
				<li><a href="#">Mirum est</a></li>
			</ul>
		  </div>
		  <div class="footer-grid last_grid">
			<h4>Follow Us</h4>
			<ul class="footer_social wow fadeInLeft" data-wow-delay="0.4s">
			  <li><a href=""> <i class="fb"> </i> </a></li>
			  <li><a href=""><i class="tw"> </i> </a></li>
			  <li><a href=""><i class="google"> </i> </a></li>
			  <li><a href=""><i class="u_tube"> </i> </a></li>
		 	</ul>
		 	<div class="copy wow fadeInRight" data-wow-delay="0.4s">
              <p> &copy; 2016 movie booking. All rights reserved</p>
	        </div>
		  </div>
		  <div class="clearfix"> </div>
	   </div>
      </div>
   </div>
</body>
</html>		