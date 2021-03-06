<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
	
	<div class="attending_area">
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
                                        <form action="login.do" method="post" id="loginInfo">
                                            <div class="row">
                                                <div class="col-xl-12">
                                                    <input type="text" name="user_id" id="user_id" placeholder="아이디를 입력하세요">
                                                </div>
                                                <div class="col-xl-12">
                                                    <input type="password" name="user_pwd" id="user_pwd" maxlength="10" placeholder="비밀번호를 입력하세요">
                                                </div>
                                                <div class = "col-xl-12">
                                                	<label style="color: red;">${emsg }</label>
                                                </div>
                                                <div class="col-xl-12">
                                                    <input type = "submit" value="로그인">
                                                    <input type = "button" value="아이디/비밀번호 찾기" id="findIdBtn">
                                                    <input type = "button" value = "회원가입" onclick="location='signup.do'"/>
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
    
    <script type="text/javascript">
	
		$(document).ready(function() {
			
			var openWin;
			
			$("#findIdBtn").on("click", function() {
				openChild();
			});

			function openChild() {
				// window.name = "부모창 이름";
				window.name = "parentForm";
				// window.open("open할 window", "자식창 이름", "팝업창 옵션");
				openWin = window.open('idpwdFind.do', 'window_name', 'width=1000,height=500,location=yes,status=no,scrollbars=yes');
			}
			
			
		})
		
		
	</script>