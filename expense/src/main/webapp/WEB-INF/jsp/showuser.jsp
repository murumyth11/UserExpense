<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Registered User List</h3>
	<table border="1" cellpadding="2" cellspacing="2">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Password</th>
			
		</tr>
		<c:forEach var="userregistration" items="${users }">
			<tr>
				<td>${userregistration.id }</td>
				<td>${userregistration.username }</td>
				<td>${userregistration.password }</td>
				
			</tr>
		</c:forEach>
	</table>

</body>
</html>