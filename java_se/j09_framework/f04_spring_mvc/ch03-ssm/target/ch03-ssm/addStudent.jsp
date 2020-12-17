<%--
  Created by IntelliJ IDEA.
  User: Tommy
  Date: 2020/12/17
  Time: 10:16 下午
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
    <title>register student</title>
    <base href="<%= basePath %>" />
</head>
<body>
    <div align="center">
        <h1>add student.jsp</h1>
        <hr>
        <div>
            <form action="student/addStudent.do" method="post">
                <table>
                    <tr>
                        <td>name:</td>
                        <td><input type="text" name="name"></td>
                    </tr>

                    <tr>
                        <td>age:</td>
                        <td><input type="text" name="age"></td>
                    </tr>
                    <tr>
                        <td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
                        <td><input type="submit" value="register"></td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</body>
</html>
