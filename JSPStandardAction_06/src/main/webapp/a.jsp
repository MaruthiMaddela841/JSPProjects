<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>First Page</title>
</head>
<body>
	<b>Start of JSP</b>
	<%
	float billAmount=300.1f;
	%>
	<br>
	<jsp:forward page="b.jsp">
		<jsp:param value='divya' name='customerName'/>
		<jsp:param value='<%=billAmount %>' name='billAmount'/>
	</jsp:forward>
	<br>
	<b>End of JSP</b>
</body>
</html>