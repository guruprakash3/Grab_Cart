<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center" style="color:black">GRABCART</h1>
	<h3 align="center" style="color:blue">Welcome to GRABCART. A hassle free platform for buying and selling Products</h3>
	<table align="center">
		<tr>
			
			<td><a style="color:black" href="<c:url value='/Grab_Cart/addUser'/>">REGISTER</a></td>
		</tr>
		<tr>
			<td><a  style="color:black" href="/Grab_Cart/userLogin">LOGIN </a></td>
		</tr>
		</table>
</body>
</html>