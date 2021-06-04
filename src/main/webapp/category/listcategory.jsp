<%--
  Created by IntelliJ IDEA.
  User: Huy Hoang
  Date: 6/2/2021
  Time: 10:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List Danh Sách Thể loại</h1>
<button type="submit">
<a href="/category/createcategory.jsp">Tạo mới</a>
</button>
    <table border="1">
        <tr>
            <td>Index</td>
            <td>Name</td>
            <td colspan="3">Action</td>
        </tr>
        <c:forEach items="${categories}" var="el">
            <tr>
                <td>${el.category_id}</td>
                <td>${el.name}</td>

                <td>
                    <form action="/admin-categories" method="get">
                        <input type="text" name="category_id" value="${el.category_id}" hidden>
                        <input type="text" name="action" value="showFormEdit" hidden>
                        <button type="submit">Update</button>
                    </form>
                </td>

                <td>
                    <form action="/admin-categories" method="get">
                        <input type="text" name="action" value="delete" hidden>
                        <input type="number" name="category_id" value="${el.category_id}" hidden>
                        <input type="text" name="category_name" value="${el.name}" hidden>
                        <button type="submit">Delete</button>
                    </form>
                </td>
                <td>
                    <form action="/admin-categories" method="get">
                        <input type="text" name="action" value="findById" hidden>
                        <input type="number" name="category_id" value="${el.category_id}" hidden>
                        <button type="submit">Tìm Kiếm Phim Cùng Thể Loại</button>

                    </form>
                </td>
            </tr>
        </c:forEach>

    </table>

</body>
</html>
