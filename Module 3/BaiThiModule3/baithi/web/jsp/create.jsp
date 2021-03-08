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
    <title>Create</title>
    <link rel="stylesheet" href="assets/css/bootstrap.css">
</head>
<body>
<div class="container">
    <form action="phongtro" method="post">
        <table class="table table-bordered">
            <tr class="table-primary">
                <td>ID</td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>Mã Phòng trọ</td>
                <td><input type="text" name="maphongtro"></td>
            </tr>
            <tr>
                <td>Tên</td>
                <td><input type="text" name="ten"></td>
            </tr>
            <tr>
                <td>Số điện thoại</td>
                <td><input type="text" name="sdt"></td>
            </tr>
            <tr>
                <td>Ngày Thuê</td>
                <td><input type="date" name="ngaythue"></td>
            </tr>
            <tr>
                <td>Hình thức thanht toán</td>
                <td><input type="text" name="thanhtoan"></td>
            </tr>
            <tr>
                <td>Ghi chú</td>
                <td><input type="text" name="ghichu"></td>
            </tr>
            <tr>
                <td><button class="btn btn-success" type="submit">Tạo mới</button></td>
            </tr>
        </table>
        <a class="btn btn-primary btn-lg" href="phongtro" role="button">Hủy</a>
        <input type="hidden" name="action" value="create">
    </form>



    <script src="assets/js/bootstrap.js"></script>
</div>
</body>
</html>
