<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!-- 	<form action="login.do" method="post" id="loginInfo"> -->
<!-- 		<!-- 		onsubmit="return checkValue()"> -->
<!-- 		<table style="width: 300px; border: 1px; margin: auto"> -->
<!-- 			<tr> -->
<!-- 				<th colspan="2">�α��� �� ����</th> -->
<!-- 			</tr> -->
<!-- 			<tr> -->
<!-- 				<th>���̵�</th> -->
<!-- 				<td><input type="text" name="user_id" id="user_id"></td> -->
<!-- 			</tr> -->
<!-- 			<tr> -->
<!-- 				<th>��й�ȣ</th> -->
<!-- 				<td><input type="password" name="user_pwd" id="user_pwd" -->
<!-- 					maxlength="10"></td> -->
<!-- 			</tr> -->
<!-- 			<tr> -->
<!-- 				<th colspan="2"><br> -->
<!-- 					type1 : �� �����͸� �ڹٽ�ũ��Ʈ�� ���� 		
<!-- 				<input type="button" value="�α���" onclick="checkValue()">&nbsp;  -->
<!-- 					type2 : submit���� �ڹٽ�ũ��Ʈ�� ����ؼ� ����  <input type="button" value="���̵�/��й�ȣ ã��"> -->
<!-- 				</th> -->
<!-- 			</tr> -->
<!-- 			<tr> -->
<!-- 				<td> -->
<!-- 					<a href = "signup.do"> -->
<!-- 						<input type = "button" value = "ȸ������" /> -->
<!-- 					</a> -->
<!-- 				</td> -->
<!-- 			</tr> -->
<!-- 		</table> -->
<!-- 	</form> -->
	
	
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
                                                    <input type="text" name="user_id" id="user_id" placeholder="���̵� �Է��ϼ���">
                                                </div>
                                                <div class="col-xl-12">
                                                    <input type="password" name="user_pwd" id="user_pwd" maxlength="10" placeholder="��й�ȣ�� �Է��ϼ���">
                                                </div>
                                                <div class = "col-xl-12">
                                                	<label style="color: red;">${emsg }</label>
                                                </div>
                                                <div class="col-xl-12">
                                                    <input type = "submit" value="�α���">
                                                    <input type = "button" value="���̵�/��й�ȣ ã��">
                                                    <input type = "button" value = "ȸ������" />
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