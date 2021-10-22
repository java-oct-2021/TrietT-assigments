<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/languages">Dashboard</a>
<h1><c:out value="${language.name}"/></h1>
<p> <c:out value="${language.creator}"/></p>
<p> <c:out value="${language.currentVersion}"/></p>
<form action="/languages/${language.id}" method="delete">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>

</body>
</html>