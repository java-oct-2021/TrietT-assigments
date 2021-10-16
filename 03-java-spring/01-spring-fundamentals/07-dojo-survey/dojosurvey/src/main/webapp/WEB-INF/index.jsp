<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Survey</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div class = nav > 
	<form action="/result" method ="POST">
	<p>Name : <input type ="text" name = "name"></p>
	
	<p>Dojo Location : 
	<select name = "location">
	<option value = "Seattle">Seattle</option>
	<option value = "San Jose">San Jose</option>
	<option value = "My home">My home</option>
	</select></p>
	
	<p>Favorite Language : 
	<select name = "language">
	<option value = "JAVA">JAVA</option>
	<option value = "Python">Python</option>
	<option value = "C#">C#</option>
	</select></p>
	
	<div><p>Comment (optional):</p>
	<textarea name="comment" cols="27" rows="5"></textarea>
	</div>
	
	<p><button>Summit</button></p>
	</form>
</div>

</body>
</html>