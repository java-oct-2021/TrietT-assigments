<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Product</title>
</head>
<body>
	<h1>New Product</h1>
	<form:form action="/products/new" method="post" modelAttribute="product">
		<p>
			<form:label path="name">Name: </form:label>
			<form:errors path="name" />
			<form:input path="name" type="text" />
		</p>
		<p>
			<form:label path="description">Description: </form:label>
			<form:errors path="description" />
			<form:input path="description" type="text" />
		</p>
		<p>
			<form:label path="price">Price: </form:label>
			<form:errors path="price" />
			<form:input path="price" type="number" />
		</p>
		<input type="submit" value="Create" />
	</form:form>

</body>
</html>