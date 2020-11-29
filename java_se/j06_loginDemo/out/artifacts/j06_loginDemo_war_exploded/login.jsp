<%--
  Created by IntelliJ IDEA.
  User: Tommy
  Date: 2020/11/28
  Time: 2:51 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <script>
        window.onload = function (){
            document.getElementById("img").onclick= function (){

                this.src="/j06_loginDemo/checkCodeServlet?time="+new Date().getTime();
            }
        }
    </script>
</head>
<body>
    <div>
        <form action="/j06_loginDemo/loginServlet" method="post">
            <table>
                <tr>
                    <td>username</td>
                    <td><input type="text" name="username"></td>
                </tr>

                <tr>
                    <td>password</td>
                    <td><input type="password" name="password"></td>
                </tr>

                <tr>
                    <td>validate</td>
                    <td ><input type="text" name="checkCode"></td>
                </tr>

                <tr>
                    <td colspan="2"><img id="img" src="/j06_loginDemo/checkCodeServlet" alt=""></td>
                </tr>

                <tr>
                    <td colspan="2"><input type="submit" value="Login"></td>
                </tr>
            </table>
        </form>
        <div>
            <%=request.getAttribute("cc_error") == null ?"": request.getAttribute("cc_error") %>
            <%=request.getAttribute("login_error") == null ? "":request.getAttribute("login_error") %>
        </div>

    </div>
</body>
</html>
