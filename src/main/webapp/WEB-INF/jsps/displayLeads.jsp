<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ include file = "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Lead</title>
</head>
<body>
<h3>Display Lead | Lead</h3>
<hr>
<table border="1">
<tr>
<th>Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>City</th>
<th>Mobile</th>
<th>Delete</th>
<th>Update</th>

</tr>
<c:forEach var = "lead" items="${lead}">
<tr>
<td>${lead.id}</td>
<td>${lead.firstName}</td>
<td>${lead.lastName}</td>
<td>${lead.email}</td>
<td>${lead.city}</td>
<td>${lead.mobile}</td>
<td><a href = "delete?id=${lead.id}">delete</a></td>
<td><a href = "updateLeadById?id=${lead.id}">edit</a></td>

</tr>

</c:forEach>
</table>
</body>
</html>