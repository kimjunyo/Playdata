<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<%
	request.setCharacterEncoding("UTF-8");
%>

<html>
<head>
<meta charset=UTF-8>
<title>회원 정보 출력창</title>
</head>
<body>
	<table border="1" align="center" width="80%">
		<tr align="center" bgcolor="lightgreen">
			<td><b>번호</b></td>
			<td><b>제목</b></td>
			<td><b>내용</b></td>
			<td><b>작성일</b></td>
			<td><b>아이디</b></td>
			<td><b>삭제</b></td>
		</tr>

		<c:forEach var="board" items="${boardsList}">
			<tr>
				<td align="center">${board.articleNo}</td>
				<td align="center">${board.title}</td>
				<td>
				<c:if test="${board.level ne 1}">
				<c:forEach begin="1" end="${board.level}" step="1">
				<a style="padding: 10px"></a>
				</c:forEach>
				<a>ㄴ</a>
				</c:if>
				${board.content}</td>
				<td align="center">${board.writeDate}</td>
				<td align="center">${board.id}</td>
				<td align="center"><a
					href="${contextPath}/board/deleteBoards.do?articleNo=${board.articleNo}">삭제하기</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="${contextPath}/board/boardForm.do"><h1
			style="text-align: center">게시물등록</h1></a>
</body>
</html>
