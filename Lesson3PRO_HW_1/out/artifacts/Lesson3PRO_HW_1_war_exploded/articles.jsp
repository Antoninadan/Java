<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 16.09.2018
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Articles</title>
</head>
<body>

<%= request.getAttribute("articleMas"[0].name) %><br>

<table border="1">
    <tr>
        <td> Name</td>
        <td> Content</td>
        <td> Date</td>
        <td> Username</td>
    </tr>
    <tr>
        <td><%= request.getAttribute("articleMas[0].name") %>
        </td>
        <td><%= request.getAttribute("articleMas[0].content") %>
        </td>
        <td><%= request.getAttribute("articleMas[0].date") %>
        </td>
        <td><%= request.getAttribute("articleMas[0].username") %>
        </td>
    </tr>
    <tr>
        <td><%= request.getAttribute("articleMas[1].name") %>
        </td>
        <td><%= request.getAttribute("articleMas[1].content") %>
        </td>
        <td><%= request.getAttribute("articleMas[1].date") %>
        </td>
        <td><%= request.getAttribute("articleMas[1].username") %>
        </td>
    </tr>
    <tr>
        <td><%= request.getAttribute("articleMas[2].name") %>
        </td>
        <td><%= request.getAttribute("articleMas[2].content") %>
        </td>
        <td><%= request.getAttribute("articleMas[2].date") %>
        </td>
        <td><%= request.getAttribute("articleMas[2].username") %>
        </td>
    </tr>
</table>

<form action="/article" method="POST">
    <input type="submit" value="Delete own article"/>
</form>


<table border=1">
    var i, j;
    const N=10;
    document.write("
    <table border=" + 1 + ">");

        for(i=1; i<=N; i++)
        {
        document.write("<tr align=right>");

            for(j=1; j<=N; j++)
            { document.write("<td>" + i*j + "</td>");}

            document.write("</tr>");
        }

        document.write("</table>");


</body>
</html>
