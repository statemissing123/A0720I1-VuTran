<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 29/01/2021
  Time: 18:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>List</title>
    <link rel="stylesheet" href="assets/css/bootstrap.css">
</head>
<body>
<div class="container">
    <h1 style="margin-left: 450px;color: yellow">Danh Sách Phòng Trọ</h1>
    <form action="phongtro" method="post">
        <input type="hidden" name="action" value="search">
        <input type="text" id="productName" name="name" placeholder="Search" >
        <input type="submit" id="search" class="btn btn-outline-info" value="Search">
    </form>
    <div id="result"></div>

    <table class="table table-bordered">
        <tr class="table-primary">
            <td>ID</td>
            <td>Mã Phòng Trọ</td>
            <td>Tên Người Thuê</td>
            <td>Số điện thoại</td>
            <td>Ngày Thuê</td>
            <td>Hình thức thanh toán</td>
            <td>Ghi chú</td>
            <td>Delete</td>
        </tr>
        <c:forEach items="${phongtros}" var="phongtro">
            <tr>
                <td>${phongtros.id}</td>
                <td>${phongtros.maphongtro}</td>
                <td><a href="${pageContext.request.contextPath}/phongtro?action=view&id=${phongtros.id}">${phongtros.ten}</a></td>
                <td>${phongtros.sdt}</td>
                <td>${phongtros.ngayThue}</td>
                <td>${phongtros.thanhtoan}</td>
                <td>${phongtros.ghichu}</td>
                <td><a href="${pageContext.request.contextPath}/phongtro?action=delete&id=${phongtro.id}" class="btn btn-danger">delete</a></td>
            </tr>
        </c:forEach>

    </table>
    <p>
        <a href="${pageContext.request.contextPath}/phongtro?action=create" class="btn btn-success">Tạo mới</a>
    </p>

    <script src="assets/js/bootstrap.js"></script>
</div>
</body>
</html>
