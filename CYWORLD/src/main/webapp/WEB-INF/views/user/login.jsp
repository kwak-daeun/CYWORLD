<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="stylesheet" href="/resources/css/user/login.css"/>
</head>
<body>
	<div class="main-container">
		<div class="logo-img">
			<img alt="" src="/resources/css/user/cyworld.png">
		</div>
	
		<div class="right-box">
			<h2>CYWORLD</h2>
				<form action='<c:url value="/member/login.do" />' method="post" name="frm"><!-- 로그인 정보를 확인하는 form 태그 -->
					<table>
			<tr>
				<!-- <td>아이디</td> --><!-- 아이디를 입력하는 텍스트 -->
				<td><input type="text" class="user-id" name="userid" value="${userid}" placeholder="아이디" style="width : 250px;" ></td>
			</tr>
			<tr>
				<!-- <td>비밀번호</td> --><!-- 비밀번호를 입력하는 텍스트 -->
				<td><input type="password" class="user-pwd" name="pwd" placeholder="비밀번호"  style="width : 250px;"></td>
			</tr>
			<tr>
				<c:url value="/member/join.do" var="jurl" />
				<td colspan="2" align="center">
					<!-- form태그에 입력된 데이터를 보내는 버튼 -->
					<input type="submit" class="login-input" value="로그인" onclick="return loginCheck()">&nbsp;&nbsp; 
			</tr>

			<tr>
				<td colspan="2" align="center">
				
					<input type="button" value="아이디 찾기">
					<input type="button" value="비밀번호 재설정">
					<!-- 회원가입페이지로 이동하는 버튼 -->
					<input type="button" value="회원 가입" onclick="location.href='${jurl}'">
			</td>
			</tr>		
			<tr>
				<td colspan="2">${message}</td>
			</tr>
				</table>
			</form>
		</div>
	</div>
</body>
<Script type="text/javascript">

</Script>
</html>