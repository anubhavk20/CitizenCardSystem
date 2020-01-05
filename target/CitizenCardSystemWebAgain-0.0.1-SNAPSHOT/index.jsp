<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>

</head>
<body background="C:\Users\Administrator\Desktop\bg2.png" >
	<jsp:include page="./header.jsp" />
	<button onclick="window.location.href = './adminLogin.jsp';" >ADMIN</button>
	<button onclick="window.location.href = './citizenLogin.jsp';">CITIZEN</button>
	
	<button onclick="window.location.href = './about.jsp';">ABOUT</button>
	<div class="header">

		<div class="progress-container">
			<div class="progress-bar" id="myBar"></div>
		</div>
	</div>

	<div>
		<h2>
			This is the official portal where you can create your unique identity
			and that will be valid for all kind of works
			</h2>
	</div>

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