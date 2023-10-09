<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji</title>
</head>
<body>

	<h1>Here's your Omikuji</h1>
	<div>
	
	<p>In ${number} years, you will live in ${city} with ${person}
	as your roommate, ${hobby} for a living.
	The next time you see a ${thing}, you will have good luck.
	Also, ${nice}.</p>
	
	<a href="/omikuji">Go back</a>	
	
	
	</div>

</body>
</html>