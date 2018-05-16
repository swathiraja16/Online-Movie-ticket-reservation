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
</head>
<body>
<jsp:include page="include/header.jsp"></jsp:include>
   
   
   <div class="content_middle">
   	  <div class="container">
   	    <div class="content_middle_box">
          
   	    <div class="middle_grid wow fadeInUp" data-wow-delay="0.4s">
   			<div class="col-md-8 index-grids">
   			   <div class="grid1">
   			     
   			     
   			     <%	int no_seats=0,cost=0;
					Connection con = DBConnectivity.getCon();
   			     Statement st = con.createStatement();
   			     ResultSet rs = st.executeQuery("select no_seats,cost from theater where theater_id='"+request.getParameter("tid")+"'");
   			     while(rs.next())
   			     {	
   			    	no_seats=rs.getInt("no_seats"); 
   			    	cost=rs.getInt("cost");
   			    }
					%>
   			     
   			     
   			     <% for(int i=1;i<=no_seats;i++){ 
   			     String status="";
   			     String dis="onclick='selectSeat("+i+")'";
   			     System.out.println("select seat_no from booking_seats where seat_no='"+i+"' and theater_id='"+request.getParameter("tid")+"' and movie_id='"+request.getParameter("mid")+"' and show_date='"+request.getParameter("bdate")+"' and show='"+request.getParameter("show")+"'");
   			    	rs = st.executeQuery("select seat_no from booking_seats where seat_no='"+i+"' and theater_id='"+request.getParameter("tid")+"' and movie_id='"+request.getParameter("mid")+"' and show_date='"+request.getParameter("bdate")+"' and shows='"+request.getParameter("show")+"'");
      			     while(rs.next())
      			     {	
      			    	status="red";
      			    	dis="";
      			    	}
   			     %>
   			     <div style="border: solid black;width: 50px;height: 50px;float: left;text-align: center;background: <%=status %>;" id="seat<%=i%>"<%=dis %> >
   			     <%=i %>
   			     </div> 
   			     <%} %>
   			     <input type="hidden" id="no_seats" value="<%=no_seats%>">
   			   </div>
   			</div>
   			<form action="book.jsp">
   			<input type="hidden" name="show" value="<%=request.getParameter("show")%>">
   			<input type="hidden" name="booking_date" value="<%=request.getParameter("bdate")%>">
   			<input type="hidden" name="mid" value="<%=request.getParameter("mid")%>">
   			<input type="hidden" name="cost" id="cost" value="<%=cost%>">
   			<input type="hidden" name="tid" value="<%=request.getParameter("tid")%>">
   			Total Seats : <input type="text" id="total_seats" name="total_seats" style="background: transparent;" readonly="readonly"><br/>
   			Selected Seats : <span id='selected'></span>
   			<input type="hidden" name="seats" id="seats">
   			<br/><br/><br/>
   			
   			<table style="visibility: hidden;" id="myTable">
   			<tr><td>Billing Amount</td><td><input type="text" name="billing_amt" id="billing_amt" required="required" readonly="readonly"></td></tr>
   			<tr><td>Card No</td><td><input type="text" name="card_no" required="required"></td></tr>
   			<tr><td>Pin</td><td><input type="text" name="card_pin" required="required"></td></tr>
   			</table>
   			
   			<input class="btn1 btn-2 btn-2g" type="submit" value="Book Now">
   			</form>
   			<script type="text/javascript">
   			function selectSeat(seat)
   			{
   				var seats="";
   				var total_seats=0;
   				var no_seats=document.getElementById("no_seats").value
   				
   				if(document.getElementById("seat"+seat).style.backgroundColor=="green")
   					{
   					
   					document.getElementById("seat"+seat).style.backgroundColor="";
   	   				for(var i=1;i<=no_seats;i++)
   	   					{
   	   						var color=document.getElementById("seat"+i).style.backgroundColor;
   	   						if(color=="green")
   	   							{
   	   								seats=seats+","+i;
   	   								total_seats++;
   	   							}
   	   					}
   					}
   				else
   					{
   				document.getElementById("seat"+seat).style.backgroundColor="green";
   				for(var i=1;i<=no_seats;i++)
   					{
   						var color=document.getElementById("seat"+i).style.backgroundColor;
   						if(color=="green")
   							{
   								seats=seats+","+i;
   								total_seats++;
   							}
   					}
   					}
   				document.getElementById("total_seats").value=total_seats;
   				document.getElementById("seats").value=seats;
   				document.getElementById("billing_amt").value=total_seats*document.getElementById("cost").value;
   				document.getElementById("selected").innerHTML=seats;
   				document.getElementById("myTable").style.visibility="";
   			}
   			</script>
   			
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