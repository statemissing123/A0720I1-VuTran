<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 06/01/2021
  Time: 09:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer</title>
</head>
<body>
<div class="wrap">
    <div class="title">
        <h1>Danh Sách Khách Hàng</h1>
    </div>
    <div class="main">
        User đăng nhập: ${username}
        <a href="regiter">Register</a>
        <table class="content-table">
            <thead>
            <tr>
                <th>Tên</th>
                <th>Ngày Sinh</th>
                <th>Địa Chỉ</th>
                <th>Anhr</th>
            </tr>
            </thead>
        </table>
    </div>
</div>
</body>
</html>
