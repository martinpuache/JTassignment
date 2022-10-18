<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>LOG IN SUCCESSFUL!</h1>
	<h2>Welcome ${username}</h2>
	<h3>${userText}</h3>
	<form action = "deletedUser" method = "post">
			Username: <input type = "text" name = "uname" id = "user"/><br>
			<input type = "submit" name = "delete" value = "Delete a User"/>
		</form>
</body>
</html>