<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link href="resources/assets/css/pace.min.css" rel="stylesheet"/>
<script src="resources/assets/js/pace.min.js"></script>
<!--favicon-->
<link rel="icon" href="resources/assets/images/favicon.ico" type="image/x-icon">
<!--Full Calendar Css-->
<link href="resources/assets/plugins/fullcalendar/css/fullcalendar.min.css" rel='stylesheet'/>
<!-- Custom Style-->
<!-- <link href="resources/assets/css/app-style.css" rel="stylesheet"/>-->
<style>
	.container-fluid {
		background-image : url("resources/assets/images/bg-themes/1.png");
		width: 100%;
		padding-right: 15px;
		padding-left: 15px;
		margin-right: auto;
		margin-left: auto;
	}
</style>
<section id="home" class="herowrap js-fullheight"
	style="height: 700px; background-image: url(resources/images/xbg_1.jpg.pagespeed.ic.5V9w7rtwtT.jpg); background-size: cover; background-position: top center"
	data-stellar-background-ratio="0.5">
	<div class="overlay"></div>
	<div class="container">
		<div
			class="row js-fullheight justify-content-center d-flex align-items-center">
			<div class="col-md-12">
				<div class="text text-center">
					<div class="icon d-flex align-items-center justify-content-center">
						<span class="flaticon-diamond-ring"></span>
					</div>
					<h1>
						남자는 푸른색 &amp;<br /> 여자는 핑크색
					</h1>
					<span class="subheading">Are Getting Married</span>
				</div>
			</div>
		</div>
	</div>
</section>
<section class="ftco-intro">
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-12">
				<div id="timer" class="d-sm-flex">
					<div class="time time-2 d-flex align-items-center text-center">
						<h3 class="w-100">
							Save <br>the Day
						</h3>
					</div>
					<div class="time" id="days"></div>
					<div class="time" id="hours"></div>
					<div class="time" id="minutes"></div>
					<div class="time" id="seconds"></div>
				</div>
			</div>
		</div>
	</div>
</section>
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
   <script src="resources/assets/js/pace.min.js"></script>
		<!-- Bootstrap core JavaScript-->
		<script src="resources/assets/js/popper.min.js"></script>
		<script src="resources/assets/js/bootstrap.min.js"></script>
		
		<!-- simplebar js -->
		<script src="resources/assets/plugins/simplebar/js/simplebar.js"></script>
		
		<!-- sidebar-menu js -->
		<script src="resources/assets/js/sidebar-menu.js"></script>
		
		<!-- Custom scripts -->
		<script src="resources/assets/js/app-script.js"></script>
		
		<!-- Full Calendar -->
		<script src='resources/assets/plugins/fullcalendar/js/moment.min.js'></script>
		<script src="resources/assets/plugins/fullcalendar/js/fullcalendar-custom-script.js"></script>
		<script src='resources/assets/plugins/fullcalendar/js/fullcalendar.min.js'></script>
	
</section>

<section class="ftco-section ftco-no-pt ftco-no-pb bg-light"
	id="when-where-section">
	<div class="container">
		<div class="row">
			<div class="col-md-5 ftco-animate d-flex">
				<!-- <div id="map" class="bg-white"></div> -->
				<div id="map" style="width:500px;height:400px;"></div>
				<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=5af734516ecff914eb9191e0fb660742"></script>
				<script>
					var container = document.getElementById('map'); //지도를 담을 영역의 DOM 레퍼런스
					var options = { //지도를 생성할 때 필요한 기본 옵션
						center: new kakao.maps.LatLng(33.450701, 126.570667), //지도의 중심좌표.
						level: 3 //지도의 레벨(확대, 축소 정도)
					};
	
					var map = new kakao.maps.Map(container, options); //지도 생성 및 객체 리턴
				</script>
			</div>
			<div class="col-md-7 py-5 pl-md-5">
				<div class="row py-md-4">
					<div class="col-md-12 text-center heading-section pb-4 ftco-animate">
						<span class="subheading">Planning</span>
						<h2 class="mb-3">When &amp; Where</h2>
					</div>
					<div class="col-md-6 d-flex ftco-animate">
						<div class="place img">
							<div class="text text-center">
								<div class="icon d-flex align-items-center justify-content-center">
									<span class="flaticon-church"></span>
								</div>
								<h3>The Ceremony</h3>
								<p>
									<span>Saturday, 28, 2019</span><br>
									<span>02:00 pm-10:00 pm</span>
								</p>
								<p>
									<span>203 Fake St. Mountain View, San Francisco, California, USA</span>
								</p>
								<p>
									<a href="#">+0 (123) 456 78 910</a>
								</p>
								<p>
									<a href="#" class="btn-custom">See Map</a>
								</p>
							</div>
						</div>
					</div>
					<div class="col-md-6 d-flex ftco-animate">
						<div class="place img">
							<div class="text text-center">
								<div class="icon d-flex align-items-center justify-content-center">
									<span class="flaticon-cake"></span>
								</div>
								<h3>The Reception</h3>
								<p>
									<span>Saturday, 28, 2019</span><br>
									<span>02:00 pm-10:00 pm</span>
								</p>
								<p>
									<span>203 Fake St. Mountain View, San Francisco, California, USA</span>
								</p>
								<p>
									<a href="#">+0 (123) 456 78 910</a>
								</p>
								<p>
									<a href="#" class="btn-custom">See Map</a>
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>
