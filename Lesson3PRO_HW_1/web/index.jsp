<%@ page import="ua.i.mail100.Article" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 16.09.2018
  Time: 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<form action="/login" method="POST">
    Login: <input type="text" name="login">
    Password: <input type="password" name="password">
    <input type="submit"/>
</form>

<% if (request.getAttribute("message") != null) {%>
    <%= request.getAttribute("message") %>
<%}%>

<% if (request.getAttribute("sessionLogin") != null) {%>
    <%= request.getAttribute("sessionLogin") %>
<%}%>

<% if (request.getAttribute("articleMas") != null) {%>
    <%= ((Article[]) request.getAttribute("articleMas"))[1].getName() %>
<%}%>

</body>
</html>
