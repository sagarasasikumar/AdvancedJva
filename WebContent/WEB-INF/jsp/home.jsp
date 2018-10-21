<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<script>
function validate()
{
var name=document.form.name.value;
var paswd=document.form.paswd.value;
if(name==null || name=="")
	{
	alert("user name can not be blank");
	return false;
	}
if(paswd==null||paswd=="")
	{
	alert("password cannot be blank");
	return false;
	}
	}
</script>
</head>
<center>
<h1>Employee Management System</h1>
<h3>Login</h3> 
<body>
<form action="adminlogin" name="form" onsubmit="return validate()" method="post">
<input type="text" name="name" placeholder="User Name"><br/><br/>
<input type="password" name="paswd" placeholder="Password"><br/><br/>
<input type="submit" value="submit">
</form></center>
</body>
</html>