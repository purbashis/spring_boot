<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>mywebApp</title>
</head>
<body bgcolor=MintCream>
<center>
    <h1 style="background-color:rgb(0, 255, 127);">I &#128151 java </h1>
</center>
<hr>
<center>
<div style="background-color:powderblue;">
<button type="button"
onclick="document.getElementById('demo').innerHTML = Date()">
 Date and Time.</button>

<p id="demo" ></p>
</div>
<h1>
Fetching data from home.jsp bellow  </h1>

<h3>
Welcome ${name}
</h3>


</center>
</body>
</html>