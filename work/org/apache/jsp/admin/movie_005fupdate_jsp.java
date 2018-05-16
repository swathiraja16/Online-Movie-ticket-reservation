package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import db.DBConnectivity;
import java.sql.Connection;

public final class movie_005fupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \t\t<h3 id=\"forms-example\" class=\"\">Add Theater</h3>\r\n");
      out.write(" \t\t");
if(request.getParameter("status")!=null){
      out.write("<span style=\"color: red\">");
      out.print(request.getParameter("status") );
      out.write("</span>");
} 
      out.write("\r\n");
      out.write(" \t\t<form action=\"movie_update_save.jsp\">\r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <label for=\"exampleInputEmail1\">Theater Name</label>\r\n");
      out.write("    <select class=\"form-control\" id=\"theater\" name=\"theater\" placeholder=\"Theater Name\" required=\"required\">\r\n");
      out.write("    <option value=\"\"></option>\r\n");
      out.write("    ");

    Connection con = DBConnectivity.getCon();
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("select theater_id, theater_name, place, theater_status, no_seats from theater");
    while(rs.next())
    {
    
      out.write("\r\n");
      out.write("    <option value=\"");
      out.print(rs.getInt("theater_id"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("theater_name"));
      out.write("</option>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    </select>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <label for=\"exampleInputPassword1\">Movie Name</label>\r\n");
      out.write("    <select class=\"form-control\" id=\"movie\" name=\"movie\" placeholder=\"Movie\" required=\"required\">\r\n");
      out.write("     <option value=\"\"></option>\r\n");
      out.write("    ");

    Statement st1 = con.createStatement();
    ResultSet rs1 = st1.executeQuery("select movie_id, movie_name, release_date, movie_status from movies");
    while(rs1.next())
    {
    
      out.write("\r\n");
      out.write("    <option value=\"");
      out.print(rs1.getInt("movie_id"));
      out.write('"');
      out.write('>');
      out.print(rs1.getString("movie_name"));
      out.write("</option>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    </select>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <label for=\"exampleInputEmail1\">Start Date</label>\r\n");
      out.write("    <input type=\"date\" class=\"form-control\" id=\"date\" name=\"date\" placeholder=\"Release Date\" required=\"required\">\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <button type=\"submit\" class=\"btn btn-default\">Submit</button>\r\n");
      out.write("</form>\r\n");
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
