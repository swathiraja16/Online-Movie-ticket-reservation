<%if(session.getAttribute("session_id")==null){
response.sendRedirect("index.jsp");
} %>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="db.DBConnectivity"%>
<%@page import="java.sql.Connection"%>
<html>
<head>
<title>Admin Pannel</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Minimal Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href="css/font-awesome.css" rel="stylesheet"> 
<script src="js/jquery.min.js"> </script>
<script src="js/bootstrap.min.js"> </script>
  
<!-- Mainly scripts -->
<script src="js/jquery.metisMenu.js"></script>
<script src="js/jquery.slimscroll.min.js"></script>
<!-- Custom and plugin javascript -->
<link href="css/custom.css" rel="stylesheet">
<script src="js/custom.js"></script>
<script src="js/screenfull.js"></script>
		<script>
		$(function () {
			$('#supported').text('Supported/allowed: ' + !!screenfull.enabled);

			if (!screenfull.enabled) {
				return false;
			}

			

			$('#toggle').click(function () {
				screenfull.toggle($('#container')[0]);
			});
			

			
		});
		</script>

<!----->

</head>
<body>
<div id="wrapper">
     <!----->
        <jsp:include page="include/nav.jsp"></jsp:include>
        
		 <div id="page-wrapper" class="gray-bg dashbard-1">
       <div class="content-main">
 
 	<!--banner-->	
		     <div class="banner">
		    	<h2>
				<a href="dashboard.jsp">Home</a>
				<i class="fa fa-angle-right"></i>
				<span>Theaters</span>
				</h2>
		    </div>
		<!--//banner-->
 	<!--grid-->
 	<div class="grid-form">
 		<div class="grid-form1">
 		<h3 id="forms-example" class="">Movies History</h3>
 		<%if(request.getParameter("status")!=null){%><span style="color: red"><%=request.getParameter("status") %></span><%} %>
 		
<table class="table table-bordered table-striped">
<tr><th>SlNo</th><th>Movie Name</th><th>Theater</th><th>Release Date</th></tr>
<% int i=1;
Connection con = DBConnectivity.getCon();
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select id, movie_id, theater_id, start_date, movie_status from movie_theater where movie_status='inactive'");
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
<tr><th><%=i++ %></th><th><%=movie_name%></th><th><%=theater_name %></th><th><%=rs.getString("start_date") %></th></tr>
<%} %>
</table>


</div>
<!----->


  
 	</div>
 	<!--//grid-->
		<!---->

		</div>
		<div class="clearfix"> </div>
       </div>
     <!--scrolling js-->
	<script src="js/jquery.nicescroll.js"></script>
	<script src="js/scripts.js"></script>
	<!--//scrolling js-->
<!---->

</body>
</html>

