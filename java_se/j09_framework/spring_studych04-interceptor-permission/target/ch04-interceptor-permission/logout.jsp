<%--
  Created by IntelliJ IDEA.
  User: Tommy
  Date: 2020/12/18
  Time: 5:31 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>logout</h1>

    <%
        session.removeAttribute("name");
    %>
</body>
</html>
