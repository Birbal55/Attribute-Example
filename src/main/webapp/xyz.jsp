<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p><%=request.getAttribute("names") %></p>
	<p> Session Scope Attributes : <%=session.getAttribute("session-names") %></p>
	
</body>
</html>