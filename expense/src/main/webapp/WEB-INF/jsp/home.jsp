<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	USER REGISTRATION
	<form method="POST" action="/submit" modelAttribute="message">
 
		ID<input type="text" name="id"><br> 
		Username<input type="text" name="username"><br> 
			password<input type="text" name="password"><br>
			 <input type="submit">
			 
	</form>

</body>
</html>