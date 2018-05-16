package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--pie-chart--->\r\n");
      out.write("<script src=\"js/pie-chart.js\" type=\"text/javascript\"></script>\r\n");
      out.write(" <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("        $(document).ready(function () {\r\n");
      out.write("            $('#demo-pie-1').pieChart({\r\n");
      out.write("                barColor: '#3bb2d0',\r\n");
      out.write("                trackColor: '#eee',\r\n");
      out.write("                lineCap: 'round',\r\n");
      out.write("                lineWidth: 8,\r\n");
      out.write("                onStep: function (from, to, percent) {\r\n");
      out.write("                    $(this.element).find('.pie-value').text(Math.round(percent) + '%');\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#demo-pie-2').pieChart({\r\n");
      out.write("                barColor: '#fbb03b',\r\n");
      out.write("                trackColor: '#eee',\r\n");
      out.write("                lineCap: 'butt',\r\n");
      out.write("                lineWidth: 8,\r\n");
      out.write("                onStep: function (from, to, percent) {\r\n");
      out.write("                    $(this.element).find('.pie-value').text(Math.round(percent) + '%');\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $('#demo-pie-3').pieChart({\r\n");
      out.write("                barColor: '#ed6498',\r\n");
      out.write("                trackColor: '#eee',\r\n");
      out.write("                lineCap: 'square',\r\n");
      out.write("                lineWidth: 8,\r\n");
      out.write("                onStep: function (from, to, percent) {\r\n");
      out.write("                    $(this.element).find('.pie-value').text(Math.round(percent) + '%');\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("           \r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("<!--skycons-icons-->\r\n");
      out.write("<script src=\"js/skycons.js\"></script>\r\n");
      out.write("<!--//skycons-icons-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("<!----->\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/nav.jsp", out, false);
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"page-wrapper\" class=\"gray-bg dashbard-1\">\r\n");
      out.write("       <div class=\"content-main\">\r\n");
      out.write(" \r\n");
      out.write("  \t\t<!--banner-->\t\r\n");
      out.write("\t\t    <div class=\"banner\">\r\n");
      out.write("\t\t   \r\n");
      out.write("\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t<a href=\"dashbaord.jsp\">Home</a>\r\n");
      out.write("\t\t\t\t<i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("\t\t\t\t<span>Dashboard</span>\r\n");
      out.write("\t\t\t\t</h2>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t<!--//banner-->\r\n");
      out.write("\t\t<!--content-->\r\n");
      out.write("\t\t<div class=\"content-top\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!---->\r\n");
      out.write("\t\r\n");
      out.write("  \r\n");
      out.write("\t\t<div class=\"content-mid\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"col-md-7 mid-content-top\">\r\n");
      out.write("\t\t\t\t<div class=\"middle-content\">\r\n");
      out.write("\t\t\t\t\t<h3>Latest Images</h3>\r\n");
      out.write("\t\t\t\t\t<!-- start content_slider -->\r\n");
      out.write("\t\t<div id=\"owl-demo\" class=\"owl-carousel text-center\">\r\n");
      out.write("\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t<img class=\"lazyOwl img-responsive\" data-src=\"images/na.jpg\" alt=\"name\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t<img class=\"lazyOwl img-responsive\" data-src=\"images/na1.jpg\" alt=\"name\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t<img class=\"lazyOwl img-responsive\" data-src=\"images/na2.jpg\" alt=\"name\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t<img class=\"lazyOwl img-responsive\" data-src=\"images/na.jpg\" alt=\"name\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t<img class=\"lazyOwl img-responsive\" data-src=\"images/na1.jpg\" alt=\"name\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t<img class=\"lazyOwl img-responsive\" data-src=\"images/na2.jpg\" alt=\"name\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t<img class=\"lazyOwl img-responsive\" data-src=\"images/na.jpg\" alt=\"name\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--//sreen-gallery-cursual---->\r\n");
      out.write("\t\t<!-- requried-jsfiles-for owl -->\r\n");
      out.write("\t\t<link href=\"css/owl.carousel.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<script src=\"js/owl.carousel.js\"></script>\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t\t\t$(\"#owl-demo\").owlCarousel({\r\n");
      out.write("\t\t\t\t\t\titems : 3,\r\n");
      out.write("\t\t\t\t\t\tlazyLoad : true,\r\n");
      out.write("\t\t\t\t\t\tautoPlay : true,\r\n");
      out.write("\t\t\t\t\t\tpagination : true,\r\n");
      out.write("\t\t\t\t\t\tnav:true,\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t<!-- //requried-jsfiles-for owl -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!----->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!--//content-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t \r\n");
      out.write("\t\t<!---->\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("       </div>\r\n");
      out.write("     </div>\r\n");
      out.write("<!---->\r\n");
      out.write("<!--scrolling js-->\r\n");
      out.write("\t<script src=\"js/jquery.nicescroll.js\"></script>\r\n");
      out.write("\t<script src=\"js/scripts.js\"></script>\r\n");
      out.write("\t<!--//scrolling js-->\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"> </script>\r\n");
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
