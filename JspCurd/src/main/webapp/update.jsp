<%@page import="com.ciq.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h6>Student update form</h6>
   <%
   Student student=(Student)request.getAttribute("studentupdate");
   %>
<table>
    <div align="center"></div>
    <form action="update" method="post">

		<tr><td> Id:</td><td><input type="text" name="id" readonly="readonly" value="<%=student.getId()%>"></td></tr>
	    <tr><td>Name:</td><td><input type="text" name="name" value="<%=student.getName()%>"></td></tr>
		<tr><td>Course:</td><td><input type="text" name="course" value="<%=student.getCourse()%>"></td></tr>
		<tr><td>Email</td><td><input type="text" name="email" value="<%=student.getEmail()%>"></td></tr>
	    <tr><td>Address:</td><td><input type="text" name="address" value="<%=student.getAddress()%>"></td></tr>
		
	<tr><td>	<input type="submit" value="update"></td>
	             <td> <input type="Reset"></td></tr>
		
		
		
</form>
</table>
</body>
</html>