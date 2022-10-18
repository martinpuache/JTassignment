<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1>Welcome to my Login page.</h1>
		<form action = "loginSuccess" method = "post">
			Username: <input type = "text" name = "uname" id = "user"/><br>
			Password: <input type = "password" name = "pwd" id = "pass"/><br>
						
			<input type = "submit" name = "login" value = "Log In"/>
			<input type = "submit" name = "register" value = "Register"/>
			<input type = "submit" name = "delete" value = "Delete a User"/>
		</form>
</body>
</html>