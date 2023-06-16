<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==" crossorigin="anonymous" />
<link rel="stylesheet" href="/resources/css/user/style.css" />
<link rel="stylesheet" href="/resources/css/user/login.css"/>
<script src='https://code.jquery.com/jquery-3.3.1.min.js'></script>
</head>
<body>
	<div class="main-container">
		<div class="logo-img">
			<img alt="" src="/resources/css/user/cyworld.png">
		</div>
		<div class="right-box">
			<h2>CYWORLD</h2>
			<form action="/user/login" method="post" id="loginForm" name="loginForm"> 
				<table>
					<tr>
						<!-- <td>아이디</td> --><!-- 아이디를 입력하는 텍스트 -->
						<td><input type="text" class="memberId" name="memberId" placeholder="아이디" style="width : 250px;"></td>
					</tr>
					<tr>
						<!-- <td>비밀번호</td> --><!-- 비밀번호를 입력하는 텍스트 -->
						<td><input type="password" class="memberPw" name="memberPw" placeholder="비밀번호"  style="width : 250px;"></td>
					</tr>
					<tr>
						<!-- <c:url value="/user/register" var="rurl" />-->
						<td colspan="2" align="center">
							<!-- form태그에 입력된 데이터를 보내는 버튼 -->
							<input type="button" class="login-input" value="로그인" >&nbsp;&nbsp;
						</td>
					</tr>
					<tr>
						<td colspan="2" align="center">
							<input type="button" value="아이디 찾기">
							<input type="button" value="비밀번호 재설정">
							<!-- 회원가입페이지로 이동하는 버튼 -->
							<input type="button" value="회원 가입" onclick="location.href='/user/register'">
						</td>
					</tr>		
				</table>
			</form>  
		</div>
	</div>
</body>
<script type="text/javascript">

$(document).ready(function() {
	$(".login-input").click(function() {
		if($(".memberId").val() == '') {
			alert("아이디를 입력해주세요.");
			return false;
		}
		if($(".memberPw").val() == '') {
			alert("비밀번호를 입력해주세요.");
			return false;
		}
	
	var formValues = $("form[name=loginForm]").serialize();	
	
	var con = confirm("로그인 하시겠습니까?");	
	if(con == true){
		$.ajax({
			aysnc: false,
			type: "post",
			url: "./login",
			data: formValues,
			dataType: "html",
			contentType: "application/x-www-form-urlencoded; charset=UTF-8",
			success : function(data) {
				if(data == 1) {
					alert("로그인 성공");
					location.href ="/album/albumList";
				} else if(data == 0) {
					alert("로그인 실패");
					return false;
				}
			},
			error : function(e) {
				alert("error");
				window.onload();
				}
			})
		}
	})
})

 setInterval(createSnow, 100);
 
 function createSnow() {
    const snow = document.createElement('i');
    snow.classList.add('fas');
    snow.classList.add('fa-snowflake');
    snow.style.left = Math.random() * window.innerWidth + 'px';
    snow.style.animationDirection = Math.random() * 3 + 2 + 's';
    snow.style.opacity = Math.random();
    snow.style.fontSize = Math.random() * 10 + 10 + 'px';
  
    document.body.appendChild(snow);
  
    setTimeout(() => {
       snow.remove();
    }, 5000);
 }
</script>
</html>