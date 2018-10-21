<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddEmployee</title>
</head>
<body>
<center>
<h1>Employee Registartion Form</h1>
<form action="addEmployee" method="post">
<input type="text" placeholder="User Id" name="uid"><br/><br/>
<input type="text" placeholder="First Name" name="fname"><br/><br/>
<input type="text" placeholder="Last Name" name="lname"><br/><br/>
<input type="Date" placeholder="DOB" name="dob"><br/><br/>
<input type="text" placeholder="Email" name="email"><br/><br/>
<input type="text" placeholder="Department" name="dept"><br/><br/>
<input type="password" placeholder="Password" name="paswd"><br/><br/>
<input type="submit" value="Submit">
</form></center>
</body>
</html>