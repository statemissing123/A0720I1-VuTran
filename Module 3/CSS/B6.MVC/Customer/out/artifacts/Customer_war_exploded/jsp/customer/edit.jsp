<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 08/01/2021
  Time: 19:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Customer</title>
</head>
<body>
    <form action="customers" method="post">
        <table>
            <tr>
                <td>ID</td>
                <td><input type="text" name="id" value="${customer.id}" readonly></td>
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
                <td><input type="submit" value="Update"></td>
                <td><input type="reset" value="Reset"></td>
            </tr>
        </table>
        <a href="customers">Back to list</a>
        <input type="hidden" name="action" value="edit">
    </form>
</body>
</html>
