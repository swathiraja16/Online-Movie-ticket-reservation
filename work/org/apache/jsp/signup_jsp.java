package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import com.bitm.action.DBConnectivity;
import java.sql.Connection;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("           <script type=\"text/javascript\">\r\n");
      out.write(" \r\n");
      out.write("        function onlyAlphabets(e, t) {\r\n");
      out.write("            try {\r\n");
      out.write("                if (window.event) {\r\n");
      out.write("                    var charCode = window.event.keyCode;\r\n");
      out.write("                }\r\n");
      out.write("                else if (e) {\r\n");
      out.write("                    var charCode = e.which;\r\n");
      out.write("                }\r\n");
      out.write("                else { return true; }\r\n");
      out.write("                if ((charCode > 64 && charCode < 91) || (charCode > 96 && charCode < 123))\r\n");
      out.write("                    return true;\r\n");
      out.write("                else\r\n");
      out.write("                    return false;\r\n");
      out.write("            }\r\n");
      out.write("            catch (err) {\r\n");
      out.write("                alert(err.Description);\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        function isNumberKeyevent(evt) //onkeypress=\"return isNumberKeyevent(event)\"\r\n");
      out.write("        {\r\n");
      out.write("        var charCode = (evt.which) ? evt.which : event.keyCode\r\n");
      out.write("        if (charCode > 31 && (charCode < 48 || charCode > 57))\r\n");
      out.write("        return false;\r\n");
      out.write("        return true;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        </script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("/**\r\n");
      out.write(" * DHTML phone number validation script. Courtesy of SmartWebby.com (http://www.smartwebby.com/dhtml/)\r\n");
      out.write(" */\r\n");
      out.write("\r\n");
      out.write("// Declaring required variables\r\n");
      out.write("var digits = \"0123456789\";\r\n");
      out.write("// non-digit characters which are allowed in phone numbers\r\n");
      out.write("var phoneNumberDelimiters = \"()- \";\r\n");
      out.write("// characters which are allowed in international phone numbers\r\n");
      out.write("// (a leading + is OK)\r\n");
      out.write("var validWorldPhoneChars = phoneNumberDelimiters + \"+\";\r\n");
      out.write("// Minimum no of digits in an international phone no.\r\n");
      out.write("var minDigitsInIPhoneNumber = 10;\r\n");
      out.write("\r\n");
      out.write("function isInteger(s)\r\n");
      out.write("{   var i;\r\n");
      out.write("    for (i = 0; i < s.length; i++)\r\n");
      out.write("    {   \r\n");
      out.write("        // Check that current character is number.\r\n");
      out.write("        var c = s.charAt(i);\r\n");
      out.write("        if (((c < \"0\") || (c > \"9\"))) return false;\r\n");
      out.write("    }\r\n");
      out.write("    // All characters are numbers.\r\n");
      out.write("    return true;\r\n");
      out.write("}\r\n");
      out.write("function trim(s)\r\n");
      out.write("{   var i;\r\n");
      out.write("    var returnString = \"\";\r\n");
      out.write("    // Search through string's characters one by one.\r\n");
      out.write("    // If character is not a whitespace, append to returnString.\r\n");
      out.write("    for (i = 0; i < s.length; i++)\r\n");
      out.write("    {   \r\n");
      out.write("        // Check that current character isn't whitespace.\r\n");
      out.write("        var c = s.charAt(i);\r\n");
      out.write("        if (c != \" \") returnString += c;\r\n");
      out.write("    }\r\n");
      out.write("    return returnString;\r\n");
      out.write("}\r\n");
      out.write("function stripCharsInBag(s, bag)\r\n");
      out.write("{   var i;\r\n");
      out.write("    var returnString = \"\";\r\n");
      out.write("    // Search through string's characters one by one.\r\n");
      out.write("    // If character is not in bag, append to returnString.\r\n");
      out.write("    for (i = 0; i < s.length; i++)\r\n");
      out.write("    {   \r\n");
      out.write("        // Check that current character isn't whitespace.\r\n");
      out.write("        var c = s.charAt(i);\r\n");
      out.write("        if (bag.indexOf(c) == -1) returnString += c;\r\n");
      out.write("    }\r\n");
      out.write("    return returnString;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function checkInternationalPhone(strPhone){\r\n");
      out.write("var bracket=3\r\n");
      out.write("strPhone=trim(strPhone)\r\n");
      out.write("if(strPhone.indexOf(\"+\")>1) return false\r\n");
      out.write("if(strPhone.indexOf(\"-\")!=-1)bracket=bracket+1\r\n");
      out.write("if(strPhone.indexOf(\"(\")!=-1 && strPhone.indexOf(\"(\")>bracket)return false\r\n");
      out.write("var brchr=strPhone.indexOf(\"(\")\r\n");
      out.write("if(strPhone.indexOf(\"(\")!=-1 && strPhone.charAt(brchr+2)!=\")\")return false\r\n");
      out.write("if(strPhone.indexOf(\"(\")==-1 && strPhone.indexOf(\")\")!=-1)return false\r\n");
      out.write("s=stripCharsInBag(strPhone,validWorldPhoneChars);\r\n");
      out.write("return (isInteger(s) && s.length >= minDigitsInIPhoneNumber);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function ValidateForm(){\r\n");
      out.write("\tvar Phone=document.getElementById(\"mobile\").value;\r\n");
      out.write("\t\r\n");
      out.write("\tif ((Phone==null)||(Phone==\"\")){\r\n");
      out.write("\t\t//alert(\"Please Enter your Phone Number\")\r\n");
      out.write("\t\tdocument.getElementById(\"err_mob\").innerHTML=\"enter the mobile number\";\r\n");
      out.write("\t\t//Phone.focus()\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tdocument.getElementById(\"err_mob\").innerHTML=\"\";\r\n");
      out.write("\tif (checkInternationalPhone(Phone)==false){\r\n");
      out.write("\t\t//alert(\"Please Enter a Valid Phone Number\")\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"err_mob\").innerHTML=\"invalid mobile number\";\r\n");
      out.write("\r\n");
      out.write("\t\t//Phone.value=\"\"\r\n");
      out.write("\t\t//Phone.focus()\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tdocument.getElementById(\"err_mob\").innerHTML=\"\";\r\n");
      out.write("\treturn true;\r\n");
      out.write(" }\r\n");
      out.write("</script>\r\n");
      out.write("        \r\n");
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
      out.write("   \t   <div class=\"login-bottom\">\r\n");
      out.write("\t\t\t<h2>Register</h2>\r\n");
      out.write("\t\t\t<form action='signup_save.jsp'>\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr><td>Name</td><td><input type=\"text\" placeholder=\"Name\" name='name' id='name' required=\"\" onkeypress=\"return onlyAlphabets(event,this);\"/></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>Mobile</td><td><input type=\"text\" maxlength=\"10\" placeholder=\"Mobile\" name='mobile' id='mobile' required=\"\" onblur=\"ValidateForm();\" onkeypress=\"return isNumberKeyevent(event)\" /></td><td><span id=\"err_mob\" style=\"color:red\"></span></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>Email</td><td><input type=\"email\" placeholder=\"Email\" name='email' id='email' required=\"\"></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>Password</td><td><input type=\"password\" placeholder=\"Password\" name='password' id='password' required=\"\"></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>Dob</td><td><input type=\"date\" placeholder=\"\" name='dob' id='dob' required=\"\"></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>Qualification</td><td><input type=\"text\" placeholder=\"\" name='qua' id='qua' required=\"\"></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>Gender</td><td><select placeholder=\"\" name='gender' id='gender' required=\"\">\r\n");
      out.write("\t\t\t\t\t<option value=\"Male\">Male</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"FeMale\">FeMale</option>\r\n");
      out.write("\t\t\t\t\t</select></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>&nbsp;</td></tr>\r\n");
      out.write("\t\t\t</table>\t\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-6 login-do\">\r\n");
      out.write("\t\t\t\t<label class=\"hvr-shutter-in-horizontal login-sub\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"Submit\">\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t<p>Already register</p>\r\n");
      out.write("\t\t\t\t<a href=\"index.jsp\" class=\"hvr-shutter-in-horizontal\">Login</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("   \t\t\r\n");
      out.write("   \t\t\r\n");
      out.write("   \t\t  </div>\r\n");
      out.write("   \t\t  \r\n");
      out.write("   \t\t  </div>\r\n");
      out.write("   \t  </div>\r\n");
      out.write("   </div>\r\n");
      out.write("   \r\n");
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
