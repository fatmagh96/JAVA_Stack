<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" type="text/css" href="/style.css">

<title>Fruity Loops</title>
</head>
<body>
	<h1>Fruit Store</h1>

	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Price</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="item" items="${items}">
			<tr>
				<td><c:out value="${item.name}"/></td>
				<td><c:out value="${item.price}"/></td>
			</tr>
		
		</c:forEach>
		</tbody>

	</table>


</body>
</html>