
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
        <table border="1" cellpadding="5">
            <thead>
            <tr>
                <th>ID.</th>
                <th>Title</th>
                <th>Content</th>
                <th>Description</th>
                <th>Image</th>
                <th>YoutubeTrainer</th>
                <th>VideoMovie</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="movie" items="${listMovie}">
                <tr>
                    <td>${movie.movie_id}</td>
                    <td>${movie.title}</td>
                    <td>${movie.content}</td>
                    <td>${movie.description}</td>
                    <td>${movie.image_movie}</td>
                    <td>${movie.youtubeTrainer}</td>
                    <td>${movie.videoMovie}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/MovieServlet?action=update&id=${movie.movie_id}">Edit</a>
                        <a href="${pageContext.request.contextPath}/MovieServlet?action=delete&id=${movie.movie_id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
</div>
</body>
</html>
