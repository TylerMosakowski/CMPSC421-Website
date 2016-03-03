window.onload = function() {

var rows = [
    {
        "class": "1",
        "date": "M:1/11",
        "tag": "Jscript",
        "topic": "Intro into WebApplications",
        "project": " ",
        "topic": "Course web Application",
        "notes": " "
    },

    {
        "class":"2",
        "date": "W:1/13",
        "tag": "Jscript",
        "topic": "Fundamental JavaScript",
        "project": " ",
        "notes": "David 2- 8  "
    },

    {
        "class": "3",
        "date": "F:1/15",
        "tag": "Jscript",
        "topic": "Regular Expressions",
        "project": " ",
        "notes": " David 10"
    },

    {
        "class": "4",
        "date": "W:1/20",
        "tag": "Jscript",
        "topic": "Server-Side JavaScript",
        "project": " ",
        "notes": "David 12 "
    },

    {
        "class": " ",
        "date": "F:1/22",
        "tag": "Jscript",
        "topic": "Lab1 : Node.js",
        "project": "Node server",
        "notes": " "
    },

    {
        "class": "5",
        "date": "M:1/25",
        "tag": "Jscript",
        "topic": "Javascript in Web Browsers",
        "project": " ",
        "notes": "David 13 "
    },

    {
        "class":"6",
        "date": "W: 1/ 27",
        "tag": "Jscript",
        "topic": "Javascript: the window object",
        "project": " ",
        "notes": "David 14 "
    },

    {
        "class": " ",
        "date": "F: 1/29",
        "tag": "Jscript",
        "topic": "Lab2:Node.js",
        "project": "Simple web site",
        "notes": " Quiz2"
    },

    {
        "class": "7",
        "date": "M:2/1",
        "tag": "HTML &CSS",
        "topic": "Scripting Document: the model",
        "project": "Scripting client",
        "notes": "David 15 "
    },

    {
        "class": "8",
        "date": "W:2/3",
        "tag": "HTML & CSS",
        "topic": "Scripting CS: the view",
        "project": "CSS design",
        "notes": " David 16"
    },

    {
        "class": " ",
        "date": "F: 2/5",
        "tag": "HTML & CSS",
        "topic": "Lab3: Node.js",
        "project": "Syllabus TOC",
        "notes": " QUIZ3"
    },

    {
        "class": "9",
        "date": "M:2/8",
        "tag": "Event",
        "topic": "Advanced Javascript: event handling",
        "project": "Scripting client",
        "notes": "  David 17"
    },

    {
        "class": "10",
        "date": "W: 2/10",
        "tag": "Event",
        "topic": "Advanced Javascript: event handling",
        "project": "Scripting client",
        "notes": " David 17"
    },

    {
        "class": " ",
        "date": "F : 2/12",
        "tag": "Event",
        "topic": "Lab4: Node.js",
        "project": "Simple Evaluation tool",
        "notes": " Quiz4"
    },

    {
        "class": "11",
        "date": "M:2/15",
        "tag": "AJAX",
        "topic": "Advanced Javascript: jQuery I",
        "project": "Use jQuery",
        "notes": " David 19"
    },

    {
        "class": "12",
        "date": "W: 2/17",
        "tag": "AJAX",
        "topic": "Advanced Javascript: jQuery II",
        "project": "Use jQuery",
        "notes": " David 19"
    },

    {
        "class":" ",
        "date": "F: 2/19",
        "tag": "AJAX",
        "topic": "Lab5: Node.js",
        "project": "Evaluation tool upon AJAX",
        "notes": " Quiz 5"
    },

    {
        "class":"13",
        "date": "M:2/22",
        "tag": "jQuery",
        "topic": "Advanced Javascript : jQuery I",
        "project": "Use jQuery",
        "notes": " David 19"
    },

    {
        "class":"14",
        "date": "W:2/24",
        "tag": "jQuery",
        "topic": "Advanced Javascript : jQuery II",
        "project": "Use jQuery",
        "notes": " David 19"
    },

    {
        "class":" ",
        "date": "F:2/26",
        "tag": "jQuery",
        "topic": "Lab6: Node.js",
        "project": "Construct schedule table",
        "notes": " Quiz 6"
    },

    {
        "class":"15",
        "date": "M:2/29",
        "tag": "HTML Media & Graphics",
        "topic": "Scripting Images",
        "project": " ",
        "notes": " David 21"
    },

    {
        "class": "16",
        "date": "W: 3/2",
        "tag": "HTML Media & Graphics",
        "topic": "Graphics in canvas",
        "project": " ",
        "notes": " David 21"
    },

    {
        "class": " " ,
        "date": "F: 3/4",
        "tag": "HTML Media & Graphics",
        "topic": "Lab7: Node.js",
        "project": "UML class editor",
        "notes": " Quiz 7"
    },

    {
        "class":"17",
        "date": "M:3/14",
        "tag": "HTML5 API",
        "topic": "Web Workers",
        "project": " ",
        "notes": " David 22"
    },

    {
        "class": "18",
        "date": "W: 3/16",
        "tag": "HTML5 API",
        "topic": "Web Sockets",
        "project": " ",
        "notes": " David 22"
    },

    {
        "class": " ",
        "date": "F:3/18",
        "tag": "Lab8:Node.js",
        "topic": "Group Chat",
        "project": " ",
        "notes": " Quiz8"
    },

    {
        "class": "19",
        "date": "M: 3/21",
        "tag": "JSP",
        "topic": "Fundamental JSP",
        "project": " Use GlassFish inside NetBeans",
        "notes": " "
    },

    {
        "class": "20",
        "date": "W: 3/23",
        "tag": "JSP",
        "topic": "JSP & JavaBeans",
        "project": " ",
        "notes": " Martin ch1"
    }, +

    {
        "class": " ",
        "date": "F:3/25",
        "tag": "JSP",
        "topic": "Lab9: JSP",
        "project": "Roster JSP with JavaBeans ",
        "notes": " Quiz9"
    },

    {
        "class": "21",
        "date": "M: 3/28",
        "tag": " REST",
        "topic": "JSP & MVC",
        "project": " ",
        "notes": " Martin ch1"
    },

    {
        "class": "22",
        "date": "W: 3/30",
        "tag": "REST",
        "topic": "RESTful WebServices:HttipServlet",
        "project": "Intro to Rest Principles ",
        "notes": " Martin ch1"
    },

    {
        "class": " ",
        "date": "F:4/1",
        "tag": "REST",
        "topic": "Lab10 : RESTful Web Services (MVC)",
        "project": "RESTful service with MVC ",
        "notes": " Quiz10"
    },

    {
        "class": "23",
        "date": "M:4/4",
        "tag": "REST",
        "topic": "RESTful Web Services: jTable & DB",
        "project": "  ",
        "notes": "  "
    },

    {
        "class": "24",
        "date": "W: 4/6",
        "tag": "REST",
        "topic": "RESTful Web Services: Restlet",
        "project": " ",
        "notes": " Martin ch1"
    },

    {
        "class": " ",
        "date": "F:4/8",
        "tag": "REST",
        "topic": "Lab11: RESTful Webservices (jTable)",
        "project": "RESTful service with jTable UI ",
        "notes": " "
    },

    {
        "class": "25",
        "date": "M:4/11",
        "tag": "REST",
        "topic": "Consuming RESTful Services on the Web",
        "project": " Javascript client to Pub.REST ",
        "notes": " Martin ch1"
    },

    {
        "class": "26",
        "date": "W:4/13",
        "tag": "REST",
        "topic": "Lab12:Real world RESTful Web Services",
        "project": " ",
        "notes": " Martin ch1"
    },

    {
        "class": " ",
        "date": "F:4/15",
        "tag": "REST",
        "topic": "Work on project",
        "project": " Teamwork Calender",
        "notes": " "
    },

    {
        "class": "27",
        "date": "M:4/18",
        "tag": "project",
        "topic": "Work on project",
        "project": " ",
        "notes": " "
    },

    {
        "class": "28",
        "date": "W:4/20",
        "tag": "project",
        "topic": "Work on project",
        "project": " ",
        "notes": " "
    },

    {
        "class": " ",
        "date": "F:4/22",
        "tag": "project",
        "topic": "Work on project",
        "project": " ",
        "notes": " "
    },

    {
        "class": " ",
        "date": "M:4/25",
        "tag": "project",
        "topic": "Final project Presentation",
        "project": " ",
        "notes": " "
    },

    {
        "class": " ",
        "date": "M:4/27",
        "tag": "project",
        "topic": "Final project Presentation",
        "project": " ",
        "notes": " "
    }, 

    {
        "class": " ",
        "date": "F:4/29",
        "tag": "project",
        "topic": "Final project Presentation; Course Review",
        "project": " ",
        "notes": " "
    }
];


var getSchedule = $.parseJSON(JSON.stringify(rows));

$(document).ready(function() {
    $.each(rows, function(i, item) {
        $('<tr>').append(
            $('<td>').text(item.class),
            $('<td>').text(item.date),
            $('<td>').text(item.tag),
            $('<td>').text(item.topic),
            $('<td>').text(item.project),
            $('<td>').text(item.notes)
        ).appendTo('#schedule');
    });
});}

// Test
//var jsonData = '[{"rank":"9","content":"Alon","UID":"5"},{"rank":"6","content":"Tala","UID":"6"}]';

//$.ajax({
//    url: '/echo/json/',
//    type: 'POST',
//    data: {
//        json: jsonData
//    },
//    success: function (response) {
//        var trHTML = '';
//        $.each(response, function (i, item) {
//            trHTML += '<tr><td>' + item.rank + '</td><td>' + item.content + '</td><td>' + item.UID + '</td></tr>';
//        });
//        $('#records_table').append(trHTML);
//    }
//});
//};
