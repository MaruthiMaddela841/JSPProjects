<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Second Page</title>
</head>
<body>
	<b>From Second JSP</b><br/><br/>
	<%= new java.util.Date() %><br/>
	Customer Name is :: <%=request.getParameter("customerName") %><br/>
	Bill Amount is :: <%=request.getParameter("billAmount") %><br/>
</body>
</html>