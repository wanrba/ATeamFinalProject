<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
	<form action="login.do" method="post" id="loginInfo">
		<!-- 		onsubmit="return checkValue()"> -->
		<table style="width: 300px; border: 1px; margin: auto">
			<tr>
				<th colspan="2">�α��� �� ����</th>
			</tr>
			<tr>
				<th>���̵�</th>
				<td><input type="text" name="user_id" id="user_id"></td>
			</tr>
			<tr>
				<th>��й�ȣ</th>
				<td><input type="password" name="user_pwd" id="user_pwd"
					maxlength="10"></td>
			</tr>
			<tr>
				<th colspan="2"><label style="color: red;">${emsg }</label><br>
					<!-- type1 : �� �����͸� �ڹٽ�ũ��Ʈ�� ���� 		
				<input type="button" value="�α���" onclick="checkValue()">&nbsp;  -->
					<!-- type2 : submit���� �ڹٽ�ũ��Ʈ�� ����ؼ� ���� --> <input type="submit"
					value="�α���">&nbsp; <input type="button" value="���̵�/��й�ȣ ã��">
				</th>
			</tr>
			<tr>
				<td>
					<a href = "signup.do">
						<input type = "button" value = "ȸ������" />
					</a>
				</td>
			</tr>
		</table>
	</form>