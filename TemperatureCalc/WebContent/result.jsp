<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
	<h1><%=request.getAttribute("resultTextBegin") %><%=(Double)request.getAttribute("result") %><%=request.getAttribute("resultTextEnd") %></h1>
</body>
</html>