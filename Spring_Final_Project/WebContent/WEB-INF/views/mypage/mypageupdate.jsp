<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<script>
	window.onload = function(){
    	var txt="${num}";
    	if(txt=="0"){
    		alert("ȸ�����Կ� ���� �ϼ̽��ϴ�");
    	}else if(txt=="1"){
        	alert("ȸ�������� �Ϸ�Ǽ̽��ϴ�");
        	alert("������ ������ȣ�� :${pk}�Դϴ�.");
        	if(confirm('ȸ�������� �Ϸ��߽��ϴ� �α����Ͻðڽ��ϱ�?')){
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
			<label for="user_id">���̵�</label>
			<input type="text" id="user_id" name="user_id" class="default" 
			readonly="readonly" value="${info.user_id}">
		<!-- 	<input type="button" id="idcheckBtn" value="�ߺ�Ȯ�ι�ư"> -->
			<div id="target1"></div>
		</div>
		<div>
			<label for="user_pwd">��й�ȣ</label>
			<input type="password" id="user_pwd" name="user_pwd" value="${info.user_pwd}" placeholder="">
			<div id="target2" style="color:red;">��й�ȣ�� 6���� �̻�, 16���� ���� !,@,#,$,% �� Ư�����ڸ� �ϳ��̻� ������ֽñ� �ٶ��ϴ�"</div>
		</div>
		<div>
			<label for="pwdcheck">��й�ȣȮ��</label>
			<input type="password" id="pwdcheck" name="pwdcheck" value="${info.user_pwd}">
			<div id="target3"></div>
		</div>
		
		<div>
			<label for="user_name">�̸�</label>
			<input type="text" id="user_name" name="user_name" 
			readonly="readonly" value="${info.user_name}">
		</div>
		
		<div>
			<label for="user_couplename">���� �̸�</label>
			<input type="text" id="user_couplename" name="user_couplename" 
			readonly="readonly" value="���־Ƹ���">
		</div>
		
		<div>
			<label for="user_birth">�ֹε�Ϲ�ȣ("-"���� �ۼ����ּ���)</label>
			<input type="text" name="user_birth" id="user_birth" 
			readonly="readonly" value="${info.user_birth}" onfocus="OnChecknumber(this)" 
     		onKeyup="OnChecknumber(this)">
		</div>
		<div>
			<label for="user_phone" style="text-align: left;"><b>����ó("-"���� �ۼ����ּ���)</b><br>
     		<input type="tel"  name="user_phone" value="${info.user_phone}" id="user_phone" 
     		 onfocus="OnCheckPhone(this)" 
     		onKeyup="OnCheckPhone(this)" size="14" maxlength="14" style="width: 500px;"></label>
		</div>
		<div>
			<label for="user_dday">������ �� ��¥</label>
			<input type="date" id="user_dday" name="user_dday" value="${info.user_dday}">
		</div>
		<div>
			<input type="submit" id="signupbtn" name="signupbtn" value="�����Ϸ�">
			<input type="button"  onclick="location.href='index.do'" value="���">
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
			alert("���̵� �����ϴ�");
			return false;
		}
		/* if(nameclass=="default"){
			alert("���̵� �ߺ�üũ �ٶ��ϴ�");
			return false;
		} */
		if(!pwdv){
			alert("��й�ȣ�� �����ϴ�");
			return false;
		}
		if(!pwdcheckv){
			alert("��й�ȣ Ȯ�� ĭ�� �Է����� �����̽��ϴ�.");
			
			return false;
		}else{
			if(pwdv != pwdcheckv){
				alert('��й�ȣ�� �ٽ� Ȯ�����ּ���')
				return false;
			}	
		}
		
		if(!namev){
			alert("�̸��� �����ϴ�");
			return false;
		}
		if(!birthv){
			alert("��������� �����ϴ�");
			return false;
		}
		if(!phonnumv){
			alert("�޴��� ��ȣ�� �����ϴ�");
			return false;
		}
		if(!user_ddayv){
			alert("Ŀ���� �ƴϸ� ȸ�������� �ȵ˴ϴ�");
			return false;
		}
	}
	$(function(){
		/* $("#idcheckBtn").click(function(){
			var idv = $('#user_id').val();
			//alert('�۵�'+idv);
			if($('#user_id').attr('class')=="default"){
				$.ajax({
					url:"loginAction.do?user_id="+idv,
					type:"GET",
					success:function(data){
	               		if(data ==1){
	                		$('#target1').css('color','blue');
	                		$('#target1').html('��밡���� ���̵�');
	                		if(confirm('�� ���̵�� ����Ͻðڽ��ϱ�?')){
	                			$('#target1').html('�ߺ�üũ�Ϸ�');
	                			$('#user_id').removeClass();
	                			$("#user_id").attr("readonly",true);
	                			$('#idcheckBtn').attr('value','���̵� ����');
	                		}
	           	     	}else{
	           	     		$('#target1').css('color','red');
	           	     		$('#target1').html('���Ұ����� ���̵��Դϴ�');
	          	      }
	                
	         	   }
				
				})
			}else{
				if(confirm('���̵� �����Ͻðڽ��ϱ�?')){
					$('#target1').html('��밡���� ���̵�');
    				$('#user_id').addClass("default");
    				$("#user_id").attr("readonly",false);
    				$('#idcheckBtn').attr('value','�ߺ�Ȯ�ι�ư');
				}
			}
		}) */
		$('#user_pwd').blur(function(){
			var pwdv = $("#user_pwd").val();
			var SC = ["!","@","#","$","%"];
            var check_SC = 0;
			if(pwdv.length < 6 || pwdv.length > 16){
            	$('#target2').html('��й�ȣ�� 6���� �̻�, 16���� ���ϸ� �̿� �����մϴ�.');
                $('#user_pwd').val("");
            }else{
            	for(var i=0;i<SC.length;i++){
                    if(pwdv.indexOf(SC[i]) != -1){
                		check_SC = 1;
                	}
                }
                if(check_SC == 0){
                   	$('#target2').html('!,@,#,$,% �� Ư�����ڰ� �� ���� �ʽ��ϴ�.');
                   	$('#user_pwd').val("");
                }else{
                    $('#target2').html(''); 
            	}
            }
		});
		// ��й�ȣ Ȯ���� ��Ŀ�� �ű� �� ��й�ȣ �� �´��� Ȯ��
		$('#pwdcheck').blur(function(){
			var pwdv = $("#user_pwd").val();
			var pwdcheckv = $("#pwdcheck").val();
            
			if(!pwdcheckv){
				
			}else{
				if(pwdv != pwdcheckv){
					$('#target3').css('color','red');
					$('#target3').html("��й�ȣ�� �ٸ��ϴ�");
				}else{
					$('#target3').css('color','blue');
					$('#target3').html("��й�ȣ Ȯ�� �Ϸ��߽��ϴ�");
				}
			}
			
		});
		
		
		
		/* $(".input").on("keyup",function(key){
        	if(key.keyCode==13) {
          		alert("����Ű �̺�Ʈ");
        	}
    	}); */
	});
	
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
	//�ֹι�ȣ �޴°�
	function OnChecknumber(oTa) { 
		//var oForm = oTa.form ; 
	    var sMsg = $('#user_birth').val() ; 
	    var onlynum = "" ; 
	    var imsi=0; 
	    onlynum = RemoveDash2(sMsg);  //������ �Է½� �ڵ����� ������ 
	    onlynum =  checkDigit(onlynum);  // ���ڸ� �Է¹ް� �� 
	    var retValue = "";   //�޴����� ���  
	    if (GetMsgLen(onlynum) == 6) oTa.value = onlynum.substring(0,6) + "-";
	    if (GetMsgLen(onlynum) == 8) oTa.value = onlynum.substring(0,6) + "-" + onlynum.substring(7);
	        
	}
</script>