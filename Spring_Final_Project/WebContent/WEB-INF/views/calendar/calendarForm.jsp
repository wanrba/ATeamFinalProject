<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
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
									<form name="insertCalendar" method="post" action="insertCalendar.do" encType="EUC-KR">
                                       	<div class="row">
                                           <div class="col-xl-12">
                                               <input type="text" class = "ft-20" id="cTitle" name="cTitle" class="calendartext" value="">
                                           </div>
                                           <div class="col-xl-12">
                                               <input type="text" class = "ft-20" id="cLocal" name="cLocal" class="calendartext" value="" style = "width : 85%">
                                               <img src = "resources/views/map/img/map.png" id = "mapTest" style = "height : 50px;">
                                               <script>
                                               	$(document).ready(function() {
                                               		$(function() {
                                               			$("#mapTest").on("click", function() {
                                               				var width = window.innerWidth;
                                               				var height = window.innerHeight;
                                               				const map = window.open("popupMap.do","_blank","width=" + width + ",height=" + height);
//                                                				const map = window.open("popupMap.do","_blank","width=" + (width / 2) + ",height=" + (height / 2));
                                               			});
                                               		});
                                               	});
                                               </script>
                                           </div>
                                           <div class="col-xl-12">
                                               <input type="date" class = "cal-wd-70 ft-20" id="cStartDay" name="cStartDay" value="${startDate}">
                                               <input type="time" class = "cal-wd-29 ft-20" id="csdtime" name="csdtime" value="">
                                           </div>
                                           <div class="col-xl-12">
                                               <input type="date" class = "cal-wd-70 ft-20" id="cEndDay" name="cEndDay" value="${endDate}">
                                               <input type="time" class = "cal-wd-29 ft-20" id="cedtime" name="cedtime" value="">
                                           </div>
                                           <div class="col-xl-12">
                                               <textarea id="cContent" class = "ft-20 ta-size" name="cContent"rows="5" cols="33" placeholder="?????? ????"></textarea>
                                           </div>
											<div class="col-xl-12">
												<input type="color" class = "cal-wd-29 ft-20" name="cColor" id="cColor">
                                           </div>
											<div id="calendarForm">
												<h2>??????</h2>
												<ul>
													<li>
														<input type="radio" id="important-high" name="cImportance">
														<label for="important-high">????</label>
														<div class="check"></div>
													</li>
													<li>
														<input type="radio" id="important-middle" name="cImportance">
														<label for="important-middle">????</label>
														<div class="check">
															<div class="inside"></div>
														</div>
													</li>
													<li>
														<input type="radio" id="important-low" name="cImportance">
														<label for="important-low">????</label>
														<div class="check">
															<div class="inside"></div>
														</div>
													</li>
												</ul>
											</div>
											<div class="col-xl-12">
                                               <input type="submit" id="calendarinsert" value="????">
                                               <input type="button" onclick="location.href='index.do'" value="????">
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