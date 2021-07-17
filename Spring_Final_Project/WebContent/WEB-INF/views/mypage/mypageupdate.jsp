<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<script>
	window.onload = function(){
    	var txt="${num}";
    	if(txt=="0"){
    		alert("회원가입에 실패 하셨습니다");
    	}else if(txt=="1"){
        	alert("회원가입이 완료되셨습니다");
        	alert("본인의 고유번호는 :${pk}입니다.");
        	if(confirm('회원가입을 완료했습니다 로그인하시겠습니까?')){
        		location="login.do";
    		}else{
    			location="index.do";
    		}
        }
	}
</script>
<div>
	<form action="updateComplete.do" method="post" onsubmit="">
		<div>
			<label for="user_id">아이디</label>
			<input type="text" id="user_id" name="user_id" class="default" 
			readonly="readonly" value="${info.user_id}">
		<!-- 	<input type="button" id="idcheckBtn" value="중복확인버튼"> -->
			<div id="target1"></div>
		</div>
		<div>
			<label for="user_pwd">비밀번호</label>
			<input type="password" id="user_pwd" name="user_pwd" value="${info.user_pwd}" placeholder="">
			<div id="target2" style="color:red;">비밀번호는 6글자 이상, 16글자 이하 !,@,#,$,% 의 특수문자를 하나이상 사용해주시기 바랍니다"</div>
		</div>
		<div>
			<label for="pwdcheck">비밀번호확인</label>
			<input type="password" id="pwdcheck" name="pwdcheck" value="${info.user_pwd}">
			<div id="target3"></div>
		</div>
		
		<div>
			<label for="user_name">이름</label>
			<input type="text" id="user_name" name="user_name" 
			readonly="readonly" value="${info.user_name}">
		</div>
		
		<div>
			<label for="user_couplename">연인 이름</label>
			<input type="text" id="user_couplename" name="user_couplename" 
			readonly="readonly" value="♡최아린♡">
		</div>
		
		<div>
			<label for="user_birth">주민등록번호("-"없이 작성해주세요)</label>
			<input type="text" name="user_birth" id="user_birth" 
			readonly="readonly" value="${info.user_birth}" onfocus="OnChecknumber(this)" 
     		onKeyup="OnChecknumber(this)">
		</div>
		<div>
			<label for="user_phone" style="text-align: left;"><b>연락처("-"없이 작성해주세요)</b><br>
     		<input type="tel"  name="user_phone" value="${info.user_phone}" id="user_phone" 
     		 onfocus="OnCheckPhone(this)" 
     		onKeyup="OnCheckPhone(this)" size="14" maxlength="14" style="width: 500px;"></label>
		</div>
		<div>
			<label for="user_dday">연인이 된 날짜</label>
			<input type="date" id="user_dday" name="user_dday" value="${info.user_dday}">
		</div>
		<div>
			<input type="submit" id="signupbtn" name="signupbtn" value="수정완료">
			<input type="button"  onclick="location.href='index.do'" value="취소">
		</div>
	</form>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script>
	function signup(){
		var idv = $("#user_id").val();
		var pwdv = $("#user_pwd").val();
		var pwdcheckv = $("#pwdcheck").val();
		
		var namev = $("#user_name").val();
		var birthv = $("#user_birth").val();
		var phonnumv = $("#user_phone").val();
		var user_ddayv = $("#user_dday").val();
	/* 	var nameclass = $('#user_id').attr('class'); */
		if(!idv){
			alert("아이디가 없습니다");
			return false;
		}
		/* if(nameclass=="default"){
			alert("아이디 중복체크 바랍니다");
			return false;
		} */
		if(!pwdv){
			alert("비밀번호가 없습니다");
			return false;
		}
		if(!pwdcheckv){
			alert("비밀번호 확인 칸을 입력하지 않으셨습니다.");
			
			return false;
		}else{
			if(pwdv != pwdcheckv){
				alert('비밀번호를 다시 확인해주세요')
				return false;
			}	
		}
		
		if(!namev){
			alert("이름이 없습니다");
			return false;
		}
		if(!birthv){
			alert("생년월일이 없습니다");
			return false;
		}
		if(!phonnumv){
			alert("휴대폰 번호가 없습니다");
			return false;
		}
		if(!user_ddayv){
			alert("커플이 아니면 회원가입이 안됩니다");
			return false;
		}
	}
	$(function(){
		/* $("#idcheckBtn").click(function(){
			var idv = $('#user_id').val();
			//alert('작동'+idv);
			if($('#user_id').attr('class')=="default"){
				$.ajax({
					url:"loginAction.do?user_id="+idv,
					type:"GET",
					success:function(data){
	               		if(data ==1){
	                		$('#target1').css('color','blue');
	                		$('#target1').html('사용가능한 아이디');
	                		if(confirm('이 아이디로 사용하시겠습니까?')){
	                			$('#target1').html('중복체크완료');
	                			$('#user_id').removeClass();
	                			$("#user_id").attr("readonly",true);
	                			$('#idcheckBtn').attr('value','아이디 수정');
	                		}
	           	     	}else{
	           	     		$('#target1').css('color','red');
	           	     		$('#target1').html('사용불가능한 아이디입니다');
	          	      }
	                
	         	   }
				
				})
			}else{
				if(confirm('아이디를 수정하시겠습니까?')){
					$('#target1').html('사용가능한 아이디');
    				$('#user_id').addClass("default");
    				$("#user_id").attr("readonly",false);
    				$('#idcheckBtn').attr('value','중복확인버튼');
				}
			}
		}) */
		$('#user_pwd').blur(function(){
			var pwdv = $("#user_pwd").val();
			var SC = ["!","@","#","$","%"];
            var check_SC = 0;
			if(pwdv.length < 6 || pwdv.length > 16){
            	$('#target2').html('비밀번호는 6글자 이상, 16글자 이하만 이용 가능합니다.');
                $('#user_pwd').val("");
            }else{
            	for(var i=0;i<SC.length;i++){
                    if(pwdv.indexOf(SC[i]) != -1){
                		check_SC = 1;
                	}
                }
                if(check_SC == 0){
                   	$('#target2').html('!,@,#,$,% 의 특수문자가 들어가 있지 않습니다.');
                   	$('#user_pwd').val("");
                }else{
                    $('#target2').html(''); 
            	}
            }
		});
		// 비밀번호 확인후 포커스 옮길 시 비밀번호 와 맞는지 확인
		$('#pwdcheck').blur(function(){
			var pwdv = $("#user_pwd").val();
			var pwdcheckv = $("#pwdcheck").val();
            
			if(!pwdcheckv){
				
			}else{
				if(pwdv != pwdcheckv){
					$('#target3').css('color','red');
					$('#target3').html("비밀번호가 다릅니다");
				}else{
					$('#target3').css('color','blue');
					$('#target3').html("비밀번호 확인 완료했습니다");
				}
			}
			
		});
		
		
		
		/* $(".input").on("keyup",function(key){
        	if(key.keyCode==13) {
          		alert("엔터키 이벤트");
        	}
    	}); */
	});
	
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
	//주민번호 받는곳
	function OnChecknumber(oTa) { 
		//var oForm = oTa.form ; 
	    var sMsg = $('#user_birth').val() ; 
	    var onlynum = "" ; 
	    var imsi=0; 
	    onlynum = RemoveDash2(sMsg);  //하이픈 입력시 자동으로 삭제함 
	    onlynum =  checkDigit(onlynum);  // 숫자만 입력받게 함 
	    var retValue = "";   //휴대폰일 경우  
	    if (GetMsgLen(onlynum) == 6) oTa.value = onlynum.substring(0,6) + "-";
	    if (GetMsgLen(onlynum) == 8) oTa.value = onlynum.substring(0,6) + "-" + onlynum.substring(7);
	        
	}
</script>