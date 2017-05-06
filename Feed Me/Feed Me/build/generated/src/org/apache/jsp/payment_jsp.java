package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>FEEDME</title>\n");
      out.write("\n");
      out.write("\t<link rel=\"stylesheet\" href=\"font-awesome/css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/here.css\">\n");
      out.write("        \n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"wrapper clearfix\"> \n");
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
      out.write("\t\t\t\t\t<li><a href=\" product.jsp\" >Back</a></li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</font>\n");
      out.write("\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div><!--subbar-->\n");
      out.write("\n");
      out.write("<div class=\"visa\">\n");
      out.write("   \n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"payment\">\n");
      out.write("     <font face=\"verdana\" size=\"2\" color=\"white\">\n");
      out.write("     \n");
      out.write("     <div class=\"total\">\n");
      out.write("    TOTAL : RS.3980.00 <br/>\n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("   <input type=\"radio\" name=\"gender\" value=\"male\"> CASH ON DELIVERY<br>\n");
      out.write("   <pre>\n");
      out.write("\n");
      out.write("\n");
      out.write("   DELIVERY ADDRESS: <td><input type=\"text\" name=\"m\" /></td><br/>\n");
      out.write("   </pre>\n");
      out.write("  <input type=\"radio\" name=\"gender\" value=\"female\"> PAY NOW<br>\n");
      out.write("  <pre>\n");
      out.write("\n");
      out.write("\n");
      out.write("   CARD NUMBER:<td>      <input type=\"text\" name=\"m\" /></td><br/>\n");
      out.write("   CVV NUMBER:<td>       <input type=\"text\" name=\"m\" /></td><br/>\n");
      out.write("   CONTACT NUMBER:<td>   <input type=\"text\" name=\"m\" /></td><br/>\n");
      out.write("\n");
      out.write("\n");
      out.write("  </pre>\n");
      out.write("  <img src=\"img/paynow.png\" alt=\"Smiley face\">\n");
      out.write("    </font>\n");
      out.write("    \n");
      out.write("</div><!--payment-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"here\">\n");
      out.write("\n");
      out.write("    Your Location:\n");
      out.write("   <a href=\"location2.jsp\">\n");
      out.write("<img border=\"0\"  src=\"img/here.png\" width=\"100\" height=\"100\">\n");
      out.write("</a>\n");
      out.write("\n");
      out.write("</div><!--here-->\n");
      out.write("\n");
      out.write("</div><!--wrapper-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
