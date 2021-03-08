<%--
  Created by IntelliJ IDEA.
  User: linht
  Date: 1/6/2021
  Time: 7:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Customer</title>
    <link rel="stylesheet" href="assets/css/bootstrap.css">
</head>
<body>
<div class="container">
    <h1 style="color: yellow;margin-left: 380px">Information of customer</h1>
    <table class="table table-primary table-light table-hover">
        <tr class="table table-light table-hove ">
            <td>Name</td>
            <td>${customer.name}</td>
        </tr>
        <tr class="table table-light table-hove ">
            <td>Email</td>
            <td>${customer.email}</td>
        </tr>
        <tr class="table table-light table-hove ">
            <td>Address</td>
            <td>${customer.address}</td>
        </tr>
    </table>
    <script src="assets/js/bootstrap.js"></script>
    <a class="btn btn-success btn-lg" href="customers" role="button">Back To List</a>
</div>
</body>
</html>
