<!--  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>-->
<%@ page session="false"%>
<html>
<head>
<title>Spittr</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/style.css" />">
</head>
<body>
	<h1>Welcome to Spitter</h1>
	<a href="viewAll">View all Spitters</a> |
	<a href="viewSpitter">View Account</a> |
	<a href="<c:url value="/spittles" />">Spittles</a> |
	<a href="<c:url value="/spitter/register" />">Register</a>
</body>
</html>