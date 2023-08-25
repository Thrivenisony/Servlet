<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add employee</h2>

<table>
<form action="save" method="post">

		<tr><td> Id:</td><td><input type="text" name="id"></td></tr>
	<tr><td>	Name:</td><td><input type="text" name="name"></td></tr>
		<tr><td>Course:</td><td><input type="text" name="course"></td></tr>
		<tr><td>Email:</td><td><input type="text" name="email"></td></tr>
	<tr><td>	Address:</td><td><input type="text" name="address"></td></tr>
		
	<tr><td>	<input type="submit" value="save"></td>
	            <td> <input type="Reset"></td></tr>
		
		
		
</form>
</table>


</body>
</html>