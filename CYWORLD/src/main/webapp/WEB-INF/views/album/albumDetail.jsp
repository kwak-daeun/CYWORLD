<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="https://code.jquery.com/jquery-2.2.4.min.js"></script>

<script type="text/javascript">

$(document).click(function() {
	// 자동 submit 방지
	$('#detailForm').submit(function(event){
		event.preventDefault();
	})
	
	// 돌아가기
	$("#btnCancel").click(function() {
		history.go(-1);
	})
	
	// 수정
	$("#btnUpdate").click(function() {
		var udp = confirm("수정하시겠습니까?")
		if(udp == true) {
			$.ajax({
				url: "/album/albumUpdate"
				, type:	"post"
				, data :{
					albumNo : $("#albumNo").val()
					, albumTitle : $("#albumTitle").val()
					, albumContent : $("#albumContent").val()
					, albumDate : $("#albumDate").val()
				}
				, dataType: "json"
				, success: function(data) {
					console.log(data)
					if(data.m == false) {
						alert(data.message)
						return false;
					} else if(data.m == true) {
						var con = confirm("메인으로 돌아가시겠습니까?")
						if(con == true) {
							alert("메인페이지 이동")
							location.href = "/album/albumList"
						}
					}
				}
				, error: function() {
					alert("수정 실패")
				}
			})
		} else {
			return false;
		}
	})
	
	// 삭제
	$("#btnDelete").click(function() {
		var del = confirm("삭제하시겠습니까?")
		if(del == true) {
			$.ajax({
				url: "/album/albumDelete"
				, type: "post"
				, data: {
					albumNo : $("#album").val()
				}
				, dataType: "json"
				, success: function(data) {
					alert("삭제 완료")
					location.href = "/album/albumList"
				}
				, error: function() {
					alert("삭제 실패")
				}
			})
		} else {
			return false;
		}
	})
	
	// 취소 버튼 클릭
	/* $("#btnCancel").click(function() {
		history.go(-1)
	})
	
	// 파일 보이기	
	if( ${ empty albumFile } ) {
		$("#newFile").show()
	} else {
		$("#originFile").show()
	}
	
	$("#deleteFile").click(function() {
		$("#newFile").toggle()
// 		$("#originFile").toggle()
		$("#originFile").toggleClass("through")
	}) */
})

function readURL(input) {
	var file = input.files;
	
	if( !/\.(gif|jpg|jpeg|png)$/i.test(file[0].name) ) {
		alert('gif, jpg, png 파일만 선택해 주세요.\n\n현재 파일 : ' + file[0].name);
	
		input.outerHTML = input.outerHTML;

		document.getElementById('preview').innerHTML = '';
	} else {
		var reader = new FileReader();

		reader.onload = function(rst) {
			document.getElementById('preview').src = rst.target.result;
		}
	
		reader.readAsDataURL(input.files[0]);
	}
}

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

.albumTitle {
	float: left;
	padding: 0;
	margin: 0;
}

.albumFile {
	float: left;
	padding: 0;
	margin: 0;
}

#preview {
	float: left;
}

</style>

</head>
<body>

<div class="list">
	<form action="/album/albumDetail" method="post" id="detailForm" name="detailForm" enctype="multipart/form-data">
		<input type="hidden" id="albumNo" name="albumNo" value="${ detailAlbum.albumNo }">
		<table>
			<%-- <tr>
				<th class="btnListNo">번호</th>
				<td class="btnListNo">${ detailAlbum.albumNo }</td>
				<th>제목</th>
				<td><input type="text" id="albumTitle" name="albumTitle" value="${ detailAlbum.albumTitle }"></td>
				<th>날짜</th>
				<td>${ detailAlbum.albumDate }</td>
			</tr>
			<tr>
			</tr>
			<tr>
				<th>내용</th>
				<td colspan="6"><input type="text" id="albumContent" name="albumContent" value="${ detailAlbum.albumContent }"></td>
			</tr> --%>
			
			<tr>
				<th>제목</th>
				<td>
					<input type="text" id="albumTitle" name="albumTitle" class="albumTitle" value="${ detailAlbum.albumTitle }">
				</td>
			</tr>	
	
			<tr>
				<th>내용</th>
				<td>
					<div>
						<img id="preview" name="" class="">
					</div>
					<div>
						<textarea rows="1" style="width: 500px;" id="albumContent" name="albumContent" class="albumContent">${ detailAlbum.albumContent }</textarea>
					</div>
				</td>
			</tr>
			
			<%-- <tr class="form-group">
				<th id="fileBox"></th>
					<td id="originFile">
						<a href="/album/download?fileNo=${ albumFile.albumNo }">${ albumFile.albumOriginName }</a>
						<span id="deleteFile">X</span>
					</td>

					<td id="newFile">
						<label for="file">새로운 첨부파일</label>
						<input type="file" id="file" name="file">
					</td>
			</tr> --%>
			
			<tr>
				<th>첨부파일</th>
				<td>
					<input type="file" id="file" name="file" class="albumFile" onchange="readURL(this);">
				</td>
			</tr>
		</table>
	
		<div class="btn">
			<button type="button" id="btnUpdate">수정</button>
			<button type="button" id="btnDelete">삭제</button>
			<button type="button" id="btnCancel">돌아가기</button>
		</div>
	</form>
</div>

</body>
</html>