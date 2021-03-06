<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<link href="resources/common/calendar/css/fullcalendar.min.css" rel='stylesheet'/>
<script src="resources/views/index/js/jquery.counterup.min.js"></script>

<style>
	.fc-past {
		background-color: blanchedalmond;
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
		
		//로그인 안하고 커플통장개설 눌렀을경우 알람창 - 김미연 7/23
		function nologin(){
			$.ajax({
				url:"accountForm.do",
				type:'post',
				success: function(data){
					alert(data);
					
				},
				error: function(e){
					console.log('error: '+e);
					alert('오류발생!!');
				}
			
			})
		}
	</script>
	
	<!--
		07-19 YoungJin
		헤더의 메인이미지 index로 이동
	-->
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
                        <span>${mdto.user_dday}</span>
                        <h3>THE. WEDDING. Countdown</h3>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-xl-12">
                    <div id="afterRelationShip" class="countdown_area counter_bg">
                    	<div class="countdown_wrap d-flex">
                    		<div class="single_countdown">
                    			<h3 id = "rsDay"></h3>
                    			<span>Days</span>
                    		</div>
                    		<div class="single_countdown">
                    			<h3 id = "rsHours"></h3>
                    			<span>Hours</span>
                    		</div>
                    		<div class="single_countdown">
                    			<h3 id = "rsMinutes"></h3>
                    			<span>Minutes</span>
                    		</div>
                    		<div class="single_countdown">
                    			<h3 id = "rsSeconds"></h3>
                    			<span>Seconds</span>
                    		</div>
                    	</div>
                    </div>
                </div>
            </div>
            <script>
            	// 07-19 YoungJin
            	// 연애시작일로부터 얼마나 지났는지 카운트업해주는 함수
            	$(document).ready(function() {
            		$(function() {
            			const countUpTimer = function (date) {
                    		var _vDate = new Date(date); // 전달 받은 일자
                    		var _second = 1000;
                    		var _minute = _second * 60;
                    		var _hour = _minute * 60;
                    		var _day = _hour * 24;
                    		var timer;
                    		console.log(_vDate)
                    		function showRemaining() {
                    			var now = new Date();
                    			var distDt = now - _vDate;
                    			
                    			var days = Math.floor(distDt / _day);
                    			var hours = Math.floor((distDt % _day) / _hour);
                    			var minutes = Math.floor((distDt % _hour) / _minute);
                    			var seconds = Math.floor((distDt % _minute) / _second);
                    			$("#rsDay").text(days);
                    			$("#rsHours").text(hours);
                    			$("#rsMinutes").text(minutes);
                    			$("#rsSeconds").text(seconds);
                    		}
                    		
                    		timer = setInterval(showRemaining, 1000);
                    	}
                    	
                    	var dateObj = new Date();
                    	dateObj.setDate(dateObj.getDate() + 1);
                    	countUpTimer("${mdto.user_dday}"); // 내일까지
            		});
            	});
            	
            </script>
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
                        <!-- 07/19 하늘 홈화면 프로필 사진 변경 -->
                            <img src="resources/views/index/image/face/eric04.jpg" alt="">
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
                        <!-- 07/19 하늘 홈화면 프로필 사진 변경 -->
                            <img src="resources/views/index/image/face/jym03.JPG" alt="">
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
                    <!-- 07/19 하늘 홈화면 갤러리 이미지  변경 01.JPG~10.JPG -->
                        <a class="popup-image" href="resources/views/index/image/gallery/01.JPG">
                        </a>
                    </div>
                </div>
                <div class="col-xl-3 col-md-6 col-lg-6 grid-item">
                    <div class="single_gallery gallery_imag_2">
                        <a class="popup-image" href="resources/views/index/image/gallery/02.JPG">
                        </a>
                    </div>
                </div>
                <div class="col-xl-5 col-md-6 col-lg-6 grid-item">
                    <div class="single_gallery gallery_imag_3">
                        <a class="popup-image" href="resources/views/index/image/gallery/03.JPG">
                        </a>
                    </div>
                </div>
                <div class="col-xl-3 col-md-6 col-lg-6 grid-item">
                    <div class="single_gallery gallery_imag_4">
                        <a class="popup-image" href="resources/views/index/image/gallery/04.JPG">
                        </a>
                    </div>
                </div>
                <div class="col-xl-5 col-md-6 col-lg-6 grid-item">
                    <div class="single_gallery gallery_imag_5">
                        <a class="popup-image" href="resources/views/index/image/gallery/05.JPG">
                        </a>
                    </div>
                </div>
                <div class="col-xl-4 col-md-6 col-lg-6 grid-item">
                    <div class="single_gallery gallery_imag_6">
                        <a class="popup-image" href="resources/views/index/image/gallery/06.JPG">
                        </a>
                    </div>
                </div>
                <div class="col-xl-4 col-md-6 col-lg-6 grid-item">
                    <div class="single_gallery gallery_imag_7">
                        <a class="popup-image" href="resources/views/index/image/gallery/07.JPG">
                        </a>
                    </div>
                </div>
                <div class="col-xl-3 col-md-6 col-lg-6 grid-item">
                    <div class="single_gallery gallery_imag_8">
                        <a class="popup-image" href="resources/views/index/image/gallery/08.JPG">
                        </a>
                    </div>
                </div>
                <div class="col-xl-5 col-md-6 col-lg-6 grid-item">
                    <div class="single_gallery gallery_imag_9">
                        <a class="popup-image" href="resources/views/index/image/gallery/09.JPG"></a>
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


