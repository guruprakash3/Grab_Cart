<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Product Information</h3>
     <c:url var="abc" value="/saveproduct"/>
	<form:form action="${abc}"  method="post" commandName="productaddcommand">
		<table align="center">
			<tr>
				<td>Product Name:</td>
				<td><form:input path="name" /><font color="red"><form:errors
							path="name" /></font></td>
			</tr>
			<tr>
				<td>Type:</td>
				<td><form:input path="place" /><font color="red"><form:errors
							path="place" /></font></td>
			</tr>
			<tr>
				<td>Price:</td>
				<td><form:input path="age" /><font color="red"><form:errors
							path="age" /></font></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add Product" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>