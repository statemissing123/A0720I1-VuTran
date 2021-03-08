<%--
  Created by IntelliJ IDEA.
  User: linht
  Date: 1/6/2021
  Time: 7:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
    <link rel="stylesheet" href="assets/css/bootstrap.css">
</head>
<body>
<div class="container">
    <form action="customers" method="post">
        <table class="table table-primary ">
            <tr class="table-hover">
                <td>ID</td>
                <td><input type="text" name="id" value="${customer.id}"></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name" value="${customer.name}"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="email" value="${customer.email}"></td>
            </tr>
            <tr>
                <td>Address</td>
                <td><input type="text" name="address" value="${customer.address}"></td>
            </tr>
            <tr>
                <td><button class="btn btn-success" type="submit">Update</button></td>
                <td><button class="btn btn-success" type="reset">Reset</button></td>
            </tr>
        </table>
        <a class="btn btn-warning btn-lg" href="customers" role="button">Back To List</a>
        <input type="hidden" name="action" value="edit">
    </form>
<script src="assets/js/bootstrap.js"></script>
</div>
</body>
</html>
