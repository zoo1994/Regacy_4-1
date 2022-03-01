<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Update Page</h1>
	<form action ="./update" method="post">
		Pw<input type="text" name ="pw" value="${member.pw}">
		Phone <input type="text" name="phone" value="${member.phone}">
		Email <input type="text" name="email" value="${member.email}">
		<input type="submit" value="Update">
		
	</form>
</body>
</html>