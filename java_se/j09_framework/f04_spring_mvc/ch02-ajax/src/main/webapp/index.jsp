<%--
  Created by IntelliJ IDEA.
  User: Tommy
  Date: 2020/12/16
  Time: 10:50 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
    <script>
        $(function (){
            $("#btn").click(function (){
                // alert("btn...");
                $.ajax({
                    url:"returnVoid-ajax.do",
                    data:{
                        name:"tommy",
                        age:18
                    },
                    type:"post",
                    dataType:"json",
                    error:function (err){
                        console.log(err)
                    },
                    success:function(data){
                        console.log(data.name+":"+data.age);


                    }


                })

                console.log(222);

            })
        })
    </script>

</head>
<body>
    <h2>ajax</h2>
    <button id="btn">send an ajax</button>
</body>
</html>
