<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login page</title>
</head>
<body background="C:\Users\Administrator\Desktop\bg2.png">
<jsp:include page="./header.jsp" />
	<form action="AdminLogin" method="post">
	Enter User ID<input type="number" required="required" name="adminId"><br><br>
	Enter Password<input type="password" required="required" name="adminPassword"><br><br>
	<input type="submit" value="Login">
	</form>
	<br><br>
	<br><br>
	<br><br>
	
	<button onclick="window.location.href = './index.jsp';">BACK</button>
		<jsp:include page="./footer.jsp" />
</body>
</html>