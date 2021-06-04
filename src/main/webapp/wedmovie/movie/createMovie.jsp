<%--
  Created by IntelliJ IDEA.
  User: Mr.Nguyen
  Date: 6/3/2021
  Time: 2:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="MovieServlet" method="post">
    Title <input type="text" name="title" value=""><br/>
    Content <input type="password" name="content" value=""><br/>
    Description <input type="text" name="description" value=""><br/>
    Image_movie <input type="checkbox" name="image" value=""><br/>
    YoutubeTrainer <input type="checkbox" name="trainer" value=""><br/>
    videoMovie <input type="checkbox" name="video" value=""><br/>
    <select name="categories" id="categories" multiple>
        <c:forEach items="${categories}" var="c">
            <option value="${c.id}">${c.name}</option>
        </c:forEach>
    </select>
    <input type="submit" value="create" name="action">
</form>
</body>
</html>
