<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>useBean Example</title>
</head>
<body>
	<jsp:useBean id="myUser" class="com.jm2006.learn.bean.User" />
	<jsp:setProperty property="*" name="myUser" />
	<jsp:setProperty property="type" name="myUser" value="normal" />
	<jsp:getProperty property="un" name="myUser" />

	<%=myUser%>




	<jsp:forward page="forwarded.jsp">
		<jsp:param value="987654321" name="mobile" />
		<jsp:param value="${myUser}" name="user" />
	</jsp:forward>
</body>
</html>