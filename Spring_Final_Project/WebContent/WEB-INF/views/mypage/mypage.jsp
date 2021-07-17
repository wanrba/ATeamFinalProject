<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<div>
	<form action="mypagepwdchk.do" method="post" onsubmit="return signup()">
		<div>
			<label for="user_id">아이디</label>
			<input type="text" id="user_id" name="user_id" class="default" 
			readonly="readonly" value="${info.user_id}">
			<div id="target1"></div>
		</div>
		
		<div>
			<label for="user_pwd">비밀번호</label>
			<input type="password" id="user_pwd" name="user_pwd" 
			readonly="readonly" value="${info.user_pwd}" placeholder="">
			<div id="target2" style="color:red;">비밀번호는 6글자 이상, 16글자 이하 !,@,#,$,% 의 특수문자를 하나이상 사용해주시기 바랍니다"</div>
		</div>
		
		<div>
			<label for="user_name">이름</label>
			<input type="text" id="user_name" name="user_name" 
			readonly="readonly" value="${info.user_name}">
		</div>
		
		<div>
			<label for="user_birth">주민등록번호("-"없이 작성해주세요)</label>
			<input type="text" name="user_birth" id="user_birth" 
			readonly="readonly" value="${info.user_birth}"
			onfocus="OnChecknumber(this)" 
     		onKeyup="OnChecknumber(this)">
		</div>
		
		<div>
			<label for="user_phone" style="text-align: left;"><b>연락처("-"없이 작성해주세요)</b><br>
     		<input type="tel"  name="user_phone" id="user_phone" onfocus="OnCheckPhone(this)"
     		readonly="readonly" value="${info.user_phone}"
     		onKeyup="OnCheckPhone(this)" size="14" maxlength="14" style="width: 500px;"></label>
		</div>
		
		<div>
			<label for="user_dday">연인이 된 날짜</label>
			<input type="date" id="user_dday" name="user_dday" 
			readonly="readonly" value="${info.user_dday}">
		</div>
		
		<div>
			<p><a href="mypagepwdchk.do"><input type="button" id="mypagepwdchk" value="회원정보수정 GO"></a></p>
		</div>
	</form>
</div>
