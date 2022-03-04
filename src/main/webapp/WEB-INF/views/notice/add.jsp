<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Notice Add Page</h1>
	
	<form action="./add" method="post" id="frm">
		Title<input type="text" name="title" id="title" >
		Writer<input type="text" name="writer" id = "writer">
		Contents<textarea name="contents" rows="" cols=""></textarea>
		<button type="button" id = "btn">ADD</button>
	</form>
	<script src="../resources/js/notice.js"></script>
</body>
</html>