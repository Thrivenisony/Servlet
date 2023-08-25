<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="salary" value="15000"/>
<c:choose>
<c:when test="${salary>15000}">
<c:out value="${salary}"></c:out>
</c:when>
<c:otherwise>
<p>salary is lessthan minimum salary</p>
</c:otherwise>
</c:choose>


</body>
</html>