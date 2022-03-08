<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Member Join Page</h1>
	<div>
		<form action="./join" method="post" id="frm" enctype="multipart/form-data">
			<fieldset>
				<legend>ID</legend>
				<input type="text" name="id" id="idx">
				<div id="idCheck"></div>
			</fieldset>
			<fieldset>
				<legend>PassWord</legend>
				<input type="password" id="pw" name="pw"
					placeholder="8글자 이상 12글자 이하로 작성">
				<div id="pwResult"></div>
			</fieldset>
			<fieldset>
				<legend>PassWord확인</legend>
				<input type="password" id="pw2" name="pw2"
					placeholder="8글자 이상 12글자 이하로 작성">
				<div id="pwCheck"></div>
			</fieldset>
			<fieldset>
				<legend>Name</legend>
				<input type="text" name="name" id="namex">
				<div id="nameCheck"></div>
			</fieldset>
			<fieldset>
				<legend>Email</legend>
				<input type="text" name="email" id="email">
				<div id="emailCheck"></div>
			</fieldset>
			<fieldset>
				<legend>Phone</legend>
				<input type="text" name="phone" id="phone">
				<div id="phoneCheck"></div>
			</fieldset>
			<fieldset> 
				<legend>Photo</legend>
				<input type="file" name="photo" id="photo">
			</fieldset>
			<fieldset>
				<button type="button" id="btn">Join</button>
			</fieldset>
		</form>
	</div>
	<script src="../resources/js/join2.js"></script>
</body>
</html>