<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Simple Calculator</h2>

<form action="calculate">

    Enter Number 1:
    <input type="number" step="any" name="num1" required><br><br>

    Enter Number 2:
    <input type="number" step="any" name="num2" required><br><br>

    <select name="operation">
        <option value="add">Addition (+)</option>
        <option value="sub">Subtraction (-)</option>
        <option value="mul">Multiplication (*)</option>
        <option value="div">Division (/)</option>
    </select><br><br>

    <input type="submit" value="Calculate">
</form>


</body>
</html>