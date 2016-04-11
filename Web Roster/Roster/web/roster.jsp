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
                content = $.parseJSON(content);
                //below is specific to the output of the JavaBeans XMLEncoder
            
                $(content.java.array.void)
                  // search for all <object> elements
                  //.find('object')
                  // now we can play with each <object>
                  .each(function(index) {
                    // query & store the string field
                    var lname = (this.object.void[2].string);
                    var fname = (this.object.void[0].string);
                    var id =    (this.object.void[1].string);
                    var team =  (this.object.void[3].string);

                    $("#mylist")
                            .append('<tr><td>' + lname + '</td><td>' + fname + '</td><td>' +
                            id + '</td><td>' + team + '</td></tr>');

                        
                  });                
            };
        </script>
    </head>
    
    <body>
        <div id="rosterDIV">
            <jsp:useBean id="roster" scope="page" type="Roster.Rosters" class="Roster.Rosters"/>
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
        
        <table border="1" id="mylist">
            <th bgcolor="blue"><font color="white">Last_Name</font></th>
            <th bgcolor="blue"><font color="white">First_Name</font></th>
            <th bgcolor="blue"><font color="white">PSU_ID</font></th>
            <th bgcolor="blue"><font color="white">Team</font></th>

        </table>

    </body>
</html>
