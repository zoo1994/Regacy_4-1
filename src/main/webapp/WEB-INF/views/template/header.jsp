<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
      rel="stylesheet">

<div class = "header">
		<nav class="nav_main">
			<ul>
				<li><a href="/s1">HOME</a></li>
				<li><a href="/s1/notice/list?name=sj&age=29&name=sjj">Notice</a></li>
				<li><a href="/s1/qna/list">QnA</a></li>
				<li><a href="/s1/bankbook/list">Product</a></li>		
			</ul>
		</nav>
		<nav class="nav_sub">
			<ul>
			<c:choose>
				<c:when test="${not empty member }">
				<li><a href="/s1/member/mypage">My page</a></li>
				<li><a href="/s1/member/logout">로그아웃</a></li>
				</c:when>
				<c:otherwise>
				<li><a href="/s1/member/login">로그인	<span class="material-icons icon">login</span></a></li>
				<li><a href="/s1/member/join">회원가입<span class="material-icons icon">
person_add
</span></a></li>
				</c:otherwise>
			</c:choose>
			</ul>
		</nav>
	</div>