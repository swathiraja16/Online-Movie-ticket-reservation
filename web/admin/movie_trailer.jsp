<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.bitm.action.DBConnectivity"%>
<%@page import="java.sql.Connection"%>
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
 		<%
 		String trailer="";
 		Connection con = DBConnectivity.getCon();
 		Statement st = con.createStatement();
 		ResultSet rs= st.executeQuery("select trailer,video_link from movie_trailer where movie_id='"+request.getParameter("mid")+"'");
 		while(rs.next())
 		{
 			trailer=rs.getString("video_link");%>
 			<video width="320" height="240" controls>
  <source src="../uploads/<%=trailer %>" type="video/mp4">
  <source src="../uploads/<%=trailer %>" type="video/ogg">
  Your browser does not support the video tag.
</video>
 			<%=trailer %>
 			<% 
 		}
 		%>
 		
 		
 		
 		
 		
 		<%if(request.getParameter("status")!=null){%><span style="color: red"><%=request.getParameter("status") %></span><%} %>
 	  <form  method=post action="../UploadProducts" name="f" enctype="multipart/form-data">
						
 		<input type="hidden" name="mid" value="<%=request.getParameter("mid")%>">
  <div class="form-group">
    <label for="exampleInputEmail1">Movie Trailer Title</label>
    <input type="text" class="form-control" id="name" name="name" placeholder="Trailer Link" required="required">
  </div>
   <div class="form-group"> <label for="exampleInputFile">Trailer</label> <input type="file" id="pic1" name="pic1"> <p class="help-block">Upload Trailer Here.</p> </div> 

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

