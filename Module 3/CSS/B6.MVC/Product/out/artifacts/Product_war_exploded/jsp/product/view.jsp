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
    <table border="1">
        <tr>
            <td>Name Manga</td>
            <td>Author</td>
            <td>Nation</td>
            <td>Chapter</td>
            <td>Comic genre</td>
        </tr>
        <tr>
            <td>${productManga.nameManga}</td>
            <td>${productManga.nation}</td>
            <td>${productManga.author}</td>
            <td>${productManga.episodes}</td>
            <td><p>Phiêu Lưu</p></td>
        </tr>
    </table>
    <button><a href="product">Back To List</a></button>
</body>
</html>
