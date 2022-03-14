<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>My Page</h1>
	<h3>Name : ${member.name}</h3>
	<h3>Id : ${member.id}</h3>
	<h3>Email : ${member.email}</h3>
	<h3>Phone : ${member.phone}</h3>
	<img alt="" src="../resources/upload/member/${member.memberFileDTO.fileName}">
	<a href="./photoDown?fileNum=${member.memberFileDTO.fileNum}">
	${member.memberFileDTO.oriName}
	</a>
	<h3>${member.memberFileDTO.oriName}</h3>
</body>
</html>
