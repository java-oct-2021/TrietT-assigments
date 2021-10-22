<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Languages</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Name</th>
        <th>Creator</th>
        <th>Version</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${languages}" var="language">
        <tr>
            <td><c:out value="${language.name}"/></td>
            <td><c:out value="${language.creator}"/></td>
            <td><c:out value="${language.currentVersion}"/></td>
            <td><form action="/languages/${language.id}" method="delete">
                <input type="hidden" name="_method" value="delete">
                <input type="submit" value="Delete">
            </form><a href="/languages/edit/${language.id}">Edit</a></td>
        </tr>
    </c:forEach>
    <a href="/languages/new">New</a>
    </tbody>
</table>
</body>
</html>