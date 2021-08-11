<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
 	<h2>Welcome to Log In Page</h2>
	<form method = "post" action = "message">
	<table>
	  <tr>
	  	<td>User Name: </td>
	  	<td><input type="text" name = "username"/></td>
	  </tr>
	  <tr>
	  	<td>Password: </td>
	  	<td><input type="text" name = "password"/></td>
	  	
	  </tr>
	  <tr>
	    <td> </td>
	  	<td><input type = "submit" value = "Log in"/></td>
	  </tr>
	</table>
	<a href = "signUp">Sign Up</a><br>
	</form>
</body>
</html>
