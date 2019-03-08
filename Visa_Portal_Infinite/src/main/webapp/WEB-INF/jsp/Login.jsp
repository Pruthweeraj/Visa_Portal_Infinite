<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="sky Blue">


	<form name="LoginForm" action="/Visa_Portal_Infinite/submitLoginForm" method="post">
		<table width="20%" bgcolor="0099CC" align="center">
			<tr>
				<td colspan=2><center>
						<font size=4 color="red"><b><I><marquee>Manager
										Login</marquee></I></b></font>
					</center></td>
			</tr>
			<tr>
				<td>UserName:</td>
				<td><input type="text" name="userName" required="required"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="Password" name="password" required="required">

				</td>
			</tr>
			<td><input type="submit" name="submit"></td>
		</table>
	</form>
</body>
</html>