<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tacos</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body>
	<div class="container">
		<h1>Edit Expense:</h1>
		<a href="/expenses">Go back</a>

		<form:form action="/edit/expenses/${travel.id }" method="POST" modelAttribute="travel">
			<input type="hidden" name="_method" value="put">
			<form:errors path="*" class="text-danger" />
			<div class="input-group mb-3">
				<form:label path="expense" class="form-label">Expense Name:</form:label>
				<form:input path="expense" class="form-control" />
			</div>
			<div class="input-group  mb-3">
				<form:label path="vendor" class="form-label">Vendor:</form:label>
				<form:input path="vendor" class="form-control" />
			</div>
			<div class="input-group mb-3">
				<form:label path="amount" class="form-label">Amount:</form:label>
				<form:input path="amount" class="form-control" />
			</div>
			<div class="input-group mb-3">
				<form:label path="description" class="form-label">Description:</form:label>
				<form:textarea path="description" class="form-control" />
			</div>
			<input type="submit" value="Edit" class="btn btn-primary">
		</form:form>

	</div>

</body>
</html>