<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome user!</h1>
	<h3>Username - Password - Display Name - Email - User Type</h3>
    <c:out value="${username} ${password} ${email} ${displayName} ${userType}"/>

</body>
</html>