<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Update Page</h3>
	<form action ="./update" method="post">
	<input type="hidden" readonly="readonly"name ="num" value="${dto.num}">
		Title <input type="text" name="title" value="${dto.title}">
		Contents <textarea name="contents" rows="10" cols="">${dto.contents }</textarea>
		<input type="submit" value="Update">
		
	</form>
</body>
</html>