<%--
  Created by IntelliJ IDEA.
  User: Tommy
  Date: 2020/11/28
  Time: 4:26 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>
        <%=request.getSession().getAttribute("user")%>, welcome back~!

        <% request.setAttribute();%>
    </h1>
</body>
</html>
