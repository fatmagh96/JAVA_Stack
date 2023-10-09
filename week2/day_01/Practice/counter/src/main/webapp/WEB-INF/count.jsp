<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current visit count</title>
</head>
<body>
	<h4>you have visited <a href="/your_server">http://your_server</a> ${counter } times.</h4>
	<h4><a href="/your_server">Test another visit?</a></h4>
	
	<a href="/your_server/reset"><button>Reset Count</button></a>
</body>
</html>