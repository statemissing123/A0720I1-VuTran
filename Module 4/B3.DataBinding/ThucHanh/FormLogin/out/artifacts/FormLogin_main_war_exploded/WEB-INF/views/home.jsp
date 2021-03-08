<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 03/03/2021
  Time: 19:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h3>Home</h3>
  <form:form action="login" method="post" modelAttribute="login">
    <fieldset>
      <legend>Login</legend>
      <table>
        <tr>
          <td><form:label path="account">Account</form:label></td>
          <td><form:input path="account"></form:input></td>
        </tr>
        <tr>
          <td><form:label path="password">Password</form:label></td>
          <td><form:input path="password"></form:input></td>
        </tr>
        <tr>
          <td><form:button>Login</form:button></td>
        </tr>
      </table>
    </fieldset>
  </form:form>
  </body>
</html>
