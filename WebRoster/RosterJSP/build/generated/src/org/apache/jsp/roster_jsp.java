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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title></title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        \r\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("    \twindow.onload = function(){\r\n");
      out.write("                //JSP compiler adds an empty line before the xml content.\r\n");
      out.write("                //we manually remove it.\r\n");
      out.write("\t        var content = $.trim($('#rosterDIV').html());\r\n");
      out.write("                //now remove the div element that is no longer needed\r\n");
      out.write("                $('#rosterDIV').remove();\r\n");
      out.write("                // parse the xml\r\n");
      out.write("                content = $.parseJSON(content);\r\n");
      out.write("                //below is specific to the output of the JavaBeans XMLEncoder\r\n");
      out.write("            \r\n");
      out.write("                $(content.java.array.void)\r\n");
      out.write("                  // search for all <object> elements\r\n");
      out.write("                  //.find('object')\r\n");
      out.write("                  // now we can play with each <object>\r\n");
      out.write("                  .each(function(index) {\r\n");
      out.write("                    // query & store the string field\r\n");
      out.write("                    var lname = (this.object.void[2].string);\r\n");
      out.write("                    var fname = (this.object.void[0].string);\r\n");
      out.write("                    var id =    (this.object.void[1].string);\r\n");
      out.write("                    var team =  (this.object.void[3].string);\r\n");
      out.write("\r\n");
      out.write("                    $(\"#mylist\")\r\n");
      out.write("                            .append('<tr><td>' + lname + '</td><td>' + fname + '</td><td>' +\r\n");
      out.write("                            id + '</td><td>' + team + '</td></tr>');\r\n");
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                  });                \r\n");
      out.write("            };\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"rosterDIV\">\r\n");
      out.write("            ");
      Roster.Rosters roster = null;
      synchronized (_jspx_page_context) {
        roster = (Roster.Rosters) _jspx_page_context.getAttribute("roster", PageContext.PAGE_SCOPE);
        if (roster == null){
          roster = new Roster.Rosters();
          _jspx_page_context.setAttribute("roster", roster, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
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
           
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <table border=\"1\" id=\"mylist\">\r\n");
      out.write("            <th bgcolor=\"blue\"><font color=\"white\">Last_Name</font></th>\r\n");
      out.write("            <th bgcolor=\"blue\"><font color=\"white\">First_Name</font></th>\r\n");
      out.write("            <th bgcolor=\"blue\"><font color=\"white\">PSU_ID</font></th>\r\n");
      out.write("            <th bgcolor=\"blue\"><font color=\"white\">Team</font></th>\r\n");
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
