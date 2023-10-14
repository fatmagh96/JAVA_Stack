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
		<div class="d-felx">
			<h1>Add a Book to your shelf!</h1>
			<a href="/books">back to the shelves</a>
		</div>
		
		<div>
			<form:form action="/books/new" method="post" modelAttribute="newBook">
				<form:errors path="*" class="text-danger"/>
				<div class="form-group mb-3">
					<label for="title" class="form-label">Title</label>
					<form:input path="title" class="form-control" id="title"/>
				</div>
				
				<div class="form-group mb-3">
					<label for="author" class="form-label">Author</label>
					<form:input path="author" class="form-control" id="author"/>
				</div>
				
				<div class="form-group mb-3">
					<label for="thoughts" class="form-label">My thoughts</label>
					<form:textarea path="thoughts" class="form-control" id="thoughts"/>
				</div>
				
				<button class="btn btn-primary">Submit</button>
			
			
			</form:form>
		
		</div>

	</div>

</body>
</html>