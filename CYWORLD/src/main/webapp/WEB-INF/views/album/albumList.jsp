<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="https://code.jquery.com/jquery-2.2.4.min.js"></script>

<script type="text/javascript">

$(document).ready(function() {
	// 작성
	$("#btnWrite").click(function() {
		console.log("btnWrite Click")
		location.href = "./albumWrite";
	})
	
	// 삭제
	$("#btnDelete").click(function() {
		console.log("btnDelete Click")
		location.href = "./albumDelete";
	})
	
	// 돌아가기
	$("#btnCancel").click(function() {
		console.log("btnCancel Click")
		location.href = "/book/book";
	})
})

</script>

<style type="text/css">

body {
	font-size: 10px;
}

table {
	margin: 0 auto;
	border: 1px solid #ccc;
}

th {
	text-align: center;
}

td {
	text-align: center;
}

h1 {
	text-align: center;
}

a {
	cursor: pointer;
}

textarea {
	resize: none;
}

.list {
	text-align: center;
	width: 500px;
	margin: 0 auto;
}

.btn {
	text-align: center;
	margin-top: 50px;
}

</style>

</head>
<body>

<header>
	<h1>사진첩</h1>
</header>

<hr style="margin-bottom: 50px;">

<div class="list">
<%-- 	<table>
		<c:forEach items="${ albumList }" var="album">
			<tr>
				<th style="background: #E0E3DA">
				<div>
				<input type="checkbox">
				</div>
				</th>
				<th style="background: #E0E3DA">${ album.albumTitle }</th>
			</tr>
 			<tr style="background: #E0E1DB">
				<th>NO...${ album.albumNo }</th>
				<td>${ album.albumDate }</td>
				<!-- <td style="border: none;"><a type="button">수정</a><a type="button">삭제</a></td> -->
			</tr>
			<tr>
				<td colspan="2">${ album.albumContent }</td>
			</tr>
			<tr>
				<th>댓글</th>
				<td>
					<textarea rows="1" style="width: 300px; height: 18px; float: left;" id="" name="" class=""></textarea>
					<button type="button" style="float: right;">등록</button>
				</td>
			<!-- </tr>
			<tr style="height: 50px; border-bottom: 1px solid #ccc;">
			</tr> -->
		</c:forEach>
	</table> --%>
	<c:forEach items="${ albumList }" var="album">
		<div style="background: #E0E3DA">
			<div>
				<input type="checkbox" style="float: left;">
				<label style="background: #E0E3DA; font-size: 15px;">${ album.albumTitle }</label>
			</div>
		</div>
		<div style="background: #E0E1C0">
			<div>
				<label style="float: left; font-size: 15px;">NO...${ album.albumNo }</label>
				<label style="font-size: 15px;">${ album.albumDate }</label>
			</div>
		</div>
		<div style="margin-bottom: 20px; margin-top: 20px; font-size: 20px;">
			<!-- <td style="border: none;"><a type="button">수정</a><a type="button">삭제</a></td> -->
			<label>${ album.albumContent }</label>
		</div>
		<div>
			<label style="float: left; font-size: 15px;">댓글</label>
				<span><input type="text" id="" name="" class="" style="width: 400px;"></span>
				<span><input type="button" value="등록" style="float: right;"></span>
		</div>
		<hr style="margin-top: 50px; margin-bottom: 50px;">
	</c:forEach>
</div>

<div class="btn">
	<button type="button" id="btnWrite">작성</button>
	<button type="button" id="btnDelete">삭제</button>
	<button type="button" id="btnCancel">돌아가기</button>
</div>

<hr style="margin-top: 50px;">

<footer>
	<h1>사진첩</h1>
</footer>

</body>
</html>