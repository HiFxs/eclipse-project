<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
    <meta charset="utf-8" />
    <title>用户登录</title>
    <link rel="stylesheet" href="css/style.css" />
    <script src="js/bootstrap.min.js"></script>
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
    <script src="js/jquery-1.9.1.min.js" type="text/javascript"></script>
    <style>	
        #from
        {
            background-color: #96b97d;
        }
        .mycenter
        {
            margin-top: 100px;
            margin-left: auto;
            margin-right: auto;
            height: 350px;
            width: 500px;
            padding: 5%;
            padding-left: 5%;
            padding-right: 5%;
        }
        .mycenter mysign
        {
            width: 440px;
        }
        .mycenter input, checkbox, button
        {
            margin-top: 2%;
            margin-left: 10%;
            margin-right: 10%;
        }
        .mycheckbox
        {
            margin-top: 10px;
            margin-left: 40px;
            margin-bottom: 10px;
            height: 10px;
        }
    </style>
    <script type="text/javascript">
        $(function () {
            $('#btn').click(function (e) {
                window.location.href = "main.aspx";
            });
        });
    </script>
</head>
<body>
    <form id="from" action="Login" method="get">
    <div class="mycenter">
        <div class="mysign">
            <div class="col-lg-11 text-center text-info">
                <h2>
                    请登录</h2>
            </div>
            <div class="col-lg-10">
                <input type="text" class="form-control" name="username" placeholder="请输入账户名" required
                    autofocus />
            </div>
            <div class="col-lg-10">
            </div>
            <div class="col-lg-10">
                <input type="password" class="form-control" name="password" placeholder="请输入密码" required
                    autofocus />
            </div>
            <div class="col-lg-10">
            </div>
            <div class="col-lg-10 mycheckbox checkbox">
                <input type="checkbox" class="col-lg-1"/>记住密码
            </div>
            <div class="col-lg-10">
            </div>
            <div class="col-lg-10">
                <input type="submit" id="btn" value="登录" class="btn btn-success col-lg-12" name="login">     
            </div>
             <div class="col-lg-10">
                <input type="button" id="rtn" value="注册" class="btn btn-success col-lg-12" name="register" onclick="window.location='register.jsp'">    
            </div>
        </div>
    </div>
    </form>
    
</body>
</html>