<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<div>
	<form action="mypageUpForm.do" method="post" onsubmit="return checkValue()">
		<div>
			<label for="user_id">아이디</label>
			<input type="text" id="user_id" name="user_id" class="default" 
			readonly="readonly" value="${sessionScope.sessionID}">
            <br>
			<label for="user_pwd">비밀번호</label>
			<input type="password" id="user_pwd" name="user_pwd" 
			value="" placeholder="">
			<h6>본인 확인을 위해  Password를 입력해주세요.</h6>
            <label>${emsg }</label>
			<input type="submit" value="확인">
			<input type="button" onclick="location.href='index.do'"value="취소">
		</div>
	</form>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
