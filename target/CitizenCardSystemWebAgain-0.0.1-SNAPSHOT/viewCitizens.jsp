<%@page import="com.model.Citizen"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Citizens</title>
</head>
<body background="C:\Users\Administrator\Desktop\bg2.png ">

	<%
		List<Citizen> citizens = (List<Citizen>)session.getAttribute("citizens");
	%>
	<table>
	<tr><td><h5>Citizen Id</h5></td><td><h5>Name</h5></td><td><h5>Date Of Birth</h5></td><td><h5>Father Name</h5></td><td><h5>Mother Name</h5></td><td><h5>Blood Group</h5></td></tr>
	
	<% for(Citizen citizen : citizens) {
		%>
			<tr><td><% out.print(citizen.getId()); %></td><td><% out.print(citizen.getName()); %></td><td><% out.print(citizen.getDob()); %></td><td><% out.print(citizen.getFatherName()); %></td><td><% out.print(citizen.getMotherName()); %></td><td><% out.print(citizen.getBloodGroup()); %></td></tr>
		<%
	}
	%>
	
	
	</table>
	<button onclick="window.location.href = './adminHome.jsp';">BACK</button>

</body>
</html>