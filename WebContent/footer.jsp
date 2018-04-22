<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<hr />
<h1>Footer</h1>
<%= request.getParameter("insName")+" from user" %>
<br />

<%= application.getInitParameter("institute")+ " from wex.xml" %>
<br />
${initParam.institute}<Span> from web.xml(EL)</Span>
</body>
</html>