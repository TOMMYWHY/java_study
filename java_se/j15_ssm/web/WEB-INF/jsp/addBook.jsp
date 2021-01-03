<%--
  Created by IntelliJ IDEA.
  User: Tommy
  Date: 2021/1/3
  Time: 4:01 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>add book</h1>

    <hr>
    <form action="${pageContext.request.contextPath}/book/add" method="post">
        <input type="text" name="bookName" placeholder="name" required>
        <input type="text" name="bookCounts" placeholder="count" required>
        <input type="text" name="detail" placeholder="detail" required>
        <input type="submit" value="submit">
    </form>
</body>
</html>
