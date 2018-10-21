<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Add New Regulation</h1>
<form action="addregulations" method="post">
<input type="text" name="RL_Type" placeholder="RL Type"><br/><br/>
<input type="text" name="RL_Details" placeholder="RL Details"><br/><br/>
<input type="Date" name="Cdate" placeholder="Creation Date"><br/><br/>
<input type="text" name="dname" placeholder="Department"><br/><br/>
<input type="submit" value="Submit" >
</form></center>
</body>
</html>