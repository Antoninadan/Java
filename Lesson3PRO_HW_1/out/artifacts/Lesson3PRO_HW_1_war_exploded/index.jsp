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

<%= request.getAttribute("message") %><br>

<form action="/login" method="POST">
    Login: <input type = "text" name = "login">
    Password: <input type = "password" name = "password">
    <input type="submit"/>
</form>

<%--<script type='text/javascript'>--%>
    <%--var n = 9;--%>
    <%--var i = 1;--%>

    <%--document.write("< table border = 1 > ");--%>
    <%--while (i <= n) {--%>
        <%--document.write('<tr>');--%>
        <%--var j = 1;--%>
        <%--while (j <= n) {--%>
            <%--document.write('<td>');--%>
            <%--document.write(i * j);--%>
            <%--document.write("</td>");--%>
            <%--j++;--%>
        <%--}--%>
        <%--document.write("</tr>");--%>
        <%--i++;--%>
    <%--}--%>

    <%--document.write("</table>");--%>

<%--</script>--%>

</body>
</html>
