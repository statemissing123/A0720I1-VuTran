<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 29/01/2021
  Time: 18:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<table border="1">
    <tr>
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
