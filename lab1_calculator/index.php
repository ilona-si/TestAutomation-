<!DOCTYPE html>
<html>
<head>
	<title>calculator</title>
</head>
<body>

<form method="POST" action="calc.php">
	<label>	Введите  число a: </label>
	<input type="number" name="a" required><br>
	<label>	Введите  число b: </label>
	<input type="number" name="b" required><br>
	<label>Выберите действие:</label><br>
	<section>
		<input type="radio" name="action" value="+" checked>a+b<br>
		<input type="radio" name="action" value="-">a-b<br>
		<input type="radio" name="action" value="/">a/b<br>
		<input type="radio" name="action" value="*">a*b <br>
	</section>
	<input type="submit" name="submit">
</form>


</body>
</html>