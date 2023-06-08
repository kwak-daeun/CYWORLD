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
	
	// 돌아가기
	$("#btnCancel").click(function() {
		console.log("btnCancel Click")
	})
	
	// 작성
	$("#btnWrite").click(function() {
		console.log("btnWrite Click")
		let albumFroM = document.albumFroM;
		let album_title = document.getElementById('albumTitle').value;
		let album_content = document.getElementById('albumContent').value;

		if(album_title == "") {
			alert("제목을 입력해주세요.")
			return false;
		} else if(album_content == "") {
			alert("내용을 입력해주세요.")
			return false;
		}
		
		var wri = confirm("글을 등록하겠습니까?")
		if(wri == true) {
			$.ajax({
				url: "/album/albumWrite"
				, type: "post"
				, async: false
				, data: {
					albumTitle: $("#albumTitle").val()
					, albumContent : $("#albumContent").val()
				}
				, dataType: "json"
				, success: function(data) {
					if(data.map == false) {
						alert(data.message)
						return false;
					} else {
						var con = confirm("메인으로 돌아가시겠습니까?")
						if(con == true) {
							alert("메인페이지 이동")
							location.href = "/album/albumList"
						} else if(con == false) {
							alert("조회페이지 이동")
							location.href = "/album/detail?boardNo=${ detailBoard.boardNo }"
						}
					}
				}
				, error: function() {
					alert("에러 발생")
				}
			})
		} else if(wri == false) {
			return false;
		}
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
	border: 1px solid #ccc;
}

td {
	text-align: center;
	border: 1px solid #ccc;
}

h1 {
	text-align: center;
}

textarea {
	resize: none;
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
	<form action="/album/albumWrite" method="post" id="albumForm" name="albumForm" enctype="multipart/form-data">
		<table>
			<tr>
				<th>제목</th>
				<td>
					<input type="text" id="albumTitle" name="albumTitle" class="albumTitle">
				</td>
			</tr>	
	
			<tr>
				<th>내용</th>
				<td>
					<textarea rows="10" style="width: 500px;" id="albumContent" name="albumContent" class="albumContent"></textarea>
				</td>
			</tr>
			
			<tr>
				<th>첨부파일</th>
				<td>
					<input type="file" id="file" name="file" class="albumFile">
				</td>
			</tr>
		</table>
			
		<div class="btn">
			<button type="submit" id="btnWrite">작성</button>
			<button type="button" id="btnCancel">돌아가기</button>
		</div>
	</form>
</div>

<hr style="margin-top: 50px;">

<footer>
	<h1>사진첩</h1>
</footer>

</body>
</html>