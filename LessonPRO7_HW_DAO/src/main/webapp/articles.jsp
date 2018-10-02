<%@ page import="model.Article" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %>
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

    <% Iterator<Article> itr = ((List<Article>) request.getAttribute("articleMas")).iterator();
        for (; itr.hasNext(); ) {
            Article element = itr.next(); %>
    <tr>
        <td><%= element.getName() %>
        </td>
        <td><%= element.getContent() %>
        </td>
        <td><%= element.getDate() %>
        </td>
        <td><%= element.getUsername() %>
        </td>

        <td>
            <form action="/remove-article" method="POST">
                <input type="hidden" name="removeId" value=<%= element.getId()%>>
                <input type="submit" value="Delete article"/>
            </form>
        </td>

    </tr>
    <%} %>
</table>

<% if (request.getAttribute("messageArticleRemove") != null) {%>
<%= request.getAttribute("messageArticleRemove") %>
<%}%>

</body>
</html>
