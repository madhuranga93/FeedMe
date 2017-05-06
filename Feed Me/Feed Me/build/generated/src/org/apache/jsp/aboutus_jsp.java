package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>FEEDME</title>\n");
      out.write("\n");
      out.write("\t<link rel=\"stylesheet\" href=\"font-awesome/css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/aboutus.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"wrapper\"> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"topbar clearfix\">\n");
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
      out.write("                                        <li><a href=\"index.jsp\" >BACK</a></li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</font>\n");
      out.write("\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div><!--subbar-->\n");
      out.write("\n");
      out.write("\n");
      out.write("      \n");
      out.write("<div class=\"about\">\n");
      out.write("    \n");
      out.write("    <font face=\"verdana\" size=\"10\" color=\"orange\">\n");
      out.write("    <pre>\n");
      out.write("\n");
      out.write("             ABOUT-US\n");
      out.write("    </pre>\n");
      out.write("    </font>\n");
      out.write("    \n");
      out.write("             <font face=\"verdana\" size=\"5\" color=\"white\">\n");
      out.write("    <pre>\n");
      out.write("   Ever felt like your options are limited when it comes to food?\n");
      out.write("   Well not anymore! Feed Me let's you order your deepest cravings\n");
      out.write("   from all the suppliers at the same time and get them delivered\n");
      out.write("   to your doorstep.\n");
      out.write("\n");
      out.write("   We are the only fast food portal available around and we are \n");
      out.write("   joined with all the big bosses when it comes to fast food.Our \n");
      out.write("   delivery service has expanded almost over every city in western \n");
      out.write("   province and we just keep growing.\n");
      out.write("\n");
      out.write("   Feed Me,Everything that makes you fat at your doorstep.\n");
      out.write("   \n");
      out.write("    </pre>\n");
      out.write("    </font>\n");
      out.write("</div>\n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("\n");
      out.write("\t\n");
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
