<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bank</title>
</head>
<body background="C:\Users\Administrator\Desktop\bg2.png" >
	<jsp:include page="./header.jsp" />
	<form>
	<table style="with: 50%">
	<tr>
			<td>Receiver Id</td>
				<td><input type="text" required="required" name="receiverId" /></td>
			</tr>
			<tr>
			<td>Enter Amount</td>
				<td><input type="number" required="required" name="amount" /></td>
			</tr>
			<tr>
			<td>Enter PIN</td>
				<td><input type="number" required="required" name="pin" /></td>
			</tr>
</table>

</form>
<button onclick="window.location.href = './moneySent.jsp';">SEND</button>
<br>
	<br>
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
	<jsp:include page="./footer.jsp" />
</body>
</html>