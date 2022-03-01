<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<c:import url="../template/header_css.jsp"></c:import>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>
	<h1>Notice List</h1>
		<table>
		<tr>
			<th>Num</th>
			<th>Title</th>
			<th>Writer</th>
			<th>Regdate</th>
			<th>hit</th>
		</tr>
		<c:forEach items="${list}" var="dto">
		<tr>
			<th>${dto.num}</th>
			<th><a href="./detail?num=${dto.num}">${dto.title }</a></th>
			<th>${dto.writer }</th>
			<th>${dto.regDate }</th>
			<th>${dto.hit }</th>
		</tr>
		</c:forEach>
		<a href="./add">ADD</a>
</body>
</html>