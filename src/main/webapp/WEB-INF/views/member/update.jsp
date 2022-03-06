<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Member Update Page</h1>
	<div>
		<form action="./update" method="post">
			<fieldset>
				<legend>ID</legend>
				<input type="text" name="id" value="${id}">
			</fieldset>	
			<fieldset>
				<legend>Email</legend>
				<input type="text" name="email" value="${email}">
			</fieldset>	
			<fieldset>
				<legend>Phone</legend>
				<input type="text" name="phone" value="${phone}">
			</fieldset>
			<fieldset>
				<button type="submit">Join</button>
			</fieldset>									
		</form> 
		
</body>
</html>