<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/6/2021
  Time: 8:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>User</title>
</head>
<body>
<form action="" method="post">
    <h2 style="color: mediumblue"> Create Form </h2>
    <table>
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>password</th>
        </tr>
        <tr>
            <td><input type="text" name="name" placeholder="Name"></td>
            <td><input type="text" name="email" placeholder="email"></td>
            <td><input type="text" name="password" placeholder="password"></td>
            <td><input type="submit" value="create"></td>
        </tr>
    </table>
</form>

</body>
</html>
