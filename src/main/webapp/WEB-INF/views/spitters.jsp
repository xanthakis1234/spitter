<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spitters</title>
</head>
<body>
	<c:forEach items="${spitterList}" var="spitter">
			<br /><br />
			<div class="spitterfirstname">
				<c:out value="${spitter.firstname}" />
			</div>
			<div class="spitterlastname">
				<c:out value="${spitter.lastname}" />
			</div>
			<div class="spitterusername">
				<c:out value="${spitter.username}" />
			</div>
			<div class="spitterpassword">
				<c:out value="${spitter.password}" />
			</div>
	</c:forEach>
</body>
</html>