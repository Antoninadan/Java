<%@ page import="ua.i.mail100.Article" %>
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

<table border=1>
    <tr>
        <td> Name</td>
        <td> Content</td>
        <td> Date</td>
        <td> Username</td>
    </tr>

    <% for (int i = 0; i < ((Article[]) request.getAttribute("articleMas")).length; i++) { %>
    <tr>
        <td><%= ((Article[]) request.getAttribute("articleMas"))[i].getName() %>
        </td>
        <td><%= ((Article[]) request.getAttribute("articleMas"))[i].getContent() %>
        </td>
        <td><%= ((Article[]) request.getAttribute("articleMas"))[i].getDate() %>
        </td>
        <td><%= ((Article[]) request.getAttribute("articleMas"))[i].getUsername() %>
        </td>

        <td>
            <form action="/remove-article" method="POST">
                <input type = "hidden" name="removeId" value=<%= i%>>
                <input type="submit" value="Delete article"/>
            </form>
        </td>

    </tr>

    <%} %>
</table>

</body>
</html>
