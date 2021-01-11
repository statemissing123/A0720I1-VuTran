<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 25/12/2020
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Chuyển Tiền</title>
</head>
<body>
<form action="rate" method="post">
    <label>Rate VND: </label><br>
    <input type="text" name="rate" placeholder="Enter rate">
    <input type="submit" value="Đổi"><br>
    <label>USD: </label><br>
    <input type="text" name="usd" placeholder="usd" value="${rateAmerica}">

</form>
</body>
</html>
