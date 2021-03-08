<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div style="border:1px solid #ccc;padding:5px;">
    <a href="${pageContext.request.contextPath}/uploadOneFile">Upload One File</a>&nbsp;|&nbsp;
    <a href="${pageContext.request.contextPath}/uploadMultiFile">Upload Multi File</a>
</div>
<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 03/03/2021
  Time: 20:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Upload One File</title>
</head>
<body>
<jsp:include page="_menu.jsp"/>
<h3>Upload Multiple File:</h3>
<!-- MyUploadForm -->
<form:form modelAttribute="myUploadForm" method="POST" action="" enctype="multipart/form-data">
    Description:
    <br>
    <form:input path="description" style="width:300px;"/>
    <br/><br/>
    File to upload (1): <form:input path="fileDatas" type="file"/><br />
    <input type="submit" value="Upload">

</form:form>
</body>
</html>
