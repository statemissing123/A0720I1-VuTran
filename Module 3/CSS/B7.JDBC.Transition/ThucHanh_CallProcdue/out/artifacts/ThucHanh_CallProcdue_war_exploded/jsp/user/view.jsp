<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 18/01/2021
  Time: 19:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View</title>
</head>
<body>
<table border="1px">
    <tr>
        <td>ID: </td>
        <td>${user.id}</td>
    </tr>
    <tr>
        <td>Name: </td>
        <td>${user.name}</td>
    </tr>
    <tr>
        <td>Email: </td>
        <td>${user.email}</td>
    </tr>
    <tr>
        <td>Country: </td>
        <td>${user.country}</td>
    </tr>
</table>
<a href="users">Back to list</a>
</body>
</html>
