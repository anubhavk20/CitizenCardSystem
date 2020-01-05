<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body background="C:\Users\Administrator\Desktop\bg2.png">
	<jsp:include page="./header.jsp" />
	<h1>Register Here</h1>
	<form action="CitizenRegisterServlet" method="post">
		<table style="with: 50%">
			<tr>
			<td>Citizen Id</td>
				<td><input type="text" required="required" name="citizenId" /></td>
			</tr>
			<tr>
				<td>Full Name</td>
				<td><input type="text" required="required" name="citizenName" /></td>
			</tr>
			<tr>
				<td>DOB</td>
				<td><input type="date" required="required" name="citizenDOB" /></td>
			</tr>
			<tr>
				<tr>
				<td>Father Name</td>
				<td><input type="text" required="required" name="fatherName" /></td>
			</tr>
			<tr>
				<td>Mother Name</td>
				<td><input type="text"  required="required" name="motherName" /></td>
			</tr>
			<tr>
				<td>Blood Group</td>
				<td><input type="text" name="bloodGroup" /></td>
			</tr>

			<tr>
				<td>Password</td>
				<td><input type="password" required="required" name="citizenPassword" /></td>
			</tr>
			<tr>
				<td>House No</td>
				<td><input type="text" required="required" name="houseNo" /></td>
			</tr>
			<tr>
				<td>Street</td>
				<td><input type="text" required="required" name="street" /></td>
			</tr>
			<tr>
				<td>City</td>
				<td><input type="text" required="required" name="city" /></td>
			</tr>
			<tr>
				<td>Zip</td>
				<td><input type="number" required="required" name="zip" /></td>
			</tr>
			<tr>
				<td>State</td>
				<td><input type="text" required="required" name="state" /></td>
			</tr>
			<tr>
				<td>Contact No</td>
				<td><input type="number" required="required" name="telNo" /></td>
			</tr>
			<tr>
				<td>Service sector</td>
				<td><input type="radio" name="sectorOfProfession" value="govt" checked>Government
					<input type="radio" name="sectorOfProfession" value="private">Private <input
					type="radio" name="sectorOfProfession" value="business">Business</td>
			</tr>
			<tr>
				<td>Department</td>
				<td><input type="text" name="depttOfProfession" /></td>
			</tr>
			<tr>
				<td>Voter Id</td>
				<td><input type="text" name="voterId" /></td>
			</tr>
			<tr>
				<td>Passport No</td>
				<td><input type="text" name="passportNo" /></td>
			</tr>
			<tr>
				<td>Aadhar Card No</td>
				<td><input type="number" required="required" name="aadharCardNo" /></td>
			</tr>
			<tr>
				<td>PAN Number</td>
				<td><input type="text"  name="panNo" /></td>
			</tr>
			<tr>
				<td>DL Number</td>
				<td><input type="text" name="drivingLicenseNo" /></td>
			</tr>
			<tr>
				<td>Account Number</td>
				<td><input type="number" required="required" name="account_number" /></td>
			</tr>
			<tr>
				<td>IFSC Code</td>
				<td><input type="text" required="required" name="ifsc" /></td>
			</tr>
			<tr>
				<td>Bank Name</td>
				<td><input type="text" required="required" name="bankName" /></td>
			</tr>
			<tr>
				<td>Bank City</td>
				<td><input type="text" required="required" name="bankCity" /></td>
			</tr>
			<tr>
				<td>Bank State</td>
				<td><input type="text" required="required" name="bankState" /></td>
			</tr>
		</table>
		<input type="submit" value="Submit" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		
	</form>
	
         
	<br>
	<br>
	<button onclick="window.location.href = './citizenLogin.jsp';">BACK</button>
	<jsp:include page="./footer.jsp" />

</body>
</html>