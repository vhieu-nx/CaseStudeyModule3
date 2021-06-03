<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 3/6/2021
  Time: 10:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update form</title>
</head>
<body>
<form action="" method="post">
    <h2 style="color: mediumblue"> Nhâp Email của bạn</h2>
    <table>
        <tr>
<%--            <th>Name</th>--%>
            <th>Email</th>
<%--            <th>password</th>--%>
        </tr>
        <tr>
            <td><input type="text" value="" name="email" placeholder="email"></td>
            <td></td>
<%--            <td><input type="text" value="${}" name="email" placeholder="email"></td>--%>
<%--            <td><input type="text" value="${}" name="password" placeholder="password"></td>--%>
            <td><input type="submit" value="create"></td>
        </tr>
    </table>
</form>

</body>
</html>
