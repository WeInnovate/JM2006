<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My profile</title>
</head>
<body>
	<table border="1px">
		<tr style="color: green">
			<td>Name</td>
			<td><%=request.getParameter("un")%></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><%=request.getParameter("email")%></td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td><%=request.getParameter("mob")%></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td><%=request.getParameter("gender")%></td>
		</tr>
		<tr>
			<td>Trainer Name</td>
			<td><%= (String)request.getAttribute("trn")%></td>
		</tr>
	</table>

	<%
		for (int i = 0; i < 10; i++) {
			out.print(i);
	%><br />
	<%
		}
	
	out.println(sum(something, 20));
	
	
	
	
	%>

	<%!
	public int something = 10;
	public int sum(int a, int b) {
		return a + b;
	}
	%>

</body>
</html>