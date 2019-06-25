<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spitter</title>
</head>
<body>
	<sf:form method="POST" modelAttribute="spitter">
		First Name: <sf:input path="firstname" /><br />
		Last Name: <sf:input path="lastname" /><br />
		Username: <sf:input path="username" /><br />
		Password: <sf:password path="password" /><br />
		ID: <sf:input path="spitterId" /><br />
		<input type="submit" value="Register" />
	</sf:form>
</body>
</html>