<%@page import="com.model.Citizen"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Profile</title>
</head>
<body background="C:\Users\Administrator\Desktop\projectBin\bg1.jpg">
	<jsp:include page="./header.jsp" />


	<%
		Citizen citizen = ((Citizen) (session.getAttribute("citizen")));	
	%>
	<table>
		<tr>
			<td><h5>Citizen Id</h5></td>
			<td><h5>Name</h5></td>
			<td><h5>Date Of Birth</h5></td>
			<td><h5>Father Name</h5></td>
			<td><h5>Mother Name</h5></td>
			<td><h5>Blood Group</h5></td>
		</tr>
		<tr>
			<td>
				<%
					out.print(citizen.getId());
				%>
			</td>
			<td>
				<%
					out.print(citizen.getName());
				%>
			</td>
			<td>
				<%
					out.print(citizen.getDob());
				%>
			</td>
			<td>
				<%
					out.print(citizen.getFatherName());
				%>
			</td>
			<td>
				<%
					out.print(citizen.getMotherName());
				%>
			</td>
			<td>
				<%
					out.print(citizen.getBloodGroup());
				%>
			</td>
		</tr>




	</table>
	<button onclick="window.location.href = './citizenHome.jsp';">BACK</button>

	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	
	<jsp:include page="./footer.jsp" />
</body>
</html>