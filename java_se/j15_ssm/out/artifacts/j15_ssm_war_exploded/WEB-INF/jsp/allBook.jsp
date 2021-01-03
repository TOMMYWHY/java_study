<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Tommy
  Date: 2021/1/3
  Time: 11:52 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>all books</h1>
    <hr>
    <div>
        <a href="${pageContext.request.contextPath}/book/toAddBook">add book</a>
    </div>
    <hr>
    <div>
        <table>
            <thead>
                <tr>
                    <th>no</th>
                    <th>name</th>
                    <th>count</th>
                    <th>detail</th>
                    <th>option</th>
                </tr>
            </thead>
            <tbody>
                    <c:forEach var="book" items="${list}" >
                        <tr>
                            <td>${book.bookID}</td>
                            <td>${book.bookName}</td>
                            <td>${book.bookCounts}</td>
                            <td>${book.detail}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/book/toUpdateBook?id=${book.bookID}">update</a> | &nbsp;
                                <a href="${pageContext.request.contextPath}/book/delete/${book.bookID}">delete</a>
                            </td>
                        </tr>
                    </c:forEach>
            </tbody>
        </table>
    </div>


</body>
</html>
