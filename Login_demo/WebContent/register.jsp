<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="utf-8">
<title>注册</title>
	<link rel="stylesheet" href="css/style.css" />
    <script src="js/bootstrap.min.js"></script>
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
    <script src="js/jquery-1.9.1.min.js" type="text/javascript"></script>
	<style>
		.mycenter{
			 margin-top: 100px;
            margin-left: auto;
            margin-right: auto;
            height: 350px;
            width: 500px;
            padding: 5%;
            padding-left: 5%;
            padding-right: 5%;
		}
		#chk{
			
			margin-top: 30px;
			
			
		}
	
	</style>
</head>
<form style="background-color: #96b97d" action="register" method="get">
	<div class="mycenter">
	<div class="form-group">
	    <label for="id">Id:</label>
	    <input type="text" class="form-control" id="Id"  required="required" name="Id"/>
  </div>
	
	  <div class="form-group">
	    <label for="email1">FirstName:</label>
	    <input type="text" class="form-control" id="FirstName"  required="required" name="FirstName"/>
  </div>
	
	  <div class="form-group">
	    <label for="email1">LastName:</label>
	    <input type="text" class="form-control" id="LastName"  required="required" name="LastName"/>
  </div>
	  <div class="form-group">
	    <label for="pwd1">Password:</label>
	    <input type="password" class="form-control" id="pwd1" required="required" name="password"/>
  </div>
	  <div class="checkbox">
	    <label id="chk">
	      <input  type="checkbox" />
	      Remember me</label>
  </div>
	  <input type="submit" class="btn btn-default"/ value="注册">
</div>
		</form>
<body>
</body>
</html>