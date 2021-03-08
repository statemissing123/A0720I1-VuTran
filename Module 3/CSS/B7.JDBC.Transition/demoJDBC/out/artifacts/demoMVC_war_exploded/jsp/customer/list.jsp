<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: linht
  Date: 1/6/2021
  Time: 6:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="assets/css/bootstrap.css">
    <link rel="stylesheet" href="assets/css/list.css">
    <title>List Customer</title>
</head>
<body style="background: whitesmoke">
<div class="container" style = "height: auto">
    <h1 style="margin-left: 450px;color: yellow">Customer List</h1>
    <form action="customers" method="post">
        <input type="hidden" name="action" value="search">
        <input type="text" id="productName" name="name" placeholder="Search Name Customer" >
        <input type="submit" id="search" class="btn btn-outline-info" value="Search">
    </form>
    <div id="result"></div>

    <table class="table table-bordered">
        <tr class="table-primary">
            <td>Name</td>
            <td>Email</td>
            <td>Address</td>
            <td>Delete</td>
            <td>Edit</td>
        </tr>
        <c:forEach items="${customers}" var="customer">
            <tr>
                <td><a href="${pageContext.request.contextPath}/customers?action=view&id=${customer.id}">${customer.name}</a></td>
                <td>${customer.email}</td>
                <td>${customer.address}</td>
                <td><a href="${pageContext.request.contextPath}/customers?action=edit&id=${customer.id}" class="btn btn-primary">edit</a></td>
                <td><a href="${pageContext.request.contextPath}/customers?action=delete&id=${customer.id}" class="btn btn-danger">delete</a></td>
            </tr>
        </c:forEach>

    </table>
    <p>
        <a href="${pageContext.request.contextPath}/customers?action=create" class="btn btn-success">Create new Customer</a>
    </p>
    <script src="assets/js/bootstrap.js"></script>
</div>
</body>
</html>
