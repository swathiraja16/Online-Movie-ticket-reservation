package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import com.bitm.action.DBConnectivity;
import java.sql.Connection;

public final class get_005ftrailers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   \t    \t\t    ");

 		String trailer="";
 		Connection con = DBConnectivity.getCon();
 		Statement st = con.createStatement();
 		ResultSet rs= st.executeQuery("select trailer,video_link from movie_trailer where movie_id='"+request.getParameter("mid")+"'");
 		while(rs.next())
 		{
 			trailer=rs.getString("video_link");
      out.write("\r\n");
      out.write(" \t\t\t<video width=\"320\" height=\"240\" controls>\r\n");
      out.write("  <source src=\"uploads/");
      out.print(trailer );
      out.write("\" type=\"video/mp4\">\r\n");
      out.write("  <source src=\"uploads/");
      out.print(trailer );
      out.write("\" type=\"video/ogg\">\r\n");
      out.write("  Your browser does not support the video tag.\r\n");
      out.write("</video>\r\n");
      out.write("   \t\t\t     \r\n");
      out.write("   \t\t\t   \r\n");
      out.write("   \t\t\t");

 		}
 		
      out.write("\r\n");
      out.write("   \t\t\t");
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
