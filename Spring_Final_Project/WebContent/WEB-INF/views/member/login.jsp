<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
	<form action="login.do" method="post" id="loginInfo">
		<!-- 		onsubmit="return checkValue()"> -->
		<table style="width: 300px; border: 1px; margin: auto">
			<tr>
				<th colspan="2">로그인 폼 예제</th>
			</tr>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="user_id" id="user_id"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="user_pwd" id="user_pwd"
					maxlength="10"></td>
			</tr>
			<tr>
				<th colspan="2"><label style="color: red;">${emsg }</label><br>
					<!-- type1 : 폼 데이터를 자바스크립트로 전송 		
				<input type="button" value="로그인" onclick="checkValue()">&nbsp;  -->
					<!-- type2 : submit으로 자바스크립트를 사용해서 전송 --> <input type="submit"
					value="로그인">&nbsp; <input type="button" value="아이디/비밀번호 찾기">
				</th>
			</tr>
			<tr>
				<td>
					<a href = "signup.do">
						<input type = "button" value = "회원가입" />
					</a>
				</td>
			</tr>
		</table>
	</form>