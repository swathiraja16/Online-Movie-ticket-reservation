package org.apache.jsp.admin.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class nav_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<nav class=\"navbar-default navbar-static-top\" role=\"navigation\">\r\n");
      out.write("             <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("               <h1> <a class=\"navbar-brand\" href=\"index.html\">Admin Pannel</a></h1>         \r\n");
      out.write("\t\t\t   </div>\r\n");
      out.write("\t\t\t <div class=\" border-bottom\">\r\n");
      out.write("        \t<div class=\"full-left\">\r\n");
      out.write("        \t  <section class=\"full-top\">\r\n");
      out.write("\t\t\t\t<button id=\"toggle\"><i class=\"fa fa-arrows-alt\"></i></button>\t\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\t\r\n");
      out.write("            <div class=\"clearfix\"> </div>\r\n");
      out.write("           </div>\r\n");
      out.write("     \r\n");
      out.write("       \r\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t   <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("\t\t    <div class=\"drop-men\" >\r\n");
      out.write("\t\t        <ul class=\" nav_1\">\r\n");
      out.write("\t\t           \r\n");
      out.write("\t\t    \t\t\r\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\">\r\n");
      out.write("\t\t              <a href=\"#\" class=\"dropdown-toggle dropdown-at\" data-toggle=\"dropdown\"><span class=\" name-caret\">");
      out.print(session.getAttribute("session_name") );
      out.write("<i class=\"caret\"></i></span><img src=\"images/wo.jpg\"></a>\r\n");
      out.write("\t\t              <ul class=\"dropdown-menu \" role=\"menu\">\r\n");
      out.write("\t\t               \r\n");
      out.write("\t\t                <li><a href=\"logout.jsp\"><i class=\"fa fa-clipboard\"></i>Logout</a></li>\r\n");
      out.write("\t\t              </ul>\r\n");
      out.write("\t\t            </li>\r\n");
      out.write("\t\t           \r\n");
      out.write("\t\t        </ul>\r\n");
      out.write("\t\t     </div><!-- /.navbar-collapse -->\r\n");
      out.write("\t\t\t<div class=\"clearfix\">\r\n");
      out.write("       \r\n");
      out.write("     </div>\r\n");
      out.write("\t  \r\n");
      out.write("\t\t    <div class=\"navbar-default sidebar\" role=\"navigation\">\r\n");
      out.write("                <div class=\"sidebar-nav navbar-collapse\">\r\n");
      out.write("                <ul class=\"nav\" id=\"side-menu\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"dashboard.jsp\" class=\" hvr-bounce-to-right\"><i class=\"fa fa-dashboard nav_icon \"></i><span class=\"nav-label\">Dashboards</span> </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                   \r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\" class=\" hvr-bounce-to-right\"><i class=\"fa fa-indent nav_icon\"></i> <span class=\"nav-label\">Theaters</span><span class=\"fa arrow\"></span></a>\r\n");
      out.write("                        <ul class=\"nav nav-second-level\">\r\n");
      out.write("                            <li><a href=\"theater_add.jsp\" class=\" hvr-bounce-to-right\"> <i class=\"fa fa-area-chart nav_icon\"></i>Add Theater</a></li>\r\n");
      out.write("                            \r\n");
      out.write("                            <li><a href=\"theater_view.jsp\" class=\" hvr-bounce-to-right\"><i class=\"fa fa-map-marker nav_icon\"></i>View Theaters</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t   </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\" class=\" hvr-bounce-to-right\"><i class=\"fa fa-indent nav_icon\"></i> <span class=\"nav-label\">Movies</span><span class=\"fa arrow\"></span></a>\r\n");
      out.write("                        <ul class=\"nav nav-second-level\">\r\n");
      out.write("                            <li><a href=\"movie_add.jsp\" class=\" hvr-bounce-to-right\"> <i class=\"fa fa-area-chart nav_icon\"></i>Add Movie</a></li>\r\n");
      out.write("                            \r\n");
      out.write("                            <li><a href=\"movie_view.jsp\" class=\" hvr-bounce-to-right\"><i class=\"fa fa-map-marker nav_icon\"></i>View Movies</a></li>\r\n");
      out.write("                            \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t   </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\" class=\" hvr-bounce-to-right\"><i class=\"fa fa-indent nav_icon\"></i> <span class=\"nav-label\">Movie In Theater</span><span class=\"fa arrow\"></span></a>\r\n");
      out.write("                        <ul class=\"nav nav-second-level\">\r\n");
      out.write("                            <li><a href=\"movie_update.jsp\" class=\" hvr-bounce-to-right\"> <i class=\"fa fa-area-chart nav_icon\"></i>Update</a></li>\r\n");
      out.write("                            \r\n");
      out.write("                            <li><a href=\"movie_update_view.jsp\" class=\" hvr-bounce-to-right\"><i class=\"fa fa-map-marker nav_icon\"></i>View Movies In Theater</a></li>\r\n");
      out.write("                           \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t   </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"movies_h.jsp\" class=\" hvr-bounce-to-right\"><i class=\"fa fa-picture-o nav_icon\"></i> <span class=\"nav-label\">Movies History</span> </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                     \r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("        </nav>");
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
