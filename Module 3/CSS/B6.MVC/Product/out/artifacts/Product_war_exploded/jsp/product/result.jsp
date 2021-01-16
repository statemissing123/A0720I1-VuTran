<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<table border="1">
    <tr>
        <td>Name Manga</td>
        <td>Author</td>
        <td>Nation</td>
        <td>Episodes</td>
        <td>Delete</td>
        <td>Edit</td>
    </tr>
    <c:forEach items="${productMangas}" var="manga">
        <tr>
            <td><a href="product?action=view&id=${manga.id}">${manga.nameManga}</a></td>
            <td>${manga.author}</td>
            <td>${manga.nation}</td>
            <td>${manga.episodes}</td>
            <td><a href="product?action=edit&id=${manga.id}">edit</a></td>
            <td><a href="product?action=delete&id=${manga.id}">delete</a></td>
        </tr>
    </c:forEach>
</table>

