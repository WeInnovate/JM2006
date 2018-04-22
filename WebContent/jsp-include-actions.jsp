<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Include Action</title>
</head>
<body>
<jsp:include page="header.jsp">
<jsp:param value="Atul" name="trnName"/>

</jsp:include>

<p>this is include action example.</p>

<jsp:include page="footer.jsp">

<jsp:param value="InfoCampus" name="insName"/>
</jsp:include>
</body>
</html>