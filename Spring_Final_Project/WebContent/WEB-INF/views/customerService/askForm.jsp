<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
<link rel="stylesheet" href="resources/common/css/customerService.css">
<script>
$(document).ready(function(){
   if("${msg}"=== "1:1���Ǵ�  �α��� �� �̿����ּ��� ^__^"){
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
        <li><a href="/more/notice">��������</a></li>
        <li><a href="faqForm.do">���� ���� ����</a></li>
        <li><a href="/more/inquiry" class="active">1:1 ����</a></li>
        <li><a href="/more/terms">��� �� ��å</a></li>
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
                                       <input type="text" value="���̵�"
                                          style="width: 40%; background-color: #fbbfa542;"
                                          readonly="readonly" text-align: center>&nbsp;&nbsp; <input
                                          type="text" id="user_id" name="user_id" class="default"
                                          value=${sessionID } style="width: 50%" readonly="readonly">

                                    </div>
                                    <div class="col-xl-12">
                                       <input type="text" value="��������"
                                          style="width: 40%; background-color: #fbbfa542;"
                                          readonly="readonly" text-align: center>&nbsp;&nbsp; <select
                                          id="cs_type" name="cs_type"
                                          style="width: 50%; height: 60%;">
                                          <option value="">���������� �����ϼ���</option>
                                          <option value="Ŀ������">Ŀ������</option>
                                          <option value="Ŀ������">Ŀ������</option>
                                          <option value="������">������</option>
                                          <option value="Ŀ�û���">Ŀ�û���</option>
                                          <option value="��Ÿ">��Ÿ</option>

                                       </select>

                                    </div>

                                    <div class="col-xl-12">
                                       <input type="text" name="cs_title" id="cs_title"
                                          placeholder="����" maxlength="35">
                                    </div>

                                    <div class="col-xl-12">
                                       <textarea rows="30" cols="30" id="cs_content"
                                          name="cs_content" placeholder="���� ������ �Է��ϼ���."></textarea>
                                    </div>
                                    <div class="col-xl-12">

                                       <input type="submit" value="Ȯ��" id="askBtn"
                                          style="width: 45%; background-color: #fbbfa542;">&nbsp;&nbsp;&nbsp;
                                       <input type="button" value="���"
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