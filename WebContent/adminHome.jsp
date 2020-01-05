<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Home</title>
</head>
<body background="C:\Users\Administrator\Desktop\bg2.png">
<jsp:include page="./header.jsp" />
		<button onclick="window.location.href = './viewCitizens.jsp'">View Citizens</button>
	<button onclick="window.location.href = './index.jsp'">Logout</button>
	
	<jsp:include page="./footer.jsp" />
</body>
</html>