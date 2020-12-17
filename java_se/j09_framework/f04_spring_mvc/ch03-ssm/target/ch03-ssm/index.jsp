<%--
  Created by IntelliJ IDEA.
  User: Tommy
  Date: 2020/12/17
  Time: 10:09 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <title>index</title>
    <base href="<%= basePath %>" />

</head>
<body>
    <div align="center">
        <h1>ssm demo</h1>
        <h1>index.jsp</h1>

        <hr>
        <img src="static/images/demo1.jpeg">

        <hr>
        <table>
            <tr><td><a href="addStudent.jsp">register student</a> </td></tr>
            <tr><td>select students</td></tr>
        </table>
    </div>
 

</body>
</html>
