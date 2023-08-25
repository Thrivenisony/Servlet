<%@page import="javax.websocket.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Implicit Object jsp</h1>
<%
String app=(String)application.getAttribute("appscope");
out.print("<br>application:"+ app);
String appobj=application.getInitParameter("context");
out.print("<br>aapobj="+appobj);
String msg=(String) request.getAttribute("servlet_config");
String user=config.getInitParameter("user");
out.print("<br>driver name is:"+user);
out.print("<br>msg=" + msg);
String ses=(String)session.getAttribute("sessions");
request.getSession(false);
out.print("<br>message session="+ses);
%>
</body>
</html>