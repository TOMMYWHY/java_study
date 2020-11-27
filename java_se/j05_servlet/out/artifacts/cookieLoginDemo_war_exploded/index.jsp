<%--
  Created by IntelliJ IDEA.
  User: Tommy
  Date: 2020/11/26
  Time: 9:38 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <hr>
  <%
    String contextPath = request.getContextPath();
    out.print(contextPath);
  %>
  <hr>
  <%
    response.getWriter().write("hello a");
  %>
  </body>
</html>
