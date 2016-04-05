<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.io.*,java.util.*" %>
<html>
    <head>
        <title></title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script type="text/javascript">
    	window.onload = function(){
                //JSP compiler adds an empty line before the xml content.
                //we manually remove it.
	        var content = $.trim($('#rosterDIV').html());
                //now remove the div element that is no longer needed
                $('#rosterDIV').remove();
                // parse the xml
                content = $.parseXML(content);
                //below is specific to the output of the JavaBeans XMLEncoder
                $(content)
                  // search for all <object> elements
                  .find('object')
                  // now we can play with each <object>
                  .each(function(index, element) {
                    // query & store the string field
                    var field = $(element);
                    // get the values we want
                    var void1 = field.find('string').text();
                    // and append some html in the <ol> element
                    
                    $("#mylist")
                            .append('<tr><td>' + void1 + '</td></tr>');

                        
                  });                
            };
        </script>
    </head>
    
    <body>
        <div id="rosterDIV">
            <jsp:useBean id="roster" scope="page" type="Roster.Rosters" class="Roster.Rosters"/>
            <jsp:useBean id="stud" scope="page" type="Roster.Student" class="Roster.Student"/>
            <%
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
           %>
        </div>
        
        <table border="1" style="width:100%" id="mylist">
            <th>Last_Name</th>
            <th>First_Name</th>
            <th>PSU_ID</th>
            <th>Team</th>

        </table>

    </body>
</html>
