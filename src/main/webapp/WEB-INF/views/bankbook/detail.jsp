<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Bankbook Detail Page</h1>
	<h3>Name : ${dto.bookName}</h3>
	<h3>Contents : ${dto.bookContents}</h3>
	
	<a href="./list">List</a>
	<a href="./delete?bookNumber=${dto.bookNumber}">Delete</a>
</body>
</html>