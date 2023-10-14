<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login and Registration</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>

	<div class="container">
		<h1 style="color: rebeccapurple">Book Club</h1>
		<h3>Join our growing community</h3>
		<div class="row">
			<div class="register col-5">
				<h2>Register</h2>
				<form:form action="/register" method="POST" modelAttribute="regUser">


					<div class="form-group">
						<label for="name" class="form-label">Name:</label>
						<form:errors path="name" class="text-danger" />
						<form:input path="name" class="form-control"/>
					</div>

					<div class="form-group">
						<label for="email" class="form-label">Email:</label>
						<form:errors path="email" class="text-danger" />
						<form:input path="email" class="form-control"/>
					</div>

					<div class="form-group">
						<label for="password" class="form-label">Password:</label>
						<form:errors path="password" class="text-danger" />
						<form:input path="password" type="password" class="form-control"/>
					</div>

					<div class="form-group">
						<label for="confirm" class="form-label">Confirm Password:</label>
						<form:errors path="confirm" class="text-danger" />
						<form:input path="confirm" type="password" class="form-control"/>
					</div>
					<button class="btn btn-success mt-3">Submit</button>
				</form:form>

			</div>

			<div class="login col-5">
				<h2>Log In</h2>
				<form:form action="/login" method="POST" modelAttribute="logUser">

					<div class="form-group">
						<label for="email" class="form-label">Email:</label>
						<form:errors path="email" class="text-danger" />
						<form:input path="email" class="form-control"/>
					</div>

					<div class="form-group">
						<label for="password" class="form-label">Password:</label>
						<form:errors path="password" class="text-danger" />
						<form:input path="password" type="password" class="form-control"/>
					</div>
					<button class="btn btn-success mt-3">Submit</button>
				</form:form>

			</div>


		</div>

	</div>

</body>
</html>