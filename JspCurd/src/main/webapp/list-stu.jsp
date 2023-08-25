<%@page import="com.ciq.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
		<%
		List<Student> students=(List<Student>) request.getAttribute("student");
		for(Student student:students){
			%>
	<tr>
			<td><%=student.getId()%></td>
			<td><%=student.getName()%></td>
			<td><%=student.getCourse()%></td>
			<td><%=student.getEmail()%></td>
			<td><%=student.getAddress()%></td>
			<td><a href="update?id=<%=student.getId()%>">Update</a>
			<a href="delete?id=<%=student.getId()%>">Delete</a>
			</td>
			
		</tr>
	
		

		<%
	}
	%>
	</table>
	<br>
	<br>
<center><a href="save-stu.jsp"><button>Insert Student Data</button></a></center>
</body>
</html>