<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Electricity</title>
</head>
<body background="C:\Users\Administrator\Desktop\bg2.png">
<jsp:include page="./header.jsp" />
<form>
	<table style="with: 50%">
	<tr>
			<td>Enter Id</td>
				<td><input type="text" required="required" name="citizenId" /></td>
			</tr>
		
	</table>
		
	
</form><br><br>
<button onclick="window.location.href = './billPaid.jsp';">Pay</button>
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