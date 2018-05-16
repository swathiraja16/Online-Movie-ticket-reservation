package org.apache.jsp.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div class=\"header\">\r\n");
      out.write("\t\t   <div class=\"col-sm-8 header-left\">\r\n");
      out.write("\t\t\t\t\t <div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"index.html\" style=\"font-size: 25px\">MOVIE BOOKING</a>\r\n");
      out.write("\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t <div class=\"menu\">\r\n");
      out.write("\t\t\t\t\t\t  <a class=\"toggleMenu\" href=\"#\"><img src=\"images/nav.png\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t    <ul class=\"nav\" id=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t    \t<li class=\"active\"><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t    \t<li><a href=\"movies.jsp\">Movies</a></li>\r\n");
      out.write("\t\t\t\t\t\t    \t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t<script type=\"text/javascript\" src=\"js/responsive-nav.js\"></script>\r\n");
      out.write("\t\t\t\t    </div>\t\r\n");
      out.write("\t\t\t\t     <!-- start search-->\r\n");
      out.write("\t\t\t\t      <div class=\"search-box\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"sb-search\" class=\"sb-search\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"sb-search-input\" placeholder=\"Enter your search term...\" type=\"search\" name=\"search\" id=\"search\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"sb-search-submit\" type=\"submit\" value=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"sb-icon-search\"> </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!----search-scripts---->\r\n");
      out.write("\t\t\t\t\t\t<script src=\"js/classie.js\"></script>\r\n");
      out.write("\t\t\t\t\t\t<script src=\"js/uisearch.js\"></script>\r\n");
      out.write("\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\tnew UISearch( document.getElementById( 'sb-search' ) );\r\n");
      out.write("\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t<!----//search-scripts---->\t\t\t\t\t\t\r\n");
      out.write("\t    \t\t    <div class=\"clearfix\"></div>\r\n");
      out.write("\t    \t    </div>\r\n");
      out.write("\t            <div class=\"col-sm-4 header_right\">\r\n");
      out.write("\t    \t\t      ");
 if(session.getAttribute("session_id")==null){ 
      out.write("\r\n");
      out.write("\t    \t\t      <div id=\"loginContainer\"><a href=\"#\" id=\"loginButton\"><img src=\"images/login.png\"><span>Login</span></a>\r\n");
      out.write("\t\t\t\t\t\t    <div id=\"loginBox\">                \r\n");
      out.write("\t\t\t\t\t\t        <form id=\"loginForm\" action=\"check.jsp\">\r\n");
      out.write("\t\t\t\t\t\t                <fieldset id=\"body\">\r\n");
      out.write("\t\t\t\t\t\t                \t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t                          <label for=\"email\">Email Address</label>\r\n");
      out.write("\t\t\t\t\t\t                          <input type=\"text\" name=\"email\" id=\"email\">\r\n");
      out.write("\t\t\t\t\t\t                    </fieldset>\r\n");
      out.write("\t\t\t\t\t\t                    <fieldset>\r\n");
      out.write("\t\t\t\t\t\t                            <label for=\"password\">Password</label>\r\n");
      out.write("\t\t\t\t\t\t                            <input type=\"password\" name=\"password\" id=\"password\">\r\n");
      out.write("\t\t\t\t\t\t                     </fieldset>\r\n");
      out.write("\t\t\t\t\t\t                    <input type=\"submit\" id=\"login\" value=\"Sign in\">\r\n");
      out.write("\t\t\t\t\t\t                \t\r\n");
      out.write("\t\t\t\t\t\t            \t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t                 <span><a href=\"signup.jsp\">Signup?</a></span>\r\n");
      out.write("\t\t\t\t\t\t\t      </form>\r\n");
      out.write("\t\t\t\t              </div>\r\n");
      out.write("\t\t\t             </div>\r\n");
      out.write("\t\t\t             ");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t              <a href=\"logout.jsp\" id=\"loginButton\"><div id=\"loginContainer\"><a href=\"logout.jsp\" id=\"loginButton\"><img src=\"images/login.png\"><span>");
      out.print(session.getAttribute("session_name") );
      out.write(" | Logout</span></a></div></a>\r\n");
      out.write("\t\t\t             ");
} 
      out.write("\r\n");
      out.write("\t\t                 <div class=\"clearfix\"></div>\r\n");
      out.write("\t                 </div>\r\n");
      out.write("\t                <div class=\"clearfix\"></div>\r\n");
      out.write("   </div>");
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
