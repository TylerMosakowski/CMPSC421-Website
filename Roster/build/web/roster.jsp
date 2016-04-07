<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title></title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    
    <body>
        <jsp:useBean id="Roster" scope="page" class="Roster"/>
        
       
        <div>
            <h1> Class Roster for SWENG465/CMPSC421</h1>
            <table>
                <tr>
                   <td> Last Name</td><td> First Name</td><td> PSU ID</td><td>Team</td>
               </tr>
               <% for(int i =0; i <= 34; i++ )
               {   
               %>
               <tr>
                   <td>
                       
                   </td>
                   <td>
                       <% out.print(Roster.students[i].getFName());
                       %>
                   </td>
                   <td>
                       <% out.print(Roster.students[i].getID());
                       %>
                   </td>
                   <td>
                       <% out.print(Roster.students[i].getID());
                       %>
                   </td>
                   
               </tr>
               <%}%>
            </table>
            
        </div>
    </body>
</html>
