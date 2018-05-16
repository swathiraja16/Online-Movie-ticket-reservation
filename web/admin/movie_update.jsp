
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
 		<h3 id="forms-example" class="">Add Theater</h3>
 		<%if(request.getParameter("status")!=null){%><span style="color: red"><%=request.getParameter("status") %></span><%} %>
 		<form action="movie_update_save.jsp">
  <div class="form-group">
    <label for="exampleInputEmail1">Theater Name</label>
    <select class="form-control" id="theater" name="theater" placeholder="Theater Name" required="required">
    <option value=""></option>
    <%
    Connection con = DBConnectivity.getCon();
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("select theater_id, theater_name, place, theater_status, no_seats from theater");
    while(rs.next())
    {
    %>
    <option value="<%=rs.getInt("theater_id")%>"><%=rs.getString("theater_name")%></option>
    <%} %>
    </select>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Movie Name</label>
    <select class="form-control" id="movie" name="movie" placeholder="Movie" required="required">
     <option value=""></option>
    <%
    Statement st1 = con.createStatement();
    ResultSet rs1 = st1.executeQuery("select movie_id, movie_name, release_date, movie_status from movies");
    while(rs1.next())
    {
    %>
    <option value="<%=rs1.getInt("movie_id")%>"><%=rs1.getString("movie_name")%></option>
    <%} %>
    </select>
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Start Date</label>
    <input type="date" class="form-control" id="date" name="date" placeholder="Release Date" required="required">
  </div>

  <button type="submit" class="btn btn-default">Submit</button>
</form>
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

