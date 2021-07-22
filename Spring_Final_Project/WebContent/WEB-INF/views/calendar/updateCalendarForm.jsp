<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="resources/common/calendar/css/calendarForm-custom-css.css" rel="stylesheet">


<!-- slider_area -->
<div class="slider_area ">
    <div class="slider_area_inner slider_bg_1 overlay2">
        <div class="slider_text text-center">
            <div class="text_inner">
                <img src="resources/common/image/logo_banner/ornaments.png" alt="">
                <h4>14 Jan 2020</h4>
                <h3>Anjelina & Jack <br>
                    Wedding Ceremony</h3>
                <span>Get Married</span>
            </div>
        </div>
    </div>
</div>
<!--/ slider_area -->
    
<!-- attend_area -->
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
<!--                                         <div class="form_heading text-center"> -->
<!--                                             <h3>Are You Attending?</h3> -->
<!--                                             <p>Kindly respond before 30 August</p> -->
<!--                                         </div> -->
									<form name="insertCalendar" method="post" action="updateCalendar.do" encType="EUC-KR">
										<input type="hidden" id="cidx" name="cidx" class="calendartext" value="${cdto.cidx }">
                                       	<div class="row">
                                           <div class="col-xl-12">
                                               <input type="text" id="cTitle" name="cTitle" class="ft-20" value="${cdto.cTitle }">
                                           </div>
                                           <div class="col-xl-12">
                                               <input type="text" id="cLocal" name="cLocal" class="ft-20" value="${cdto.cLocal}">
                                           </div>
                                           <div class="col-xl-12">
												<input type="date" class = "cal-wd-70 ft-20" id="cStartDay" name="cStartDay" value="${cdto.cStartDay }">
												<input type="time" class = "cal-wd-29 ft-20" id="csdtime" name="csdtime" value="">
                                           </div>
                                           <div class="col-xl-12">
												<input type="date" class = "cal-wd-70 ft-20" id="cEndDay" name="cEndDay" value="${cdto.cEndDay }">
      											<input type="time" class = "cal-wd-29 ft-20" id="cedtime" name="cedtime" value="">
                                           </div>
                                           <div class="col-xl-12">
                                               <textarea id="cContent" class = "ft-20 ta-size" name="cContent"rows="5" cols="33" placeholder="내용을 입력">${cdto.cContent }</textarea>
                                           </div>
											<div class="col-xl-12">
												<input type="color" class = "cal-wd-29 ft-20" name="cColor" id="cColor" value = ${cdto.cColor }>
                                           </div>
											<div id="calendarForm">
												<h2>중요도</h2>
												<ul>
													<li>
														<input type="radio" id="important-high" name="cImportance" <c:if test="${cdto.cImportance == '중요'}">checked</c:if>>
														<label for="important-high">중요</label>
														<div class="check"></div>
													</li>
													<li>
														<input type="radio" id="important-middle" name="cImportance" <c:if test="${cdto.cImportance eq '보통'}">checked</c:if>>
														<label for="important-middle">보통</label>
														<div class="check">
															<div class="inside"></div>
														</div>
													</li>
													<li>
														<input type="radio" id="important-low" name="cImportance" <c:if test="${cdto.cImportance eq '낮음'}">checked</c:if>>
														<label for="important-low">낮음</label>
														<div class="check">
															<div class="inside"></div>
														</div>
													</li>
												</ul>
											</div>
											<div class="col-xl-12">
												<input type="submit" id="calendarinsert" value="수정">	
												<input type="button" onclick="deleteInfo()" value="삭제">
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
<!-- / attend_area -->


<script>
// 2021_07_06 김성경 삭제로 이동하는 메서드
function deleteInfo() {
	location.href="deleteCalendar.do?cidx=" + $('#cidx').val();
}
</script>