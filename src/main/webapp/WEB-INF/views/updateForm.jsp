<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Account</title>
</head>
<body>
	<h1>Update Account</h1>
	<sf:form method="POST" modelAttribute="spitter">
		First Name: <sf:input path="firstname" /><br />
			<sf:errors path="firstname" cssClass="error" /><br/>
		Last Name: <sf:input path="lastname" /><br />
			<sf:errors path="lastname" cssClass="error" /><br/>
		Username: <sf:input path="username" /><br />
			<sf:errors path="username" cssClass="error" /><br/>
		Password: <sf:password path="password" /><br />
			<sf:errors path="password" cssClass="error" /><br/>
		ID: <sf:password path="spitterId" /><br />
			<sf:errors path="spitterId" cssClass="error" /><br/>
		<input type="submit" value="Update" />
	</sf:form>
</body>
</html>