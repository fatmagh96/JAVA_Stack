<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/style.css">

<title>Fruity Loops</title>
</head>
<body>
	<div class="container">
	
	<h1>Fruit Store</h1>

	<table>
		<thead>
			<tr class="row">
				<th class="col-6">Name</th>
				<th class="col-6">Price</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="item" items="${items}">
			<tr class="row">
				<td class="col-6"><c:out value="${item.name}"/></td>
				<td class="col-6"><c:out value="${item.price}"/></td>
			</tr>
		
		</c:forEach>
		</tbody>

	</table>
	
	</div>


</body>
</html>