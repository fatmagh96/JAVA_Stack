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
	<h1>Send an Omikuji</h1>
	<div>
		<form action="/omikuji/process" method="POST">
			<div>
				<label>Pick any number from 5 to 25</label>
				<input type="number" name="number" min="5" max="25"/>			
			</div>
			
			<div>
				<label>Enter the name of any city</label>
				<input type="text" name="city"/>			
			</div>
			
			<div>
				<label>Enter the name of any real person</label>
				<input type="text" name="person"/>			
			</div>
			
			<div>
				<label>Enter professional endeavor or hobby</label>
				<input type="text" name="hobby"/>			
			</div>
			
			<div>
				<label>Enter any type of living thing</label>
				<input type="text" name="thing"/>			
			</div>
			
			<div>
				<label>Say something nice to someone</label>
				<textarea rows="5" cols="8" name="nice"></textarea>			
			</div>
			
			<p>Send and show a friend</p>
			
			<input type="submit" value="Send">
			
			
			
		
		</form>
	
	
	</div>
</body>
</html>