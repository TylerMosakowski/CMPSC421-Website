package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;

public final class roster_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title></title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        \n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("    \twindow.onload = function(){\n");
      out.write("                //JSP compiler adds an empty line before the xml content.\n");
      out.write("                //we manually remove it.\n");
      out.write("\t        var content = $.trim($('#rosterDIV').html());\n");
      out.write("                //now remove the div element that is no longer needed\n");
      out.write("                $('#rosterDIV').remove();\n");
      out.write("                // parse the xml\n");
      out.write("                content = $.parseJSON(content);\n");
      out.write("                //below is specific to the output of the JavaBeans XMLEncoder\n");
      out.write("            \n");
      out.write("                $(content.java.array.void)\n");
      out.write("                  // search for all <object> elements\n");
      out.write("                  //.find('object')\n");
      out.write("                  // now we can play with each <object>\n");
      out.write("                  .each(function(index) {\n");
      out.write("                    // query & store the string field\n");
      out.write("                    var lname = (this.object.void[2].string);\n");
      out.write("                    var fname = (this.object.void[0].string);\n");
      out.write("                    var id =    (this.object.void[1].string);\n");
      out.write("                    var team =  (this.object.void[3].string);\n");
      out.write("\n");
      out.write("                    $(\"#mylist\")\n");
      out.write("                            .append('<tr><td>' + lname + '</td><td>' + fname + '</td><td>' +\n");
      out.write("                            id + '</td><td>' + team + '</td></tr>');\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                  });                \n");
      out.write("            };\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div id=\"rosterDIV\">\n");
      out.write("            ");
      Roster.Rosters roster = null;
      synchronized (_jspx_page_context) {
        roster = (Roster.Rosters) _jspx_page_context.getAttribute("roster", PageContext.PAGE_SCOPE);
        if (roster == null){
          roster = new Roster.Rosters();
          _jspx_page_context.setAttribute("roster", roster, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("            ");

                String get = request.getMethod();
            
                if (!get.equalsIgnoreCase("GET")) {
                                   response.sendError(response.SC_METHOD_NOT_ALLOWED,
                                      "GET requests only are allowed.");
                }
                // If it's a GET request, return the predictions.
                else {
                    // Object reference application has the value 
                    // pageContext.getServletContext()
                    roster.setServletContext(application);
                    out.println(roster.getRosters());
                }
           
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <table border=\"1\" id=\"mylist\">\n");
      out.write("            <th bgcolor=\"blue\"><font color=\"white\">Last_Name</font></th>\n");
      out.write("            <th bgcolor=\"blue\"><font color=\"white\">First_Name</font></th>\n");
      out.write("            <th bgcolor=\"blue\"><font color=\"white\">PSU_ID</font></th>\n");
      out.write("            <th bgcolor=\"blue\"><font color=\"white\">Team</font></th>\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
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
