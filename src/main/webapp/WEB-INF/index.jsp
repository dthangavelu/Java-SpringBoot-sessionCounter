<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Counter</title>
</head>
<body>
	<h1>Welcome User!</h1>
	<p><a href="/counter">Go to counter</a></p>
	
	<p>${requestScope['javax.servlet.forward.request_uri']}</p>
	<p>${pageContext.request.requestURL}</p>
	<p>http://${pageContext.request.serverName}:${pageContext.request.localPort}${requestScope['javax.servlet.forward.request_uri']}</p>
</body>
</html>
