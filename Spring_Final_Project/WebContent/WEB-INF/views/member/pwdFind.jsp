<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.3.1.js"
	integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
	crossorigin="anonymous"></script>
<title>test1</title>

</head>
<body>
	<form action="pwdFind.do" method="post">
		<h1>비밀번호 찾기</h1>
		<div>
			<label><b>아이디:</b></label> <input type="text" id="user_id" name="user_id"
				required />
		</div>

		<div>
			<label><b>이름:</b></label> <input type="text" id="user_name" name="user_name"
				required />
		</div>

		<div>
			<label for="user_phone" style="text-align: left;"><b>연락처:</b> <input type="tel" name="user_phone"
				id="user_phone" onfocus="OnCheckPhone(this)"
				onKeyup="OnCheckPhone(this)" size="14" maxlength="14"
				style="width: 500px;"></label>
		</div>
		<div id="target1"></div>
		<input id="findPwdBtn" name="findPwdBtn" type="button" value="비밀번호찾기">
		<input id="loginForm" name="loginForm" type="button" value="로그인바로가기"
			onclick="closeLogin()">
	</form>

	<script>
	function closeLogin() {
		window.close()
	}
	
	</script>

	<script>
	
	//연락처 받는것
	function OnCheckPhone(oTa) { 
		//var oForm = oTa.form ; 
	    var sMsg = $('#user_phone').val() ; 
	    var onlynum = "" ; 
	    var imsi=0; 
	    onlynum = RemoveDash2(sMsg);  //하이픈 입력시 자동으로 삭제함 
	    onlynum =  checkDigit(onlynum);  // 숫자만 입력받게 함 
	    var retValue = ""; 
	        //if(onlynum.substring(0,2) == 01) {  //휴대폰일 경우 
	            if (GetMsgLen(onlynum) <= 2) oTa.value = onlynum ; 
	            if (GetMsgLen(onlynum) == 3) oTa.value = onlynum + "-"; 
	            if (GetMsgLen(onlynum) == 4) oTa.value = onlynum.substring(0,3) + "-" + onlynum.substring(3,4) ; 
	            if (GetMsgLen(onlynum) == 5) oTa.value = onlynum.substring(0,3) + "-" + onlynum.substring(3,5) ; 
	            if (GetMsgLen(onlynum) == 6) oTa.value = onlynum.substring(0,3) + "-" + onlynum.substring(3,6) ; 
	            if (GetMsgLen(onlynum) == 7) oTa.value = onlynum.substring(0,3) + "-" + onlynum.substring(3,7) ; 
	            if (GetMsgLen(onlynum) == 8) oTa.value = onlynum.substring(0,3) + "-" + onlynum.substring(3,7) + "-" + onlynum.substring(7,8) ; 
	            if (GetMsgLen(onlynum) == 9) oTa.value = onlynum.substring(0,3) + "-" + onlynum.substring(3,7) + "-" + onlynum.substring(7,9) ; 
	            if (GetMsgLen(onlynum) == 10) oTa.value = onlynum.substring(0,3) + "-" + onlynum.substring(3,6) + "-" + onlynum.substring(6,10) ; 
	            if (GetMsgLen(onlynum) == 11) oTa.value = onlynum.substring(0,3) + "-" + onlynum.substring(3,7) + "-" + onlynum.substring(7,11) ; 
	            if (GetMsgLen(onlynum) == 12) oTa.value = onlynum.substring(0,3) + "-" + onlynum.substring(3,7) + "-" + onlynum.substring(7,11) ; 
	        //} 
	}
	
	function RemoveDash2(sNo) { 
		var reNo = "" 
		for(var i=0; i<sNo.length; i++) { 
		    if ( sNo.charAt(i) != "-" ) { 
		    reNo += sNo.charAt(i) 
		    } 
		} 
		return reNo 
	} 

	function GetMsgLen(sMsg) { // 0-127 1byte, 128~ 2byte 
		var count = 0 
		    for(var i=0; i<sMsg.length; i++) { 
		        if ( sMsg.charCodeAt(i) > 127 ) { 
		            count += 2 
		        } 
		        else { 
		            count++ 
		        } 
		    } 
		return count 
	} 

	function checkDigit(num) { 
	    var Digit = "1234567890"; 
	    var pnum = num; 
	    var len = pnum.length 
	    var retVal = ""; 

	    for (i = 0; i < len; i++) {
	        if (Digit.indexOf(pnum.substring(i, i+1)) >= 0) { 
	            retVal = retVal + pnum.substring(i, i+1); 
	            
	        } 
	    } 
	    return retVal; 
	} 

	</script>

	<script>
	$(function(){
		$('#findPwdBtn').click(function(){
			var idv = $('#user_id').val();
			var namev = $('#user_name').val();
			var phonev = $('#user_phone').val();
				$.ajax({
					url:"findPwd.do?user_id="+idv+"&user_name="+encodeURIComponent(namev)+"&user_phone="+phonev,
					type:"GET",
					success:function(data){
	               		
	                		$('#target1').css('color','blue');
	                		$('#target1').html("pwd: "+data);
	                		
	           	     
	         	   }
		});
	});
	});
	
	
	</script>

</body>
</html>