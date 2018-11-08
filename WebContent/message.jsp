<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset='utf-8'>
<title>Java Server Page</title>
</head>
<body>
	<h1>Message</h1>
	<h1>
		${ message }
	</h1>
	<p>your name: ${name } </p>
	<p>your age: ${age }</p>
	<a href='message.html'>click me</a>
	<form method='get'>
		<label for='name'>name</label>
		<input type='text' name='name' id='name'>
		<label for='age'>age</label>
		<input type='number' name='age' id='age'>
		<button type='submit'>Submit</button>
	</form>
	
</body>
</html>