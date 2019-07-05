<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
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
<title>Spitter</title>
</head>
<body>
<div class="container">
	<h1>Register Form</h1>
	<sf:form method="POST" modelAttribute="spitter">
		<div class="form-group">
			<label for="FirstName">First Name:</label> 
			<sf:input path="firstname" placeholder=" Enter First Name" /><br />
			<sf:errors path="firstname" cssClass="error" /><br/>
		</div>
		<div class="form-group">
			<label for="LastName">Last Name:</label>
			<sf:input path="lastname" placeholder=" Enter Last Name" /><br />
			<sf:errors path="lastname" cssClass="error" /><br/>
		</div>
		<div class="form-group">
			<label for="UserName">Username:</label> 
			<sf:input path="username" placeholder="Enter Username" /><br />
			<sf:errors path="username" cssClass="error" /><br/>
		</div>
		<div class="form-group">
			<label for="Password">Password:</label> 
			<sf:password path="password" placeholder="Enter Password" /><br />
			<sf:errors path="password" cssClass="error" /><br/>
		</div>
		<div class="form-group">
			<label for="ID">ID:</label>
			<sf:input path="spitterId" placeholder="Enter ID"/><br />
			<sf:errors path="spitterId" cssClass="error" /><br/>
		</div>
		<input type="submit" value="Register" />
	</sf:form>
</div>>
</body>
</html>