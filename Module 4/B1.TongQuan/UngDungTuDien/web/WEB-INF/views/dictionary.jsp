<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core_1_1"%>
<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 26/02/2021
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<form action="", method="post">
    <label>English</label>
    <input type="text" name="word" required>
    <input type="submit" value="search">
</form>
<hr>
<h3>Tiếng Việt: ${vietnamese}</h3>
</body>
</html>
