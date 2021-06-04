<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/6/2021
  Time: 11:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh sách tài khoản khách</title>
</head>
<body>
<form action="" method="post">
    <h2 style="color: mediumblue"> Danh sách tài khoản khách </h2>
    <table border="1 solid">
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>password</th>
        </tr>
        <a:forEach items="${user}" var="user">
            <tr>
                <td>${user.name}</td>
                <td>${user.email}</td>
                <td>${user.password}</td>
            </tr>
        </a:forEach>

    </table>
</form>


</body>
</html>
