<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 06/01/2021
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Customer</title>
</head>
<body>
<h1>Customers</h1>
<p>
    <a href="customers?action=create">Create new customer</a>
</p>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Email</td>
        <td>Address</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items="${customerList}" var="customer">
        <tr>
            <td><a href="customers?action=view&id=${customer.id}">${customer.name}</a></td>
            <td>${customer.email}</td>
            <td>${customer.address}</td>
            <td><a href="customers?action=edit&id=${customer.id}">edit</a></td>
            <td><a href="customers?action=delete&id=${customer.id}">delete</a></td>
            <td></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
