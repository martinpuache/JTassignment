<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.util.ArrayList" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Product List</h1>
	
	<h2>Product ID - Product Name - Cost</h2>
	<c:forEach items = "${productList}" var="prod">
			<p>${prod.productId} ${prod.productName} ${prod.cost}</p>
	</c:forEach>
</body>
</html>