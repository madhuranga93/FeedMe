package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class products_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("      \n");
      out.write("   ");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>FEEDME</title>\n");
      out.write("\n");
      out.write("\t<link rel=\"stylesheet\" href=\"font-awesome/css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"wrapper\"> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"topbar clearfix\">\n");
      out.write("\n");
      out.write("<div class=\"head\">\n");
      out.write("  <font face=\"verdana\" size=\"10\" color=\"orange\">\n");
      out.write("<marquee behavior=\"scroll\" direction=\"left\"><b>FEED ME</b></marquee>\n");
      out.write("</font>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"logo\">\n");
      out.write("  \n");
      out.write("\n");
      out.write("</div>\n");
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
      out.write("\t\t\t\t\t<li><a href=\" href\" = \"###\" >Back</a></li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</font>\n");
      out.write("\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div><!--subbar-->\n");
      out.write("\n");
      out.write("  <div class=\"table\">\n");
      out.write("       <table border=\"0\" >\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<th>PRODUCT</th>\n");
      out.write("<th>IMAGE</th>\n");
      out.write("<th>PRICE(Rs)</th>\n");
      out.write("<th>QTY</th>\n");
      out.write("<th>ADDTOCART</th>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("<td>malith</td>\n");
      out.write("\n");
      out.write("<td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.availableqty}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("<td> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("<td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("<td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("\n");
      out.write("</div><!--table-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
