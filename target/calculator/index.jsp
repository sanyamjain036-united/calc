<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Simple Calculator Application</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f2f2f2;
	margin: 0;
	padding: 0;
}

h1 {
	color: #333;
	text-align: center;
	margin-top: 50px;
}

form {
	max-width: 400px;
	margin: 20px auto;
	background-color: #fff;
	padding: 20px;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

label, input[type="text"], input[type="submit"] {
	display: block;
	margin-bottom: 10px;
	margin-left: 30px;
}

input[type="text"], input[type="submit"] {
	width: 80%;
	padding: 10px;
	border-radius: 3px;
	border: 1px solid #ccc;
}

input[type="submit"] {
	background-color: #4CAF50;
	color: white;
	border: none;
	cursor: pointer;
}

select {
	width: 50%;
	padding: 10px;
	align-content: center;
	margin-left: 20%;
	border-radius: 3px;
}

input[type="submit"]:hover {
	background-color: #45a049;
}


</style>
</head>
<body>
	<h1>Calculator Application</h1>
	<form action="./CalculatorServlet" method="get">
		<label for="num1label">Enter Number1:</label> <input type="text"
			name="num1"> <br> <label for="num2label">Enter
			Number2:</label> <input type="text" name="num2"> <br> <br>
		<select name="operations">
		<option selected="selected" value=""></option>
			<option value="add" >Add</option>
			<option value="sub">Sub</option>
			<option value="mul">Mul</option>
			<option value="div">Div</option>
		</select> <br /> <br> <input type="submit" value="Calculate">
	</form>

	
</body>
</html>