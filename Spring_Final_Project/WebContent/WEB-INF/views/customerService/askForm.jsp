<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
<link rel="stylesheet" href="resources/common/css/customerService.css">
<script>
$(document).ready(function(){
   if("${msg}"=== "1:1문의는  로그인 후 이용해주세요 ^__^"){
      alert("${msg}");
      location.href="loginForm.do";
   }
})
</script>


<div class="attending_area">
   <div id="content" class="sub_wrap more_wrap">

      <!-- Nav -->
   <nav style="padding-left: 200px;">
       <ul style="width:180px;">
        <li><a href="/more/notice">공지사항</a></li>
        <li><a href="faqForm.do">자주 묻는 질문</a></li>
        <li><a href="/more/inquiry" class="active">1:1 문의</a></li>
        <li><a href="/more/terms">약관 및 정책</a></li>
       </ul>
   </nav>

      <div class="container">

         <div class="row">
            <div class="col-xl-10 offset-xl-1 col-lg-10 offset-lg-1">
               <div class="main_attending_area">
                  <div class="flower_1 d-none d-lg-block">
                     <img src="resources/views/index/image/appointment/flower-top.png"
                        alt="">
                  </div>
                  <div class="flower_2 d-none d-lg-block">
                     <img
                        src="resources/views/index/image/appointment/flower-bottom.png"
                        alt="">
                  </div>
                  <div class="row justify-content-center">
                     <div class="col-xl-10 col-lg-8">
                        <div class="popup_box ">
                           <div class="popup_inner">
                              <div class="form_heading text-center">
                                 <div class="col-xl-12">
                                    <img src="resources/common/image/logo_banner/logo.png"
                                       width="100%" alt="">
                                 </div>
                              </div>
                              <div class="pt-30"></div>
                              <form action="askSend.do" method="post">
                                 <div class="row">
                                    <div class="col-xl-12">
                                       <input type="text" value="아이디"
                                          style="width: 40%; background-color: #fbbfa542;"
                                          readonly="readonly" text-align: center>&nbsp;&nbsp; <input
                                          type="text" id="user_id" name="user_id" class="default"
                                          value=${sessionID } style="width: 50%" readonly="readonly">

                                    </div>
                                    <div class="col-xl-12">
                                       <input type="text" value="문의유형"
                                          style="width: 40%; background-color: #fbbfa542;"
                                          readonly="readonly" text-align: center>&nbsp;&nbsp; <select
                                          id="cs_type" name="cs_type"
                                          style="width: 50%; height: 60%;">
                                          <option value="">문의유형을 선택하세요</option>
                                          <option value="커플통장">커플통장</option>
                                          <option value="커플지도">커플지도</option>
                                          <option value="갤러리">갤러리</option>
                                          <option value="커플상점">커플상점</option>
                                          <option value="기타">기타</option>

                                       </select>

                                    </div>

                                    <div class="col-xl-12">
                                       <input type="text" name="cs_title" id="cs_title"
                                          placeholder="제목" maxlength="35">
                                    </div>

                                    <div class="col-xl-12">
                                       <textarea rows="30" cols="30" id="cs_content"
                                          name="cs_content" placeholder="문의 내용을 입력하세요."></textarea>
                                    </div>
                                    <div class="col-xl-12">

                                       <input type="submit" value="확인" id="askBtn"
                                          style="width: 45%; background-color: #fbbfa542;">&nbsp;&nbsp;&nbsp;
                                       <input type="button" value="취소"
                                          onclick="location='index.do'"
                                          style="width: 45%; background-color: #fbbfa542;" />
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