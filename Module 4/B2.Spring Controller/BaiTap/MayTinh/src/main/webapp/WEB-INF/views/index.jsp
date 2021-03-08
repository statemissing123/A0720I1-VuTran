<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 01/03/2021
  Time: 19:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="calculator">
    <input name="num1">
    <input name="num2">
    <br>
    <button type="submit" value="+" name="cal">Add</button>
    <button type="submit" value="-" name="cal">Sub</button>
    <button type="submit" value="*" name="cal">Mult</button>
    <button type="submit" value="/" name="cal">Div</button>
</form>
<h3>${num1} ${cal} ${num2} = ${result}</h3>
<h3>${message}</h3>
</body>
</html>
