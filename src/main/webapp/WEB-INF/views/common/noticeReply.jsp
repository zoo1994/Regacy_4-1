<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:forEach items="${noticeReply}" var="dto">
	<tr>
		<td id = up${i.index}>${dto.contents}</td>
		<td>${dto.writer}</td>
		<td>
		<c:if test="${member.id eq dto.writer}">
		<button class="udpate" type="button" data-index="${i.index}">update</button>
		<button class="del" type="button" data-num="${dto.replyNum}">delete</button>
		</c:if>
		</td>
	</tr>
</c:forEach>