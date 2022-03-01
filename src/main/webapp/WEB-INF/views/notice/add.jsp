<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Add Page</h3>

	<form action ="./add" method="post">
	<input type="hidden" readonly="readonly"name ="num" value="${dto.num}">
		Title <input type="text" name="title" >
		Writer<input type="text" name="writer">
		Contents <textarea name="contents" rows="" cols=""></textarea>
		<input type="submit" value="Add">
		
	</form>
</body>
</html>