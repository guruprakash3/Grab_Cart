<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${msg1==null}">

		<h1 align="center" style="color:teal;">welcome ${userList1}</h1>

		<table align="center">
			<tr>
				<td><a href="/GrabCartApplication/addProduct" >Grab Product</a></td>
			</tr>
			<tr>
				<td><a href="/GrabCartApplication/viewProduct">View Orders</a></td>
			</tr>
		</table>
	</c:if>
</body>
</html>