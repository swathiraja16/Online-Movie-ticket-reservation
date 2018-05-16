package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import db.DBConnectivity;
import java.sql.Connection;

public final class movies_005fh_jsp extends org.apache.jasper.runtime.HttpJspBase
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

if(session.getAttribute("session_id")==null){
response.sendRedirect("index.jsp");
} 
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("Author: W3layouts\r\n");
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
      out.write("<title>Admin Pannel</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"Minimal Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<link href=\"css/style.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \r\n");
      out.write("<script src=\"js/jquery.min.js\"> </script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"> </script>\r\n");
      out.write("  \r\n");
      out.write("<!-- Mainly scripts -->\r\n");
      out.write("<script src=\"js/jquery.metisMenu.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.slimscroll.min.js\"></script>\r\n");
      out.write("<!-- Custom and plugin javascript -->\r\n");
      out.write("<link href=\"css/custom.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"js/custom.js\"></script>\r\n");
      out.write("<script src=\"js/screenfull.js\"></script>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t$(function () {\r\n");
      out.write("\t\t\t$('#supported').text('Supported/allowed: ' + !!screenfull.enabled);\r\n");
      out.write("\r\n");
      out.write("\t\t\tif (!screenfull.enabled) {\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t$('#toggle').click(function () {\r\n");
      out.write("\t\t\t\tscreenfull.toggle($('#container')[0]);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\r\n");
      out.write("<!----->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("     <!----->\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/nav.jsp", out, false);
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\t\t <div id=\"page-wrapper\" class=\"gray-bg dashbard-1\">\r\n");
      out.write("       <div class=\"content-main\">\r\n");
      out.write(" \r\n");
      out.write(" \t<!--banner-->\t\r\n");
      out.write("\t\t     <div class=\"banner\">\r\n");
      out.write("\t\t    \t<h2>\r\n");
      out.write("\t\t\t\t<a href=\"dashboard.jsp\">Home</a>\r\n");
      out.write("\t\t\t\t<i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("\t\t\t\t<span>Theaters</span>\r\n");
      out.write("\t\t\t\t</h2>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t<!--//banner-->\r\n");
      out.write(" \t<!--grid-->\r\n");
      out.write(" \t<div class=\"grid-form\">\r\n");
      out.write(" \t\t<div class=\"grid-form1\">\r\n");
      out.write(" \t\t<h3 id=\"forms-example\" class=\"\">Movies History</h3>\r\n");
      out.write(" \t\t");
if(request.getParameter("status")!=null){
      out.write("<span style=\"color: red\">");
      out.print(request.getParameter("status") );
      out.write("</span>");
} 
      out.write("\r\n");
      out.write(" \t\t\r\n");
      out.write("<table class=\"table table-bordered table-striped\">\r\n");
      out.write("<tr><th>SlNo</th><th>Movie Name</th><th>Theater</th><th>Release Date</th></tr>\r\n");
 int i=1;
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

      out.write("\r\n");
      out.write("<tr><th>");
      out.print(i++ );
      out.write("</th><th>");
      out.print(movie_name);
      out.write("</th><th>");
      out.print(theater_name );
      out.write("</th><th>");
      out.print(rs.getString("start_date") );
      out.write("</th></tr>\r\n");
} 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!----->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write(" \t</div>\r\n");
      out.write(" \t<!--//grid-->\r\n");
      out.write("\t\t<!---->\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("       </div>\r\n");
      out.write("     <!--scrolling js-->\r\n");
      out.write("\t<script src=\"js/jquery.nicescroll.js\"></script>\r\n");
      out.write("\t<script src=\"js/scripts.js\"></script>\r\n");
      out.write("\t<!--//scrolling js-->\r\n");
      out.write("<!---->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
