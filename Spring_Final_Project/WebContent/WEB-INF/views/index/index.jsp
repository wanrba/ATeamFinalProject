<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<link href="resources/common/calendar/css/fullcalendar.min.css" rel='stylesheet'/>
	
<!-- 	<script> -->
<%-- // 		if("${msg}" != "") { --%>
<%-- // 			alert("${msg}") --%>
<!-- // 		} -->
<!-- 	</script> -->
<style>
	.fc-past {
		background-color: gray;
	}
</style>
	<script>
	
		$(document).ready(function() {
			$(function() {
// 				var scheduleList = JSON.parse('${scheduleList}');
// 				console.log(scheduleList.event)
// 				for(var i = 0; i < scheduleList.length; i++) {
// 					console.log(scheduleList[i].cidx)
// 				}
// 				$('#calendar').fullCalendar('renderEvent', eventData, true);
// 				$("#calendar").fullCalendar()
				get_calendar();
			});
		});
	</script>
	
	<section class="ftco-section bg-section" id="groom-bride-section">

	<div class="content-wrapper">
		<div class="container-fluid">
			<div class="mt-3">
				<div id='calendar'></div>
			</div>
			
			<!--start overlay-->
			<div class="overlay toggle-menu"></div>
			<!--end overlay-->
		</div>
    <!-- End container-fluid-->
   </div><!--End content-wrapper-->
<!--    <script src = "resources/assets/js/jquery.min.js"></script> -->
	
</section>
	
	
	
	
	
	
	
<!-- wedding_countdown -->
    <div class="weeding_countdown_area">
        <div class="flowaers_top d-none d-lg-block">
            <img src="resources/views/index/image/banner/flower-top.png" alt="">
        </div>
        <div class="flowaers_bottom d-none d-lg-block">
                <img src="resources/views/index/image/banner/flower-bottom.png" alt="">
            </div>
        <div class="container">
            <div class="row">
                <div class="col-xl-12">
                    <div class="section_title text-center">
                        <img src="resources/views/index/image/banner/flowers.png" alt="">
                        <span>14. January. 2020</span>
                        <h3>THE. WEDDING. Countdown</h3>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-xl-12">
                    <div id="clock" class="countdown_area counter_bg ">
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--/ wedding_countdown -->

    <!-- our_love-story -->
    <div class="love_story_area">
        <div class="container">
            <div class="row">
                <div class="col-xl-12">
                    <div class="section_title text-center">
                        <img src="resources/views/index/image/banner/flowers.png" alt="">
                        <h3>Our. Love. Story</h3>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-xl-4 col-md-6 col-lg-4">
                    <div class="single_lover_story text-center">
                        <div class="story_thumb">
                            <img src="resources/views/index/image/face/1.png" alt="">
                        </div>
                        <span>Groom</span>
                        <h3>Jack Wonner</h3>
                        <p>Many variations of passages of Lorem Ipsum available, but the majority have suffered
                            alteration in some content of a page when looking at its layout. The point of using Lorem
                            Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using
                            Content here content here, making it look like readable English. Many desktop publishing
                            packages and web page editors now use.</p>
                        <div class="social_links">
                            <ul>
                                <li><a href="#"> <i class="fa fa-facebook"></i> </a></li>
                                <li><a href="#"> <i class="fa fa-twitter"></i> </a></li>
                                <li><a href="#"> <i class="fa fa-instagram"></i> </a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="col-xl-4 col-md-6 col-lg-4">
                    <div class="weding_time_line text-center">
                        <div class="single_time_line">
                            <h3>Fast Meet</h3>
                            <p>Many variations of passages of Lorem Ipsum available, but the majority have suffered
                                alteration in some.</p>
                        </div>
                        <div class="single_time_line">
                            <h3>He Proposed</h3>
                            <p>Many variations of passages of Lorem Ipsum available, but the majority have suffered
                                alteration in some.</p>
                        </div>
                        <div class="single_time_line">
                            <h3>Love Story</h3>
                            <p>Many variations of passages of Lorem Ipsum available, but the majority have suffered
                                alteration in some.</p>
                        </div>
                        <div class="single_time_line">
                            <h3>Wedding Day</h3>
                        </div>
                    </div>
                </div>
                <div class="col-xl-4 col-lg-4">
                    <div class="single_lover_story text-center">
                        <div class="story_thumb">
                            <img src="resources/views/index/image/face/2.png" alt="">
                        </div>
                        <span>Bride</span>
                        <h3>Anjelina Kona</h3>
                        <p>Many variations of passages of Lorem Ipsum available, but the majority have suffered
                            alteration in some content of a page when looking at its layout. The point of using Lorem
                            Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using
                            Content here content here, making it look like readable English. Many desktop publishing
                            packages and web page editors now use.</p>
                        <div class="social_links">
                            <ul>
                                <li><a href="#"> <i class="fa fa-facebook"></i> </a></li>
                                <li><a href="#"> <i class="fa fa-twitter"></i> </a></li>
                                <li><a href="#"> <i class="fa fa-instagram"></i> </a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--/ our_love-story -->

    <!-- gallery_area  -->
    <div class="gallery_area">
        <div class="container">
            <div class="row">
                <div class="col-xl-12">
                    <div class="section_title text-center">
                        <img src="resources/views/index/image/banner/flowers.png" alt="">
                        <h3>Gallery.  Photos</h3>
                    </div>
                </div>
            </div>
        </div>
        <div class="container-fluid p-0">
            <div class="row grid no-gutters">
                <div class="col-xl-4 col-md-6 col-lg-6 grid-item">
                    <div class="single_gallery gallery_imag_1">
                        <a class="popup-image" href="resources/views/index/image/gallery/1.png">
                        </a>
                    </div>
                </div>
                <div class="col-xl-3 col-md-6 col-lg-6 grid-item">
                    <div class="single_gallery gallery_imag_2">
                        <a class="popup-image" href="resources/views/index/image/gallery/2.png">
                        </a>
                    </div>
                </div>
                <div class="col-xl-5 col-md-6 col-lg-6 grid-item">
                    <div class="single_gallery gallery_imag_3">
                        <a class="popup-image" href="resources/views/index/image/gallery/3.png">
                        </a>
                    </div>
                </div>
                <div class="col-xl-3 col-md-6 col-lg-6 grid-item">
                    <div class="single_gallery gallery_imag_4">
                        <a class="popup-image" href="resources/views/index/image/gallery/4.png">
                        </a>
                    </div>
                </div>
                <div class="col-xl-5 col-md-6 col-lg-6 grid-item">
                    <div class="single_gallery gallery_imag_5">
                        <a class="popup-image" href="resources/views/index/image/gallery/5.png">
                        </a>
                    </div>
                </div>
                <div class="col-xl-4 col-md-6 col-lg-6 grid-item">
                    <div class="single_gallery gallery_imag_6">
                        <a class="popup-image" href="resources/views/index/image/gallery/6.png">
                        </a>
                    </div>
                </div>
                <div class="col-xl-4 col-md-6 col-lg-6 grid-item">
                    <div class="single_gallery gallery_imag_7">
                        <a class="popup-image" href="resources/views/index/image/gallery/7.png">
                        </a>
                    </div>
                </div>
                <div class="col-xl-3 col-md-6 col-lg-6 grid-item">
                    <div class="single_gallery gallery_imag_8">
                        <a class="popup-image" href="resources/views/index/image/gallery/8.png">
                        </a>
                    </div>
                </div>
                <div class="col-xl-5 col-md-6 col-lg-6 grid-item">
                    <div class="single_gallery gallery_imag_9">
                        <a class="popup-image" href="resources/views/index/image/gallery/9.png"></a>
                    </div>
                </div>
            </div>
            <!-- <div class="grid row">
                <div class="single_image grid-item">
                    <img src="img/gallery/1.png" alt="">
                </div><div class="single_image grid-item">
                    <img src="img/gallery/2.png" alt="">
                </div><div class="single_image grid-item">
                    <img src="img/gallery/3.png" alt="">
                </div>
            </div> -->
        
        
        </div>
    </div>
    <!--/ gallery_area  -->

    <!-- program_details -->
    <div class="program_details_area">
        <div class="container">
            <div class="row">
                <div class="col-xl-12">
                    <div class="section_title text-center">
                        <img src="resources/views/index/image/banner/flowers.png" alt="">
                        <h3>Program. Details</h3>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-xl-4 col-lg-4">
                    <div class="single_program program_bg_1 text-center">
                        <div class="program_inner ">
                            <span>
                                16.00
                            </span>
                            <h3>Wedding Ceremony</h3>
                            <p>Many variations of passages of Lorem Ipsum available, but the majority have suffered
                                alteration in some content of a page when looking at its layout. </p>
                            <img src="resources/views/index/image/detail/ornaments.png" alt="">
                        </div>
                    </div>
                </div>
                <div class="col-xl-4 col-lg-4">
                    <div class="single_program program_bg_2 text-center">
                        <div class="program_inner ">
                            <span>
                                20.00
                            </span>
                            <h3>Lunch Time</h3>
                            <p>Many variations of passages of Lorem Ipsum available, but the majority have suffered
                                alteration in some content of a page when looking at its layout. </p>
                            <img src="resources/views/index/image/detail/ornaments.png" alt="">
                        </div>
                    </div>
                </div>
                <div class="col-xl-4 col-lg-4">
                    <div class="single_program program_bg_3 text-center">
                        <div class="program_inner ">
                            <span>
                                22.00
                            </span>
                            <h3>WeParty Time</h3>
                            <p>Many variations of passages of Lorem Ipsum available, but the majority have suffered
                                alteration in some content of a page when looking at its layout. </p>
                            <img src="resources/views/index/image/detail/ornaments.png" alt="">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--/ program_details -->

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
                            <div class="col-xl-7 col-lg-8">
                                <div class="popup_box ">
                                    <div class="popup_inner">
                                        <div class="form_heading text-center">
                                            <h3>Are You Attending?</h3>
                                            <p>Kindly respond before 30 August</p>
                                        </div>
                                        <form action="#">
                                            <div class="row">
                                                <div class="col-xl-12">
                                                    <input type="text" placeholder="Your Name">
                                                </div>
                                                <div class="col-xl-12">
                                                    <input type="text" placeholder="Email">
                                                </div>
                                                <div class="col-xl-12">
                                                    <select class="form-select wide" id="default-select" class="">
                                                        <option data-display="1 Guest">1 Guest</option>
                                                        <option value="1">2 Guest</option>
                                                        <option value="2">3 Guest</option>
                                                        <option value="3">4 Guest</option>
                                                    </select>
                                                </div>
                                                <div class="col-xl-12">
                                                    <textarea placeholder="Additional Message"></textarea>
                                                </div>
                                                <div class="col-xl-12">
                                                    <button type="submit" class="boxed_btn3">R.S.V.P</button>
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