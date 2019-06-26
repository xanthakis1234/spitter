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
		<c:forEach items="${spitter}" var="spitter">
			<div class="spitterusername">
				Username:<c:out value="${spitter.username}" /><br/>
			</div>
			<div class="spitterfirstname">
				First Name:<c:out value="${spitter.firstname}" /><br/>
			</div>
			<div class="spitterlastname">
				Last Name<c:out value="${spitter.lastname}" /><br/>
			</div>
		</c:forEach>
	</body>
</html>