<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 29/01/2021
  Time: 18:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Customer</title>
    <link rel="stylesheet" href="assets/css/bootstrap.css">
</head>
<body>
<div class="container">
    <form action="customers" method="post">
        <table class="table table-light">
            <tr>
                <td>ID</td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>BirthDay</td>
                <td><input type="date" name="birthday"></td>
            </tr>
            <tr>
                <td>Card</td>
                <td><input type="text" name="card"></td>
            </tr>
            <tr>
                <td>Phone</td>
                <td><input type="text" name="phone"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="email"></td>
            </tr>
            <tr>
                <td>Address</td>
                <td><input type="text" name="address"></td>
            </tr>
            <tr>
                <td><button class="btn btn-success" type="submit">Update</button></td>
                <td><button class="btn btn-success" type="reset">Reset</button></td>
            </tr>
        </table>
        <a class="btn btn-primary btn-lg" href="customers" role="button">Back To List</a>
        <input type="hidden" name="action" value="create">
    </form>
    <script src="assets/js/bootstrap.js"></script>
</div>
</body>
</html>
