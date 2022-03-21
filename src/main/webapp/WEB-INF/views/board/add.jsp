<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${board } Reply Page</h1>
	
	<form action="./add" method="post" id="frm" enctype="multipart/form-data">
		Title<input type="text" name="title" id="title" >
		Writer<input type="text" name="writer" value="${member.id}" readonly>
		Contents<textarea name="contents" rows="" cols=""></textarea>
		<div id="fileResult">
					<!--
			<div>
				<input type="file" name="files"><button type="button">DEL</button>
			</div>
			<input type="file" name="files">
			<input type="file" name="files">
			-->
		</div>
		<div>
			<button type="button" id="fileAdd">FileAdd</button>
			<button type="button" class="del">Sample DEL</button>
		</div>
		<button type="submit" id = "btn">ADD</button>
	</form>
	<script src="../resources/js/file.js"></script>
	<!--  <script src="../resources/js/notice.js"></script> -->
</body>
</html>