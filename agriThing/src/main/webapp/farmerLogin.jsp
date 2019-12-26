<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Farmer Login</title>
<link rel="stylesheet" href="farmerRegistration.css">
</head>
<body>
<h3>${errorMsg}</h3>
<form action="farmerLogin.agri" method="get">
		<div class="main">
		<h4 style="text-align: center">Farmer Login</h4>
			<div class="gap">
				<label>Email</label> <input type="text" name="farmerEmail">
			</div>
			<div class="gap">
				<label>Password</label> <input type="password" name="farmerPassword">
			</div>
			<div class="gap">
			<button type="submit">Login</button>
			</div>
		</div>
	</form>
</body>
</html>