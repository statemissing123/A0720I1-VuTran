<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: duytr
  Date: 2/24/2021
  Time: 7:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich</title>
</head>
<body>
        <h3>Sandwich</h3>
<form:form modelAttribute="sandwich" action="create-sandwich" method="post">
    <form:checkboxes path="giavi" items="${giavi}"/>
    <input type="submit" value="Save">
</form:form>
</body>
</html>
