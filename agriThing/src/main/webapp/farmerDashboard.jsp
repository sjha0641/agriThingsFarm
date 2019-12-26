<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Farmer Dashboard</title>
<link rel="stylesheet" href="adminLogin.css">
</head>
<body>
	<h1>${sessionScope.loggedInFarmer.farmerEmail }</h1>
	<div>
		<ul>
			<li><a class="active" href="#">Home</a></li>
			<li><a href="placeRequest.jsp">Place Request</a></li>
			<li><a href="addCrop.jsp">Add Crop</a></li>
			<li><a href="viewMarketPlace.jsp">View Market Place</a></li>
			<li><a href="farmerLogin.jsp">LogOut  ${ Session.Abandon }</a></li>
		</ul>
	</div>
	
</body>
</html>