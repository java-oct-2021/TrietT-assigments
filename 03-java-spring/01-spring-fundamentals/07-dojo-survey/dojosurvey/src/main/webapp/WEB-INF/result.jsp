<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Survey Result</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script>
    /* The back() method loads the previous URL in the history list. 
    */
    function goBack() {
        window.history.back()
    }
 </script>
</head>
<body>
<div class = title >
		<p  class = text>Submitted information: </p>
		<p> Name: <c:out value = "${name }"/> </p>
		<p> Dojo Location: <c:out value = "${location }"/> </p>
		<p> Favorite Language: <c:out value = "${language }"/></p>
		<p> Comment: <c:out value = "${comment }"/></p>
		<button onclick="goBack()">Go Back</button>
		
		
</div>

</body>
</html>