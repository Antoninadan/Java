<%--
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

</body>
</html>
