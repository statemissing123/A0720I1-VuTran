<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 11/01/2021
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Manga</title>
</head>
<body>
<h1 style="color:deepskyblue">Create Manga</h1>
<form action="product" method="post">
    <table>
        <tr>
            <td>ID</td>
            <td><input type="text" name="id" value="${manga.id}"></td>
        </tr>
        <tr>
            <td>Name Manga</td>
            <td><input type="text" name="nameManga" value="${manga.nameManga}"></td>
        </tr>
        <tr>
            <td>Author</td>
            <td><input type="text" name="author" value="${manga.author}"></td>
        </tr>
        <tr>
            <td>Nation</td>
            <td><input type="text" name="nation" value="${manga.nation}"></td>
        </tr>
        <tr>
            <td>Episodes</td>
            <td><input type="text" name="episodes" value="${manga.episodes}"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Update"></td>
            <td><input type="reset" value="Reset"></td>
        </tr>
    </table>
    <a href="product">Back to list</a>
    <input type="hidden" name="action" value="edit">
</form>
</body>
</html>
