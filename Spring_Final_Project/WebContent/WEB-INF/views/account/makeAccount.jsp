<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<link rel="stylesheet" href="resources/common/css/customerService.css">
<script>
   $(document).ready(function() {
      if("${msg}" === "커플통장 개설은 로그인 후 이용해주세요 ^__^") {
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
				<li><a href="accountForm.do" class="active">커플통장 계좌 개설</a></li>
				<li><a href="askForm.do">통장 내역 조회</a></li>
	
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
                                            	<input type="text" value="통장 별칭" style = "width : 40%; background-color: #fbbfa542; text-align: center" readonly="readonly">&nbsp;&nbsp;
                                                <input type="text" id="account_name" name="account_name" class="default" style = "width : 50%">
													
                                             </div>
											<div class="col-xl-12">
                                            	<input type="text" value="통장 비밀번호" style = "width : 40%; background-color: #fbbfa542; text-align: center" readonly="readonly">&nbsp;&nbsp;
                                                <input type="password" id="account_pwd" name="account_pwd" class="default" style = "width : 50%" 
                                                placeholder="숫자 4자리를 입력하세요." onkeypress='return checkNumber(event)'>
												<div id="target1"></div>
                                             </div>
                                            <div class="col-xl-12">
                                            	<input type="text" value="비밀번호 확인" style = "width : 40%; background-color: #fbbfa542; text-align: center" readonly="readonly">&nbsp;&nbsp;
                                                <input type="password" id="pwdchk" name="pwdchk" class="default" style = "width : 50%" placeholder="비밀번호를 한번더 입력하세요." >
                                                <div id="target2"></div>
													
                                             </div>	
                                                <div class="col-xl-12">
                                                    
                                                    <input type = "submit" value="확인" id="askBtn" style = "width : 45%; background-color: #fbbfa542;">&nbsp;&nbsp;&nbsp;
                                                    <input type = "button" value = "취소" onclick="location='index.do'" style = "width : 45%; background-color: #fbbfa542;"/>
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


//비번 4자리 입력했는지 확인
$('#account_pwd').blur(function(){
	var pwdv = $("#account_pwd").val();
	
	if(pwdv.length > 4){
    	$('#target1').html('비밀번호는 4글자로 입력하세요.');
        $('#account_pwd').val("");
    }
});

//비밀번호 같은번호 입력했는지 확인
$('#pwdchk').blur(function(){
	var pwdv = $("#account_pwd").val();
	var pwdcheckv = $("#pwdchk").val();
    
	if(!pwdcheckv){
		
	}else{
		if(pwdv != pwdcheckv){
			$('#target2').css('color','red');
			$('#target2').html("비밀번호가 다릅니다.");
		}else{
			$('#target2').css('color','blue');
			$('#target2').html("비밀번호 확인 완료.");
		}
	}
	
});
</script>