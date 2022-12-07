<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file = "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Lead Page</title>
</head>
<body>
<h3>Update Lead Page | Lead</h3>
<hr>
<form action="updateLead" method="post">
<pre>
Id          :  <input type = "text" name = "id" value="${lead.id }" readonly/>
First Name  :  <input type = "text" name = "firstName" value="${lead.firstName }"/>
Last Name   :  <input type = "text" name = "lastName" value="${lead.lastName}"/>
Email       :  <input type = "email" name = "email" value="${lead.email }"/>
City        :  <input type = "text" name = "city" value="${lead.city }"/>
Mobile      :  <input type = "text" name = "mobile" value="${lead.mobile }"/>
<input type = "submit" value="update">
</pre>
</form>
${msg}
</body>
</html>