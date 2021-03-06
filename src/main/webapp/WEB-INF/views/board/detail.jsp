<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${board} Detail Page</h1>
	
	<h3>Title : ${dto.title}</h3>
	<h3>Writer : ${dto.writer}</h3>
	<h3>Contents : ${dto.contents}</h3>
	<div>
		<c:forEach items="${dto.fileDTOs}" var="f">
			<a href ="../resources/upload/${board}/${f.fileName}">${f.oriName}</a>
			<a href = "./fileDown?fileNum=${f.fileNum}">
			${f.oriName }
			</a>
		</c:forEach>
	</div>
	
	<a href="./list">List</a>
	<c:if test="${member.id eq dto.writer}">
	<a href="./delete?num=${dto.num}">Delete</a>
	<a href="./update?num=${dto.num}">Update</a>
	</c:if>
	<c:if test="${board ne 'Notice'}">
	<a href="./reply?num=${dto.num}">Reply</a>
	</c:if>
</body>
</html>