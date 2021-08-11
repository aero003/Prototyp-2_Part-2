<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up Page</title>
</head>
<body>
    <h2>Welcome to Sign Up Page</h2>
	<form:form method = "POST" action = "save">
	<table>
	  <tr>
	  	<td>User Name: </td>
	  	<td><form:input path="username"/></td>
	  </tr>
	  <tr>
	  	<td>Password: </td>
	  	<td><form:input path="password"/></td>
	  </tr>
	  <tr>
	    <td> </td>
	  	<td><input type = "submit" value = "Sign up"/></td>
	  </tr>
	</table>
	</form:form>
</body>
</html>