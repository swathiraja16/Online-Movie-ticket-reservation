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
   
   <div class="content_top">
   	  <div class="container">
   		<div class="col-md-4 bottom_nav">
   		   <div class="content_menu">
				<ul>
					 
				</ul>
			</div>
		</div>
		
   	</div>
   </div>
   <div class="content_middle">
   	  <div class="container">
   	    <div class="content_middle_box">
          
   	    <div class="middle_grid wow fadeInUp" data-wow-delay="0.4s">
   			
   			 <%
 		String trailer="";
 		Connection con = DBConnectivity.getCon();
 		Statement st = con.createStatement();
 		ResultSet rs= st.executeQuery("select video_link from movie_trailer");
 		while(rs.next())
 		{trailer=rs.getString("video_link");%>
			
			    
 			<div class="col-md-6 index-grids">
   			   <div class="grid1">
   			     <div class="index_img"><video width="320" height="240" controls>
<source src="uploads/<%=trailer %>" type="video/mp4">
<source src="uploads/<%=trailer %>" type="video/ogg">
Your browser does not support the video tag.
</video></div>
   				  <i class="m_home"> </i>
                  
   				  <div class="inner_wrap1">
   				 	<ul class="item_module">
   				 	 	
   				 	 	<li class="module_right">
   				 	 		<img src="images/m_star.png" class="img-responsive" alt=""/>
   				 	 		
   				 	 		<a href="single.html" class="content_btn">....read more</a>
   				 	 	</li>
   				 	 	<div class="clearfix"> </div>
   				 	 </ul>
   				  </div>
   			   </div>
   			</div>
 			<%
 		}
 		%>
 		
   			
   			
   			
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