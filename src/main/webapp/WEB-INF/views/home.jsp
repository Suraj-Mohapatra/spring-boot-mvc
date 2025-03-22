<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" session="false" %>
	<!DOCTYPE html>
	<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>home page</title>
		<script src="./script/home.js"></script>
		
	</head>

	<body>
		<p>Welcome Dear Developer</p>

		<form action="Login" method="POST">
			<label for="username">Name:</label>
			<input type="text" id="username" name="username" /> <br> <br>
			<label for="userpass">Password:</label>
			<input type="password" id="password" name="password" /> <br> <br>
			<input type="submit" value="login" /> <br>
		</form>
<!-- 		<script>
			fetch('./getSessionId')
				.then(response => response.text())
				.then(data => {
					const paragraph = document.createElement('p');
					paragraph.textContent = data;
					document.body.appendChild(paragraph);
				})
				.catch(error => console.error('Error:', error));
		</script> -->
	</body>

	</html>