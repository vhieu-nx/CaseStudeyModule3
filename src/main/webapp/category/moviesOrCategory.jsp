<%--
  Created by IntelliJ IDEA.
  User: Huy Hoang
  Date: 6/5/2021
  Time: 5:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>Name</td>
        <td>Img</td>
        <td>Category</td>
    </tr>
    <c:forEach items="${categories}" var="category">
        <tr>
            <td>${category.title}</td>
            <td>${category.img_movie}</td>
            <td>${category.category_name}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
