<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 06/01/2021
  Time: 09:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <form action="register" method="post">
        <table>
            <tr>
                <td>Tên: </td>
                <td><input type="text" name="ten"></td>
            </tr>
            <tr>
                <td>Ngày Sinh: </td>
                <td><input type="text" name="ngaysinh"></td>
            </tr>
            <tr>
                <td>Địa Chỉ: </td>
                <td><input type="text" name="diachi"></td>
            </tr>
            <tr>
                <td>Anhr: </td>
                <td><input type="text" name="image"></td>
            </tr>
        </table>
        <input type="submit" value="Register">
    </form>
</body>
</html>
