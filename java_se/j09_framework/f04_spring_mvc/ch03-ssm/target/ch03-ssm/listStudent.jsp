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
    <title>show students</title>
    <base href="<%= basePath %>" />
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.js"></script>
    <script>
        $(function (){

            loadData();

            $("#btnLoader").click(function (){
                loadData();
            })
        })

        function loadData(){
            $.ajax({
                url:"student/queryStudents.do",
                type:"get",
                success:function (data){
                    $("#info").html("");
                    console.log(data);
                    $.each(data,function (i,n){
                        $("#info").append(
                            `
                                <tr>
                                    <td>\${n.id}</td>
                                    <td>\${n.name}</td>
                                    <td>\${n.age}</td>
                                </tr>
                                `
                        )
                    })

                }
            })
        }
    </script>

</head>
<body>
    <div align="center">
        <h1>list student.jsp</h1>
        <hr>
        <div>
            <table  border="1" width="300" cellpadding="0" cellspacing="0">
                <thead>
                <tr>
                    <td>student id</td>
                    <td>name</td>
                    <td>age</td>
                </tr>
                </thead>
                <tbody id="info">

                </tbody>
            </table>

            <input type="button" id="btnLoader" value="check">
        </div>
    </div>
</body>
</html>
