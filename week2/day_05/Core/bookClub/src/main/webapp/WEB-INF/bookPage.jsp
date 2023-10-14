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
    <title>Tacos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>

	<div class="container">
	<div>
		<h1>${book.title}</h1>
		<a href="/books">back to the shelves</a>	
	</div>
	
	<div>
		<h3>
			<span class="text-danger">
			<c:choose>			
			<c:when test="${user_id eq book.user.id }">You</c:when>
			<c:otherwise>${book.user.name}</c:otherwise>
			</c:choose>
			</span> read
			<span style="color: purple">${book.title}</span>  by 
			<span class="text-success">${book.author}</span>
		</h3>
		<h4>Here are
		 <span>
			<c:choose>			
			<c:when test="${user_id eq book.user.id }">your</c:when>
			<c:otherwise>${book.user.name}'s</c:otherwise>
			</c:choose>
		</span> thoughts:</h4>
		<hr />
			<p>
				${book.thoughts}
			</p>
		<hr />
		<c:if test="${user_id eq book.user.id }">
		
			<div class="d-flex justify-content-end ">
				<a href="/books/edit/${book.id}" class="btn btn-success">Edit</a>
				<form action="/deleteBook/${book.id}" method="post">
					<input type="hidden" name="_method" value="delete"/>
					<button class="btn btn-danger">Delete</button>
				</form>
			</div>
		
		</c:if>
	</div>	
	</div>

</body>
</html>