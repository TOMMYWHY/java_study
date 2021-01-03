<%--
  Created by IntelliJ IDEA.
  User: Tommy
  Date: 2021/1/3
  Time: 4:19 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>update book</h1>

<hr>
<form action="${pageContext.request.contextPath}/book/update" method="post">
    <input type="text" name="bookID" value="${book.bookID}" readonly="readonly">

    <input type="text" name="bookName" placeholder="name" value="${book.bookName}" required>
    <input type="text" name="bookCounts" placeholder="count" value="${book.bookCounts}" required>
    <input type="text" name="detail" placeholder="detail" value="${book.detail}" required>
    <input type="submit" value="update">
</form>

</body>
</html>
