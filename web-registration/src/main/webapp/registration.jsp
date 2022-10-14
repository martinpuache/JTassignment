<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<<h1>Register here</h1>
	<form action = "servlet" method = "post">
			Username: <input type = "text" name = "username" id = "user"/><br>
			Password: <input type = "password" name = "password" id = "pass"/><br>
			Email : <input type = "text" name = "email" id = "email"/><br>
			Display Name: <input type = "text" name = "dName" id = "displayName"/><br>
			User Type: <input type = "text" name = "userType" id = "userType"/><br>
			
			<input type = "submit" name = "register2" value = "Register"/>
	</form>
</body>
</html>