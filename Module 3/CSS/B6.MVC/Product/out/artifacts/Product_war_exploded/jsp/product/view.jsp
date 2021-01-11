<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 08/01/2021
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Manga</title>
</head>
<body>
    <h2>Infomation Manga</h2>
    <table>
        <tr>
            <td>Name</td>
            <td><a href="product?action=view&id=${manga.id}">${manga.nameManga}</a></td>
        </tr>
        <tr>
            <td>Author</td>
            <td>${manga.author}</td>
        </tr>
        <tr>
            <td>Nation</td>
            <td>${manga.nation}</td>
        </tr>
    </table>
    <button><a href="product">Back To List</a></button>
</body>
</html>
