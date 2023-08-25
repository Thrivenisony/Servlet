<%@page import="com.ciq.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<style type="text/css">
#customers {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color:#f0e116;
	color: #de0b78;
	}
	#customers td {
		background-color:#c3f011;
	color: #041947;
}</style>
<h1>Student List !!</h1>

	<table id="customers">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Course</th>
			<th>Email</th>
			<th>Address</th>
			<th>Action</th>
		</tr>
		<c:forEach var="students" items="${student}">
	<tr>
			<td>${students.id}</td>
			<td>${students.name}</td>
			<td>${students.course}</td>
			<td>${students.email}</td>
			<td>${students.address}</td>
			<td><a href="update?id=${students.id}">Update</a>
			<a href="delete?id=${students.id}">Delete</a>
			</td>
			
		</tr>
	
		

	</c:forEach>
	</table>
	<br>
	<br>
<center><a href="save-stu.jsp"><button>Insert Student Data</button></a></center>
</body>
</html>