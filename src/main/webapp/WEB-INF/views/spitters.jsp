<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spitters</title>
</head>
<body>
	<c:forEach items="${spitterList}" var="spitter">
		<li id="spitter_<c:out value="spitter.spitterId"/>">
			<div class="spitterusername"><c:out value="${spitter.username}" />
			<div class="spitterpassword"><c:out value="${spitter.password}" />
			<div class="spitterfirstname"> <c:outvalue="${spitter.firstname}" /> 
			<div class="spitterlastname"><c:out value="${spitter.lastname}" />
		</li>
	</c:forEach>
</body>
</html>