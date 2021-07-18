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
	<form>
		<h1>���̵� ã��</h1>
		<div>
			<label><b>�̸�:</b></label> <input type="text" id="user_name" name="user_name"
				required />
		</div>

		<div>
			<label for="user_phone" style="text-align: left;"><b>����ó:</b> <input type="tel" name="user_phone"
				id="user_phone" onfocus="OnCheckPhone(this)"
				onKeyup="OnCheckPhone(this)" size="14" maxlength="14"
				style="width: 500px;"> </label>
		</div> 

		<div id="target1"></div>
		<input id="findIdBtn" name="findIdBtn" type="button" value="���̵�ã��">
		<input id="findPwdBtn" name="findPwdBtn" type="button" value="��й�ȣã��">
		<input id="loginForm" name="loginForm" type="button" value="�α��ιٷΰ���"
			onclick="closeLogin()">
	</form>

	<script>

		function closeLogin() {
			window.close()
		}
	</script>

	<script>
	//����ó �޴°�
	function OnCheckPhone(oTa) { 
		//var oForm = oTa.form ; 
	    var sMsg = $('#user_phone').val() ; 
	    var onlynum = "" ; 
	    var imsi=0; 
	    onlynum = RemoveDash2(sMsg);  //������ �Է½� �ڵ����� ������ 
	    onlynum =  checkDigit(onlynum);  // ���ڸ� �Է¹ް� �� 
	    var retValue = ""; 
	        //if(onlynum.substring(0,2) == 01) {  //�޴����� ��� 
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

	<!-- 	<script>
	$(document).ready(function() {
		
		
		$("#findIdBtn").on("click", function() {
			
			if($("#user_name").val() != "" && $("#user_phone").val() != "") {
				var url="user_name_Error.do";
				var user_name=$('#user_name').serialize();
				$.post(url,user_name,function() {
					alert(user_name);
					
				});
				var url="user_birth.do";
				var user_jumin=$('#user_birth').serialize();
				$.post(url,user_name,function() {	
				});
				
			}else if($("#user_name").val()==""){ //ã�� �̸��� ���ٸ�
			alert("�̸��� �Է��ϼ���.");
			}else if($("#user_phone").val()=="") { //db�� ��ϵ� �ֹε�Ϲ�ȣ�� ���ٸ�
				alert("�޴��ȣ�� �Է��ϼ���.");
			}
		});
	})
	
	
	</script> -->


	<script>
		$(function() {
			$('#findIdBtn').click(
					function() {
						var namev = $('#user_name').val();
						var phonev = $('#user_phone').val();
						$.ajax({
							url : "findId.do?user_name="
									+ encodeURIComponent(namev)
									+ "&user_phone=" + phonev,
							type : "GET",
							success : function(data) {

								$('#target1').css('color', 'blue');
								$('#target1').html("id: " + data);

							}
						})
					});
		});
	</script>

<script>
		$(function() {
			$('#findPwdBtn').click(
					function() {
						location.href="pwdFind.do"
					});
		});
	</script>

</body>
</html>