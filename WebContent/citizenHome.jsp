<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>citizen home</title>
</head>
<body background="C:\Users\Administrator\Desktop\bg2.png">
<jsp:include page="./header.jsp" />
<div class="dropdown">
 <%-- <button onclick="myFunction()" class="dropbtn"></button>  --%>
  <div id="myDropdown" class="dropdown-content">
    <button onclick="window.location.href = './viewProfile.jsp';">View Profile</button>
    <button onclick="window.location.href = './electricity.jsp';">Electricity Bill</button>
    <button onclick="window.location.href = './gas.jsp';">Gas Bill</button>
    <button onclick="window.location.href = './bank.jsp';">Bank</button>
    <button onclick="window.location.href = './rto.jsp';">RTO</button>
    <button onclick="window.location.href = './index.jsp';">Logout</button>
    
  
  </div>
</div><br><br>
<br>
<button onclick="window.location.href = './index.jsp';">BACK</button>
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