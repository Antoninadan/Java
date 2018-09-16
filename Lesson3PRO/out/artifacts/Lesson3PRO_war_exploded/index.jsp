<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 15.09.2018
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main</title>
</head>
<body>

<%= request.getAttribute("message") %><br>

<form action="/login" method="POST">
    Login: <input type = "text" name = "login">
    Password: <input type = "password" name = "password">
    <input type="submit"/>
</form>


Example of list:

<ul>
    <li>List 1</li>
    <li>List 2</li>
    <li>List 3</li>
</ul>

Example of table:
<table border="1">
    <tr>
        <td> 1 </td>
        <td> 2 </td>
    </tr>
    <tr>
        <td> 3 </td>
        <td> 4 </td>
    </tr>
</table>


</body>
</html>
