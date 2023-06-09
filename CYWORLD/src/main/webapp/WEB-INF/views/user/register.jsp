<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="/resources/css/user/register.css"/>
<script src='https://code.jquery.com/jquery-3.3.1.min.js'></script>
</head>
<body>
 <form action="/user/register" method="post" id="registerForm" name="registerForm">
 	<div id="container">
        <div class="content">
            <h2>회원가입</h2>
            <input class="join-input" type="text" id="memberName" name="memberName" placeholder="닉네임">
            <input class="join-input" type="text" id="memberId" name="memberId" placeholder="아이디">
            <button type="button" onclick="idCheck()">아이디 중복확인</button>
            <input class="join-input" type="password" id="memberPw" name="memberPw" placeholder="비밀번호">
            <input class="join-input" type="password" id="memberPw1" name="memberPw" placeholder="비밀번호 확인">
            <button class="join-btn btn" type="button" id="btnJoin">확인</button>
            <a class="login-return-link" href="/user/login">로그인으로 돌아가기</a>
        </div>
    </div>	
 </form>
</body>

<script type="text/javascript">

$(document).ready(function() {
	$("#btnJoin").click(function() {
	    if($("#memberName").val() == '') {
	        alert("닉네임을 입력해주세요.");
	        return false;
	    }
	
	    if($.trim($('#memberId').val()) == '') {
	        alert("아이디 입력해주세요.");
	        return false;
	    }
	    
	    if($.trim($('#memberPw').val()) == '') {
	        alert("비밀번호를 입력해주세요.");
	        return false;
	    }
	    
	    if($.trim($('#memberPw1').val()) == '') {
	        alert("비밀번호를 확인해주세요.");
	        return false;
	    }

		var con = confirm("회원가입 하시겠습니까?");
		
		if(con == true){
			$.ajax({
				aysnc: false,
				type: "post",
				url: "./register",
				data: {
					memberId: $("#memberId").val()
					, memberPw: $("#memberPw").val()
					, memberName: $("#memberName").val()
				},
				dataType: "html",  //HTML 쓰는 이유는 
				contentType: "application/x-www-form-urlencoded; charset=UTF-8",
				success : function(data){
					console.log(data)
					alert("회원가입 요청 성공");
					location.href = "/user/login";
				},
				error : function(e){
					console.log(e)
					alert("회원가입 실패");
					location.href = "/user/register";
				}
			});
		}
	})
})

</script>
</html>