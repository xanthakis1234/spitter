<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
		<title>Profile</title>
	</head>
	<body>
		<h1>Your Profile</h1>
		<c:out value="${spitter.username}" /><br/>
		<c:out value="${spitter.firstname}" />
		<c:out value="${spitter.lastname}" />
	</body>
</html>