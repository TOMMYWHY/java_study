<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Tommy
  Date: 2020/11/30
  Time: 12:13 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  $END$
  <c:if test="true">
    <h1>wo cao</h1>
  </c:if>
  <%
    List<Object> list = new ArrayList<>();
    list.add("aaa");
    request.setAttribute("list",list);
    request.setAttribute("num",3);
  %>
  <c:if test="${not empty list}">
    list is exist
  </c:if>
  <br>
  <c:if test="${num % 2 !=0}">
    ${num}


  </c:if>
  </body>
</html>
