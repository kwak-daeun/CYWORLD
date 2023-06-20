<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록</title>
</head>
<style>
.button {
	border: none;
	background: none;
	cursor: pointer;
	color: Gray;
}

.modify {
	border: none;
	background: none;
	cursor: pointer;
	color: Gray;
}

.delete {
	border: none;
	background: none;
	cursor: pointer;
	color: Gray;
}

#insertf{
	background: WhiteSmoke;
}
	
thead {
 	border-top: 1px solid DarkGrey;
	height: 30px;
	color: Gray;
	background: WhiteSmoke;
}

tbody {
}
</style>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
});

function writeForm() {
	var BookId = $("#bookId").val();
	var BookContent = $("#bookContent").val();
	if (BookId == "") {
		alert('이름을 작성하세요');
		return false;
	} else if (BookContent == "") {
		alert('내용을 작성하세요');
		return false;
	} else if (confirm('방명록을 등록하시겠습니까?') == false) {
		return false;
	} else {
		alert('방명록이 등록되었습니다.');
	}
}

$(function(){
	$('.modify').click(function(){
		var id = $(this).attr('id');
		var txt = $('#con_'+id).text();
		$('#con_'+id).html("<textarea style='height: 170px; width: 435px;' id='mo_"+id+"'>"+ txt 
		+"</textarea>");
		$('#btn_'+id).html(
				"<input type='button' class='button' value='확인' onclick='up("+id+")'>"+" |"
				+"<input type='button' class='button' value='취소' onclick='lst()'>");
	});
});

function up(id){
	var modifyContent = $('#mo_'+id).val();
	var formData = "bookNo=" +id+'&bookContent='+modifyContent;
	
	if(modifyContent == ""){
		alert('내용을 작성해주세요.');
		return false;
	}else if(confirm('방명록을 수정하시겠습니까?') == false){
		location.href = "./bookList";
	}else{
	$.post('${path}/bookModify',formData, function(data){
		location.href = "./bookList";
		alert('수정되었습니다.');
	});
	}
}

function del(bookNo){
	var formData="bookNo=" +bookNo;
	
	if(confirm('삭제하시겠습니까?')==true){
	$.post("${path}/bookDelete",formData, function(data){
		
		});
		alert('삭제되었습니다.');
		location.href = "./bookList";
	}else{
		return false;
	}
	
}
 
 function lst(){
	 location.reload();
 }
</script>
<body>
ㅇㅇㅇㅇㅇ
	<form action="./bookInsert" id="wform" name="wform" method="post">
		<div>
			<table width="600" rules="none" id="insertf" >
				<tr>

					<td colspan="2">이름 <input type="text" id="bookId"
						name="bookId">
					</td>
					<!-- 나중에 로그인세션 끌어오고 이거 없애기 hidden으로 넘기기  -->
				</tr>


				<tr style="height: 200px;">
					<td width="27%" align="center">이미지</td>
					<td><textarea id="bookContent" name="bookContent"
							style="height: 170px; width: 410px;"></textarea></td>
				</tr>
				<tr>
					<td colspan="2" align="right"><input type="submit" bording="" value="등록"
						onclick="return writeForm();" /></td>
				</tr>
			</table>

		</div>
	</form>
<br><br>
	<div>
			<table width="600" rules="none">
				<c:forEach items="${Blist}" var="Blist">
					<colgroup>
						<col width="13%" />
						<col width="13%" />
						<col width="54%" />
						<col width="20%" />
					</colgroup>
					<thead>
						<tr>
							<th style="font-size:13px">No. ${Blist.bookNo}</th>
							<th>${Blist.bookId}</th>
							<th align="left" style="font-size:13px">
							<fmt:formatDate value="${Blist.bookDate}" pattern="(yyyy.MM.dd HH:mm)" /></th>
							<th id="btn_${Blist.bookNo}" align="right">
								<button class="modify" id="${Blist.bookNo}">수정</button> |
								<button class="delete" onclick="del(${Blist.bookNo})">삭제</button>
							</th>
						</tr>

					</thead>

					<tbody>
						<tr style="height: 200px;">
							<td colspan="2" align="center">이미지</td>
							<td colspan="2" id="con_${Blist.bookNo}">${Blist.bookContent}</td>
						</tr>
					</tbody>
				</c:forEach>
			</table>
		
	</div>

</body>
</html>
