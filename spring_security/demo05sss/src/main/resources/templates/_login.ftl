<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<#--<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.min.js"></script>-->

<h1>${"wocao"}</h1>h1
<form action="/login" method="post">
    username:<input type="text" name="username" id="username" />
    password:<input type="text" name="password" id="password" />
    <button id="login" type="submit">login</button>
</form>

</body>

<#--<script>-->


<#--    $("#login").on("click",function (){-->
<#--        console.log(111111)-->
<#--        $.ajax({-->
<#--            url:"http://localhost:8080/login",-->
<#--            type:"POST",-->
<#--            data:{-->
<#--                username:$("#username").val(),-->
<#--                password:$("#password").val(),-->
<#--                _csrf:"6bea6fbe-408d-42d4-92ba-f93fc861b94f"-->
<#--            },-->
<#--            resultType:"JSON",-->
<#--            success:function (resp){-->
<#--                console.log(resp);-->
<#--            },-->
<#--            error:function (err){-->
<#--                console.log(err);-->
<#--            }-->
<#--        })-->
<#--    })-->
<#--</script>-->
</html>