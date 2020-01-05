<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="C:\Users\Administrator\Desktop\bg2.png">
	<jsp:include page="./header.jsp" />
	<form action="CitizenLogin" method="post">
		Enter User ID<input type="number" required="required" name="citizenId"><br>
		<br> Enter Password<input type="password" required="required" name="citizenPassword"><br>
		<br> <input type="submit" value="Login"><br><br>
		<br><br>
	</form>
	<button onclick="window.location.href = './citizenRegister.jsp';">New User ?</button>
	<br>
	
	<br><br>
	

	<button onclick="window.location.href = './index.jsp';">BACK</button>
	<jsp:include page="./footer.jsp" />
</body>
</html>
