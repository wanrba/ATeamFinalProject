<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<div>
	<form action="mypageUpForm.do" method="post" onsubmit="return checkValue()">
		<div>
			<label for="user_id">���̵�</label>
			<input type="text" id="user_id" name="user_id" class="default" 
			readonly="readonly" value="${sessionScope.sessionID}">
            <br>
			<label for="user_pwd">��й�ȣ</label>
			<input type="password" id="user_pwd" name="user_pwd" 
			value="" placeholder="">
			<h6>���� Ȯ���� ����  Password�� �Է����ּ���.</h6>
            <label>${emsg }</label>
			<input type="submit" value="Ȯ��">
			<input type="button" onclick="location.href='index.do'"value="���">
		</div>
	</form>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
