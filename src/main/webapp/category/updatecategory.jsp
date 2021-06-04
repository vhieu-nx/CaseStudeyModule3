<%--
  Created by IntelliJ IDEA.
  User: Huy Hoang
  Date: 6/2/2021
  Time: 11:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sửa</h1>
<form method="get" action="/admin-categories">
    <input name="category_id" value="${category.category_id}" hidden>
    <input name="category_name" value="${category.name}">
    <input name="action" value="update" hidden>
    <button type="submit">Update</button>
</form>

</body>
</html>
