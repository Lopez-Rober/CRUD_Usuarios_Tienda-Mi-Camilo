package org.apache.jsp.Productos;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modificar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Productos</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>Modificar Registro</h2>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <form action=\"\" method=\"POST\" autocomplete=\"off\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("                <input prod_id=\"prod_id\" name=\"id\" type=\"hidden\" />\n");
      out.write("            \n");
      out.write("            <p>\n");
      out.write("                Precio\n");
      out.write("                <input prod_precio=\"prod_precio\" name=\"prod_precio\" type=\"text\" />\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                Categoria\n");
      out.write("                <input cat_id=\"cat_id\" name=\"cat_id\" type=\"text\" />\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                Nombre\n");
      out.write("                <input prod_nombre=\"prod_nombre\" name=\"prod_nombre\" type=\"text\" />\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                Marca\n");
      out.write("                <input marca_id=\"marca_id\" name=\"marca_id\" type=\"text\" />\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                Stock\n");
      out.write("                <input prod_stock=\"prod_stock\" name=\"prod_stock\" type=\"text\" />\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                Proveedor\n");
      out.write("                <input prov_id=\"prov_id\" name=\"prov_id\" type=\"text\" />\n");
      out.write("            </p>\n");
      out.write("            \n");
      out.write("            <button id=\"guardar\" name=\"guardar\" type=\"submit\">Guardar</button>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
