<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<link rel="stylesheet" href="resources/common/css/customerService.css">
<script>
   $(document).ready(function() {
      if("${msg}" === "Ŀ������ ������ �α��� �� �̿����ּ��� ^__^") {
         alert("${msg}");
         location.href = "loginForm.do";
      }
   })

</script>

<div class="attending_area">
	<div id="content" class="sub_wrap more_wrap">

	<!-- Nav -->
	<nav style="padding-left: 200px;">
    	<ul style="width:180px;">
				<li><a href="accountForm.do" class="active">Ŀ������ ���� ����</a></li>
				<li><a href="askForm.do">���� ���� ��ȸ</a></li>
	
			</ul>
		</nav>
	
        <div class="container">

            <div class="row">
                <div class="col-xl-10 offset-xl-1 col-lg-10 offset-lg-1">
                    <div class="main_attending_area">
                        <div class="flower_1 d-none d-lg-block">
                            <img src="resources/views/index/image/appointment/flower-top.png" alt="">
                        </div>
                        <div class="flower_2 d-none d-lg-block">
                            <img src="resources/views/index/image/appointment/flower-bottom.png" alt="">
                        </div>
                        <div class="row justify-content-center">
                            <div class="col-xl-10 col-lg-8">
                                <div class="popup_box ">
                                    <div class="popup_inner">
                                        <div class="form_heading text-center">
                                        	<div class = "col-xl-12">
		                                    	<img src="resources/common/image/logo_banner/logo.png" width="100%" alt="">
		                                    </div>
                                        </div>
                                        <div class = "pt-30"></div>
                                        <form action="makeaccount.do" method="post">
                                        <input type="hidden" id="couple_num" name="couple_num" value="${couple_num }">
                                            <div class="row">
                                            <div class="col-xl-12">
                                            	<input type="text" value="���� ��Ī" style = "width : 40%; background-color: #fbbfa542; text-align: center" readonly="readonly">&nbsp;&nbsp;
                                                <input type="text" id="account_name" name="account_name" class="default" style = "width : 50%">
													
                                             </div>
											<div class="col-xl-12">
                                            	<input type="text" value="���� ��й�ȣ" style = "width : 40%; background-color: #fbbfa542; text-align: center" readonly="readonly">&nbsp;&nbsp;
                                                <input type="password" id="account_pwd" name="account_pwd" class="default" style = "width : 50%" 
                                                placeholder="���� 4�ڸ��� �Է��ϼ���." onkeypress='return checkNumber(event)'>
												<div id="target1"></div>
                                             </div>
                                            <div class="col-xl-12">
                                            	<input type="text" value="��й�ȣ Ȯ��" style = "width : 40%; background-color: #fbbfa542; text-align: center" readonly="readonly">&nbsp;&nbsp;
                                                <input type="password" id="pwdchk" name="pwdchk" class="default" style = "width : 50%" placeholder="��й�ȣ�� �ѹ��� �Է��ϼ���." >
                                                <div id="target2"></div>
													
                                             </div>	
                                                <div class="col-xl-12">
                                                    
                                                    <input type = "submit" value="Ȯ��" id="askBtn" style = "width : 45%; background-color: #fbbfa542;">&nbsp;&nbsp;&nbsp;
                                                    <input type = "button" value = "���" onclick="location='index.do'" style = "width : 45%; background-color: #fbbfa542;"/>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
function checkNumber(event) {
	  if(event.key >= 0 && event.key <= 9) {
	    return true;
	  }
	  
	  return false;
	}


//��� 4�ڸ� �Է��ߴ��� Ȯ��
$('#account_pwd').blur(function(){
	var pwdv = $("#account_pwd").val();
	
	if(pwdv.length > 4){
    	$('#target1').html('��й�ȣ�� 4���ڷ� �Է��ϼ���.');
        $('#account_pwd').val("");
    }
});

//��й�ȣ ������ȣ �Է��ߴ��� Ȯ��
$('#pwdchk').blur(function(){
	var pwdv = $("#account_pwd").val();
	var pwdcheckv = $("#pwdchk").val();
    
	if(!pwdcheckv){
		
	}else{
		if(pwdv != pwdcheckv){
			$('#target2').css('color','red');
			$('#target2').html("��й�ȣ�� �ٸ��ϴ�.");
		}else{
			$('#target2').css('color','blue');
			$('#target2').html("��й�ȣ Ȯ�� �Ϸ�.");
		}
	}
	
});
</script>