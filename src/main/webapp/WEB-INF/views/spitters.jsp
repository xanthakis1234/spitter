<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	<title>Spitters</title>
</head>
<body>

<div class="container">
<table class="table">
    <thead class="thead-dark">
      <tr>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Username</th>
        <th>Password</th>
      </tr>
    </thead>
    <tbody>
	<c:forEach items="${spitterList}" var="spitter">
			<tr>
			<div class="spitterfirstname">
				<td><c:out value="${spitter.firstname}" /></td>
			</div>
			<div class="spitterlastname">
				<td><c:out value="${spitter.lastname}" /></td>
			</div>
			<div class="spitterusername">
				<td><c:out value="${spitter.username}" /></td>
			</div>
			<div class="spitterpassword">
				<td><c:out value="${spitter.password}" /></td>
			</div>
			</tr>
	</c:forEach>
	</tbody>
  </table>
</div>
</body>
</html>