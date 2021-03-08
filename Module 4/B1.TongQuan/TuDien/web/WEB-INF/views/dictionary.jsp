<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 26/02/2021
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Từ điển cùi</title>
</head>
<body>
<form action="/search" method="post">
    <label>English</label>
    <input type="text" name="word" required>
    <input type="submit" value="search">
</form>
<hr>
<h3>Tiếng Việt: ${vietnamese}</h3>
</body>
</html>
