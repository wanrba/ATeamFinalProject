<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<div>
	<form action="mypagepwdchk.do" method="post" onsubmit="return signup()">
		<div>
			<label for="user_id">���̵�</label>
			<input type="text" id="user_id" name="user_id" class="default" 
			readonly="readonly" value="${info.user_id}">
			<div id="target1"></div>
		</div>
		
		<div>
			<label for="user_pwd">��й�ȣ</label>
			<input type="password" id="user_pwd" name="user_pwd" 
			readonly="readonly" value="${info.user_pwd}" placeholder="">
			<div id="target2" style="color:red;">��й�ȣ�� 6���� �̻�, 16���� ���� !,@,#,$,% �� Ư�����ڸ� �ϳ��̻� ������ֽñ� �ٶ��ϴ�"</div>
		</div>
		
		<div>
			<label for="user_name">�̸�</label>
			<input type="text" id="user_name" name="user_name" 
			readonly="readonly" value="${info.user_name}">
		</div>
		
		<div>
			<label for="user_birth">�ֹε�Ϲ�ȣ("-"���� �ۼ����ּ���)</label>
			<input type="text" name="user_birth" id="user_birth" 
			readonly="readonly" value="${info.user_birth}"
			onfocus="OnChecknumber(this)" 
     		onKeyup="OnChecknumber(this)">
		</div>
		
		<div>
			<label for="user_phone" style="text-align: left;"><b>����ó("-"���� �ۼ����ּ���)</b><br>
     		<input type="tel"  name="user_phone" id="user_phone" onfocus="OnCheckPhone(this)"
     		readonly="readonly" value="${info.user_phone}"
     		onKeyup="OnCheckPhone(this)" size="14" maxlength="14" style="width: 500px;"></label>
		</div>
		
		<div>
			<label for="user_dday">������ �� ��¥</label>
			<input type="date" id="user_dday" name="user_dday" 
			readonly="readonly" value="${info.user_dday}">
		</div>
		
		<div>
			<p><a href="mypagepwdchk.do"><input type="button" id="mypagepwdchk" value="ȸ���������� GO"></a></p>
		</div>
	</form>
</div>
