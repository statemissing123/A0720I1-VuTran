<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 08/01/2021
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Manga</title>
    <script src="https://code.jquery.com/jquery-3.5.1.min.js" type="text/javascript"></script>
    <script src="js/product/search.js" type="text/javascript"></script>
</head>
<body>
    <h1>Danh Sách Truyện Tranh</h1>
    <input type="text" id="productName" placeholder="Search Name Manga" >
    <input type="button" id="search" value="Search">
    <p>
        <a href="product?action=create">Create new Manga</a>
    </p>
    <div id="result">
    <table border="1">
        <tr>
            <td>ID</td>
            <td>Name Manga</td>
            <td>Author</td>
            <td>Nation</td>
            <td>Episodes</td>
            <td>Edit</td>
            <td>Delete</td>
        </tr>

        <c:forEach items="${productMangas}" var="manga">
            <tr>
                <td>${manga.id}</td>
                <td><a href="product?action=view&id=${manga.id}">${manga.nameManga}</a></td>
                <td>${manga.author}</td>
                <td>${manga.nation}</td>
                <td>${manga.episodes}</td>
                <td><a href="product?action=edit&id=${manga.id}">edit</a></td>
                <td><a href="product?action=delete&id=${manga.id}">delete</a></td>
            </tr>
        </c:forEach>

    </table>
    </div>
</body>
</html>
