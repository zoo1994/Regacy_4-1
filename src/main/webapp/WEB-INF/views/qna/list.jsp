<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/header_css.jsp"></c:import>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>
	<h1>Qna List page</h1>
	
	<table>
		<tr>
			<td>Num</td><td>Title</td><td>Contents</td><td>Writer</td>
		</tr>
		<c:forEach items="${list}" var="dto">
		<tr>
			<td>${dto.num}</td>
			<td><a href="./detail?num=${dto.num}">${dto.title}</a></td>
			<td>${dto.contents}</td>
			<td>${dto.writer}</td>
		</tr>
		
		</c:forEach>
		
		<a href="./add">ADD</a>
	</table>

</body>
</html>