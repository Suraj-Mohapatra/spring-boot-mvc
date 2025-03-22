<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
	<!DOCTYPE html>
	<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here--</title>
	</head>

	<body>
		<p>Welcome Mr. Surajbhanu Mohapatra</p>

		<form action="Demo1" method="POST">
			Name:<input type="text" name="username" /><br />
			<br /> Password:<input type="password" name="userpass" /><br />
			<br /> <input type="submit" value="login" /> <br>
			<br>
			<% out.println(request.getSession(false).getId()); %>
		</form>
		<script>
			fetch('./getSessionId')
				.then(response => response.text())
				.then(data => {
					const paragraph = document.createElement('p');
					paragraph.textContent = data;
					document.body.appendChild(paragraph);
				})
				.catch(error => console.error('Error:', error));
		</script>
	</body>

	</html>