<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 06/01/2021
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Customer </title>
</head>
<body>
    <p>Info of customer</p>
    <table>
        <tr>
            <td>Name</td>
            <td>${customer.name}</td>
        </tr>
        <tr>
            <td>Email</td>
            <td>${customer.email}</td>
        </tr>
        <tr>
            <td>Address</td>
            <td>${customer.address}</td>
        </tr>
    </table>
    <a href="customers">Back To List</a>
</body>
</html>
