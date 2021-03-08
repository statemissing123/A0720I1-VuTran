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
    <title>Result</title>
</head>
<body>
<table border="1">
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Email</td>
        <td>Country</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td><a href="users?action=view&id=${user.id}">${user.name}</a></td>
            <td>${user.email}</td>
            <td>${user.country}</td>
            <td><a href="users?action=edit&id=${user.id}">Edit</a></td>
            <td><a href="users?action=delete&id=${user.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<a href="users">Back to list</a>
</body>
</html>
