package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import com.bitm.action.DBConnectivity;
import java.sql.Connection;

public final class movies_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/header.jsp", out, false);
      out.write("\r\n");
      out.write("   \r\n");
      out.write("   <div class=\"content_top\">\r\n");
      out.write("   \t  <div class=\"container\">\r\n");
      out.write("   \t\t<div class=\"col-md-4 bottom_nav\">\r\n");
      out.write("   \t\t   <div class=\"content_menu\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("   \t</div>\r\n");
      out.write("   </div>\r\n");
      out.write("   <div class=\"content_middle\">\r\n");
      out.write("   \t  <div class=\"container\">\r\n");
      out.write("   \t    <div class=\"content_middle_box\">\r\n");
      out.write("          \r\n");
      out.write("   \t    <div class=\"middle_grid wow fadeInUp\" data-wow-delay=\"0.4s\">\r\n");
      out.write("   \t\t\t\r\n");
      out.write("   \t\t\t ");

 		String trailer="";
 		Connection con = DBConnectivity.getCon();
 		Statement st = con.createStatement();
 		ResultSet rs= st.executeQuery("select video_link from movie_trailer");
 		while(rs.next())
 		{trailer=rs.getString("video_link");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t    \r\n");
      out.write(" \t\t\t<div class=\"col-md-6 index-grids\">\r\n");
      out.write("   \t\t\t   <div class=\"grid1\">\r\n");
      out.write("   \t\t\t     <div class=\"index_img\"><video width=\"320\" height=\"240\" controls>\r\n");
      out.write("<source src=\"uploads/");
      out.print(trailer );
      out.write("\" type=\"video/mp4\">\r\n");
      out.write("<source src=\"uploads/");
      out.print(trailer );
      out.write("\" type=\"video/ogg\">\r\n");
      out.write("Your browser does not support the video tag.\r\n");
      out.write("</video></div>\r\n");
      out.write("   \t\t\t\t  <i class=\"m_home\"> </i>\r\n");
      out.write("                  \r\n");
      out.write("   \t\t\t\t  <div class=\"inner_wrap1\">\r\n");
      out.write("   \t\t\t\t \t<ul class=\"item_module\">\r\n");
      out.write("   \t\t\t\t \t \t\r\n");
      out.write("   \t\t\t\t \t \t<li class=\"module_right\">\r\n");
      out.write("   \t\t\t\t \t \t\t<img src=\"images/m_star.png\" class=\"img-responsive\" alt=\"\"/>\r\n");
      out.write("   \t\t\t\t \t \t\t\r\n");
      out.write("   \t\t\t\t \t \t\t<a href=\"single.html\" class=\"content_btn\">....read more</a>\r\n");
      out.write("   \t\t\t\t \t \t</li>\r\n");
      out.write("   \t\t\t\t \t \t<div class=\"clearfix\"> </div>\r\n");
      out.write("   \t\t\t\t \t </ul>\r\n");
      out.write("   \t\t\t\t  </div>\r\n");
      out.write("   \t\t\t   </div>\r\n");
      out.write("   \t\t\t</div>\r\n");
      out.write(" \t\t\t");

 		}
 		
      out.write("\r\n");
      out.write(" \t\t\r\n");
      out.write("   \t\t\t\r\n");
      out.write("   \t\t\t\r\n");
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
