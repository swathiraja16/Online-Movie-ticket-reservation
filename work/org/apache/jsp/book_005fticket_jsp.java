package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import com.bitm.action.DBConnectivity;
import java.sql.Connection;

public final class book_005fticket_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!--A Design by W3layouts\r\n");
      out.write("Author: W3layout\r\n");
      out.write("Author URL: http://w3layouts.com\r\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\r\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Home</title>\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<link href=\"css/style.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"Hotel Deluxe Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<!--webfont-->\r\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/login.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.easydropdown.js\"></script>\r\n");
      out.write("<!--Animation-->\r\n");
      out.write("<script src=\"js/wow.min.js\"></script>\r\n");
      out.write("<link href=\"css/animate.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<script>\r\n");
      out.write("\tnew WOW().init();\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function get_trailer_videos(mid,tid)\r\n");
      out.write("{\r\n");
      out.write("\t\r\n");
      out.write("\tvar xmlhttp;\r\n");
      out.write("\r\n");
      out.write("\tif (window.XMLHttpRequest)\r\n");
      out.write("\t{// code for IE7+, Firefox, Chrome, Opera, Safari\r\n");
      out.write("\txmlhttp=new XMLHttpRequest();\r\n");
      out.write("\t}\r\n");
      out.write("\telse\r\n");
      out.write("\t{// code for IE6, IE5\r\n");
      out.write("\txmlhttp=new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("\t}\r\n");
      out.write("\txmlhttp.onreadystatechange=function()\r\n");
      out.write("\t{\r\n");
      out.write("\tif (xmlhttp.readyState==4 && xmlhttp.status==200)\r\n");
      out.write("\t{\r\n");
      out.write("    \tdocument.getElementById(\"trailers\").innerHTML=xmlhttp.responseText;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\txmlhttp.open(\"GET\",\"get_trailers.jsp?mid=\"+mid,true);\r\n");
      out.write("\txmlhttp.send();\r\n");
      out.write("\t\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/header.jsp", out, false);
      out.write("\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   <div class=\"content_middle\">\r\n");
      out.write("   \t  <div class=\"container\">\r\n");
      out.write("   \t    <div class=\"content_middle_box\">\r\n");
      out.write("          \r\n");
      out.write("   \t    <div class=\"middle_grid wow fadeInUp\" data-wow-delay=\"0.4s\">\r\n");
      out.write("   \t\t\t<div class=\"col-md-6 index-grids\">\r\n");
      out.write("   \t\t\t   <div class=\"grid1\">\r\n");
      out.write("   \t\t\t     \r\n");
      out.write("   \t\t\t     <table class=\"table table-bordered table-hover\">\r\n");
      out.write("   \t\t\t     ");

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
   			     
      out.write("\r\n");
      out.write("   \t\t\t     <tr>\r\n");
      out.write("   \t\t\t     <td>");
      out.print(theater_name );
      out.write("</td>\r\n");
      out.write("   \t\t\t     \r\n");
      out.write("   \t\t\t     <td>\r\n");
      out.write("   \t\t\t     ");
if(session.getAttribute("session_id")!=null){ 
      out.write("\r\n");
      out.write("   \t\t\t     11:00 AM <a href=\"seat.jsp?show=1&mid=");
      out.print(rs.getInt("movie_id"));
      out.write("&tid=");
      out.print(rs.getInt("theater_id"));
      out.write("&bdate=");
      out.print(request.getParameter("booking_date"));
      out.write("\">Book Now</a><br/>\r\n");
      out.write("   \t\t\t     02:00 PM <a href=\"seat.jsp?show=2&mid=");
      out.print(rs.getInt("movie_id"));
      out.write("&tid=");
      out.print(rs.getInt("theater_id"));
      out.write("&bdate=");
      out.print(request.getParameter("booking_date"));
      out.write("\">Book Now</a><br/>\r\n");
      out.write("   \t\t\t     05:30 PM <a href=\"seat.jsp?show=3&mid=");
      out.print(rs.getInt("movie_id"));
      out.write("&tid=");
      out.print(rs.getInt("theater_id"));
      out.write("&bdate=");
      out.print(request.getParameter("booking_date"));
      out.write("\">Book Now</a><br/>\r\n");
      out.write("   \t\t\t     08:30 PM <a href=\"seat.jsp?show=4&mid=");
      out.print(rs.getInt("movie_id"));
      out.write("&tid=");
      out.print(rs.getInt("theater_id"));
      out.write("&bdate=");
      out.print(request.getParameter("booking_date"));
      out.write("\">Book Now</a>\r\n");
      out.write("   \t\t\t     ");
}else{ 
      out.write("Login To Book");
} 
      out.write("\r\n");
      out.write("   \t\t\t     </td>\r\n");
      out.write("   \t\t\t     <td><a href=\"javascript:void(0)\" onclick=\"get_trailer_videos(");
      out.print(rs.getInt("movie_id"));
      out.write(',');
      out.print(rs.getInt("theater_id"));
      out.write(")\">View Trailer</a></td>\r\n");
      out.write("   \t\t\t     <td><a href=\"cast.jsp?mid=");
      out.print(rs.getInt("movie_id"));
      out.write("\">View Caste/Crew</a></td>\r\n");
      out.write("   \t\t\t     </tr>\t \r\n");
      out.write("   \t\t\t     ");
 }
					
      out.write("\r\n");
      out.write("   \t\t\t     \r\n");
      out.write("   \t\t\t     </table>\r\n");
      out.write("   \t\t\t     \r\n");
      out.write("   \t\t\t   </div>\r\n");
      out.write("   \t\t\t</div>\r\n");
      out.write("   \t\t\t<div class=\"col-md-6 index-grids\">\r\n");
      out.write("   \t\t\t   <div class=\"grid1\">\r\n");
      out.write("   \t\t\t     <div id=\"trailers\" ></div>\r\n");
      out.write("   \t\t\t    \r\n");
      out.write("   \t\t\t     \r\n");
      out.write("   \t\t\t   </div>\r\n");
      out.write("   \t\t\t</div>\r\n");
      out.write("   \t\t\t\r\n");
      out.write("   \t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("   \t\t</div>\r\n");
      out.write("   \t\t\r\n");
      out.write("   \t\t\r\n");
      out.write("   \t\t  </div>\r\n");
      out.write("   \t\t  \r\n");
      out.write("   \t\t  </div>\r\n");
      out.write("   \t  </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   <div class=\"footer\">\r\n");
      out.write("   \t<div class=\"container\">\r\n");
      out.write("   \t \r\n");
      out.write("\t  <div class=\"footer_grids\">\r\n");
      out.write("\t     <div class=\"footer-grid\">\r\n");
      out.write("\t\t\t<h4>Ipsum Quis</h4>\r\n");
      out.write("\t\t\t<ul class=\"list1\">\r\n");
      out.write("\t\t\t\t<li><a href=\"contact.html\">Contact</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Mirum est</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Placerat facer</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Claritatem</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Sollemnes </a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <div class=\"footer-grid\">\r\n");
      out.write("\t\t\t<h4>Quis Ipsum</h4>\r\n");
      out.write("\t\t\t<ul class=\"list1\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Placerat facer</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Claritatem</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Sollemnes </a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Claritas</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Mirum est</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <div class=\"footer-grid last_grid\">\r\n");
      out.write("\t\t\t<h4>Follow Us</h4>\r\n");
      out.write("\t\t\t<ul class=\"footer_social wow fadeInLeft\" data-wow-delay=\"0.4s\">\r\n");
      out.write("\t\t\t  <li><a href=\"\"> <i class=\"fb\"> </i> </a></li>\r\n");
      out.write("\t\t\t  <li><a href=\"\"><i class=\"tw\"> </i> </a></li>\r\n");
      out.write("\t\t\t  <li><a href=\"\"><i class=\"google\"> </i> </a></li>\r\n");
      out.write("\t\t\t  <li><a href=\"\"><i class=\"u_tube\"> </i> </a></li>\r\n");
      out.write("\t\t \t</ul>\r\n");
      out.write("\t\t \t<div class=\"copy wow fadeInRight\" data-wow-delay=\"0.4s\">\r\n");
      out.write("              <p> &copy; 2016 movie booking. All rights reserved</p>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <div class=\"clearfix\"> </div>\r\n");
      out.write("\t   </div>\r\n");
      out.write("      </div>\r\n");
      out.write("   </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\t\t");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
