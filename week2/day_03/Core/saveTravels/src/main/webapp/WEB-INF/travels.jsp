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

		<h1>Save Travels</h1>
		<table class="table table-striped table-bordered">
			<thead>
				<th>Expense</th>
				<th>Vendor</th>
				<th>Amount</th>
				<th>Actions</th>
			</thead>

			<tbody>
				<c:forEach items="${travels }" var="travel">
					<tr>
						<td><a href="/expenses/${travel.id}"><c:out
									value="${travel.expense }" /></a></td>
						<td><c:out value="${travel.vendor }" /></td>
						<td>$<c:out value="${travel.amount }" /></td>
						<td><a href="edit/${travel.id}">Edit</a>
							<form action="/expenses/${travel.id }" method="post">
								<input type="hidden" name="_method" value="delete" />
								<button>delete</button>
							</form></td>
					</tr>


				</c:forEach>

			</tbody>

		</table>

		<div>
			<h2>Add and expense:</h2>
			<form:form action="/expenses" method="POST" modelAttribute="travel">
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
					<form:input type="number" path="amount" class="form-control" />
				</div>
				<div class="input-group mb-3">
					<form:label path="description" class="form-label">Description:</form:label>
					<form:textarea path="description" class="form-control" />
				</div>
				<input type="submit" value="Submit" class="btn btn-primary">
			</form:form>

		</div>


	</div>

</body>
</html>