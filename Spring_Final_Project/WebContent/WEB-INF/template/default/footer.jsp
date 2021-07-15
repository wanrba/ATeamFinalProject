<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!-- footer_start -->
   <footer class="footer">
    <div class="footer_top">
        <div class="container">
            <div class="row">
                <div class="col-xl-12">
                    <div class="quick_links">
                        <ul>
                            <li><a href="#">Home</a></li>
                            <li><a href="#">Our Story</a></li>
                            <li><a href="#">Gallery</a></li>
                            <li><a href="#">Accommodation</a></li>
                            <li><a href="#">Contact</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="copy-right_text">
        <div class="container">
            <div class="footer_border"></div>
            <div class="row">
                <div class="col-xl-12">
                    <p class="copy_right text-center">
                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                    </p>
                </div>
            </div>
        </div>
    </div>
</footer>
<!-- footer_end -->

    <!-- JS here -->
    <script src="resources/views/index/js/vendor/modernizr-3.5.0.min.js"></script>
    <script src="resources/views/index/js/vendor/jquery-1.12.4.min.js"></script>
    <script src="resources/views/index/js/popper.min.js"></script>
    <script src="resources/views/index/js/bootstrap.min.js"></script>
    <script src="resources/views/index/js/owl.carousel.min.js"></script>
    <script src="resources/views/index/js/isotope.pkgd.min.js"></script>
    <script src="resources/views/index/js/ajax-form.js"></script>
    <script src="resources/views/index/js/waypoints.min.js"></script>
    <script src="resources/views/index/js/jquery.counterup.min.js"></script>
    <script src="resources/views/index/js/imagesloaded.pkgd.min.js"></script>
    <script src="resources/views/index/js/scrollIt.js"></script>
    <script src="resources/views/index/js/jquery.scrollUp.min.js"></script>
    <script src="resources/views/index/js/wow.min.js"></script>
    <script src="resources/views/index/js/nice-select.min.js"></script>
    <script src="resources/views/index/js/gijgo.min.js"></script>
    <script src="resources/views/index/js/jquery.countdown.min.js"></script>
    <script src="resources/views/index/js/jquery.slicknav.min.js"></script>
    <script src="resources/views/index/js/jquery.magnific-popup.min.js"></script>
    <script src="resources/views/index/js/plugins.js"></script>

    <!--contact js-->
    <script src="resources/views/index/js/contact.js"></script>
    <script src="resources/views/index/js/jquery.ajaxchimp.min.js"></script>
    <script src="resources/views/index/js/jquery.form.js"></script>
    <script src="resources/views/index/js/jquery.validate.min.js"></script>
    <script src="resources/views/index/js/mail-script.js"></script>
     
     
	<script src="resources/common/calendar/js/pace.min.js"></script>
	<!-- Bootstrap core JavaScript-->
	<script src="resources/common/calendar/js/popper.min.js"></script>
	<script src="resources/common/calendar/js/bootstrap.min.js"></script>
	
	<!-- simplebar js -->
	<script src="resources/common/calendar/js/simplebar.js"></script>
	
	<!-- sidebar-menu js -->
	<script src="resources/common/calendar/js/sidebar-menu.js"></script>
	
	<!-- Custom scripts -->
	<script src="resources/common/calendar/js/app-script.js"></script>
	
	<!-- Full Calendar -->
	<script src='resources/common/calendar/js/moment.min.js'></script>
	<script src="resources/common/calendar/js/fullcalendar-custom-script.js"></script>
	<script src='resources/common/calendar/js/fullcalendar.min.js'></script>

    <script src="resources/views/index/js/main.js"></script>

    <script>
        $('#clock').countdown('2020/01/07', function (event) {
            $(this).html(event.strftime(
                '<div class="countdown_wrap d-flex"><div  class="single_countdown"><h3>%D</h3><span>Days</span></div><div class="single_countdown"><h3>%H</h3><span>Hours</span></div><div class="single_countdown"><h3>%M</h3><span>Minutes</span></div><div class="single_countdown"><h3>%S</h3><span>Seconds</span></div></div>'
            ));
        });
    </script>
    
    <script>
//     	$(document).ready(function() {
    		
//     		$(function() {
//     			alert('1')
//     			$(".fc-body > tr > td > div > div > div > div > div > table > tbody > tr > td > a").removeProp("data-goto");
//     			alert('2')
//     		});
    		
//     	});
    </script>
    
    <script>
        function initMap() {
            var uluru = {
                lat: -25.363,
                lng: 131.044
            };
            var grayStyles = [{
                    featureType: "all",
                    stylers: [{
                            saturation: -90
                        },
                        {
                            lightness: 50
                        }
                    ]
                },
                {
                    elementType: 'labels.text.fill',
                    stylers: [{
                        color: '#ccdee9'
                    }]
                }
            ];
            var map = new google.maps.Map(document.getElementById('map'), {
                center: {
                    lat: -31.197,
                    lng: 150.744
                },
                zoom: 9,
                styles: grayStyles,
                scrollwheel: false
            });
        }
    </script>



</body>

</html>