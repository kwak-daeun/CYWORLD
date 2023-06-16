<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 찾기</title>
<link rel="stylesheet" href="/resources/css/user/findId.css"/>
<script src='https://code.jquery.com/jquery-3.3.1.min.js'></script>
</head>
<body>
<form method="post" id="findId" name="findId" action="/user/fidnId">
	<div class="form-label-group">
			<input type="text" id="name" name="name" class="findName"/>
			<label for="name">닉네임</label>
	</div>
	<div class="form-label-group">
			<input type="text" id="userId" name="userId" class="findUserId"/>
			<label for="userId">아이디</label>
	</div>
	<div class="form-label-group">
			<input class="btn btn-lg btn-secondary btn-block text-uppercase"
				type="submit" value="check">
	</div>
	
	<!-- 정보가 일치하지 않을때 -->
	<c:if test="$ {check == 1}">
			<script>
				opener.document.findId.name.value = "";
				opener.document.findId.userId.value = "";
			</script>
	</c:if>
	
	<!-- 이름과 비밀번호가 일치하지 않을때 -->
	<c:if test="${check ==0 }">
		<div>
			<label>비밀번호를 변경해주세요.</label>
		</div>
	</c:if>
					

</form>

</body>
</html>