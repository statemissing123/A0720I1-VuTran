<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 26/02/2021
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Chuyển Tiền</h2>
<form action="/money" method="get">
    <label>Rate USD: </label><br>
    <input type="number" name="usd" placeholder="usd">
    <br>
    <label>Rate VND: </label><br>
    <input type="number" name="rate" placeholder="rate">
    <br>
    <input type="submit" value="ChangeMoneys">
</form>
</body>
</html>
