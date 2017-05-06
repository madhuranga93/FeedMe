package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class location2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>FEEDME</title>\n");
      out.write("\n");
      out.write("\t<link rel=\"stylesheet\" href=\"font-awesome/css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/location.css\">\n");
      out.write("  \n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"wrapper2\"> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"topbar clearfix\">\n");
      out.write("\n");
      out.write("<div class=\"head clearfix\">\n");
      out.write("    \n");
      out.write("    <div class=\"head1\">\n");
      out.write("      <img src=\"img/logo2.PNG\" alt=\"\" height=\"75\" width=\"75\">  \n");
      out.write("    </div><!--head1-->\n");
      out.write("    \n");
      out.write("    <div class=\"head2\">\n");
      out.write("  <font face=\"verdana\" size=\"10\" color=\"orange\">\n");
      out.write("  <b>FEED ME</b>\n");
      out.write("  </font>\n");
      out.write("\n");
      out.write("  </div><!--head2-->\n");
      out.write("  \n");
      out.write("</div><!--head-->\n");
      out.write("\n");
      out.write("<div class=\"social\">\n");
      out.write("      \n");
      out.write("      <ul>\n");
      out.write("          \n");
      out.write("          <li><a href=\" href\" = \"###\" ><i class=\"fa fa-linkedin\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("          <li><a href=\" href\" = \"###\" ><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("          <li><a href=\" href\" = \"###\" ><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("          <li><a href=\" href\" = \"###\" ><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("    </div><!--social-->\n");
      out.write("</div><!--topbar-->\n");
      out.write("<div class=\"subbar clearfix\">\n");
      out.write("\n");
      out.write("\t<ul>\n");
      out.write("\t\t\t\t\t<font face=\"verdana\" >\n");
      out.write("\t\t\t\t\t<li><a href=\" index.jsp\" >Back</a></li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</font>\n");
      out.write("\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div><!--subbar-->\n");
      out.write("\n");
      out.write("<div class=\"location\">\n");
      out.write("    \n");
      out.write("<iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3960.7653724456427!2d79.85907391431776!3d6.918629295001002!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3ae2596d3ca2d54f%3A0xf3a764ad87fa9bfd!2sAPIIT+City+Campus!5e0!3m2!1sen!2slk!4v1485232706221\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div><!--wrapper-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
