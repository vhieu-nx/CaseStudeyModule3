<%--
  Created by IntelliJ IDEA.
  User: Mr.Nguyen
  Date: 5/25/2021
  Time: 1:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form class="form-inline my-2 my-lg-0" method="get" action="movie?action=search">
    <input class="form-control mr-sm-2" type="search" name="txtSearchValue" placeholder="Search" aria-label="Search">
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit" value="search">Search</button>
</form>
<c:redirect url="movie">

</c:redirect>
<div>
    <c:set var="listMovie" value="${requestScope.listUser}"/>
    <c:if test="${not empty listMovie}">
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
            <c:set value="0" var="count" />
            <c:forEach var="movie" items="${listMovie}">
                <c:set var="count" value="${count + 1}"/>
                <tr>
<%--                    private int movie_id;--%>
<%--                    private String title;--%>
<%--                    private String content;--%>
<%--                    private String description;--%>
<%--                    List<CategoryModel> categoryModels;--%>
<%--                    private String image_movie;--%>
<%--                    private String youtubeTrainer;--%>
<%--                    private String videoMovie;--%>
                    <td>${count}.</td>
                    <td>${movie.movie_id}</td>
                    <td>${movie.title}</td>
                    <td>${movie.content}</td>
                    <td>${movie.description}</td>
                    <td>${movie.image_movie}</td>
                    <td>${movie.youtubeTrainer}</td>
                    <td>${movie.videoMovie}</td>
                    <c:url var="delete" value="movie">
                        <c:param name="action" value="delete"/>
                        <c:param name="txtUser" value="${movie.getUsername()}"/>
                        <c:param name="txtSearchValue" value="${param.txtSearchValue}"/>

                    </c:url>
                    <td > <a href="${delete}">Delete</a></td>
<%--                    <td>--%>
<%--                        <a href="${pageContext.request.contextPath}/LoginServlet?action=update&id=${user.username}">Edit</a>--%>
<%--                        <a href="${pageContext.request.contextPath}/LoginServlet?action=delete&id=${user.username}">Delete</a>--%>
<%--                    </td>--%>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:if>
</div>
</body>
</html>
