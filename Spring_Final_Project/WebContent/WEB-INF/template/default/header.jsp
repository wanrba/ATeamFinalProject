<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--[if lte IE 9]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="https://browsehappy.com/">upgrade your browser</a> to improve your experience and security.</p>
        <![endif]-->
    <!-- header-->
    <header>
        <div class="header-area ">
            <div id="sticky-header" class="main-header-area">
                <div class="container">
                    <div class="row align-items-center">
                        <div class="col-xl-3 col-lg-3">
                            <div class="logo-img">
                                <a href="index.do">
                                    <img src="resources/common/image/logo_banner/logo.png" alt="">
                                </a>
                            </div>
                        </div>
                        <div class="col-xl-9 col-lg-9">
                            <div class="main-menu  d-none d-lg-block">
                                <nav>
                                    <ul id="navigation">
                                        <li><a class="active" href="index.do">홈</a></li>
                                        <li><a href="map.do">커플지도</a></li>
                                        <li><a href="Gallery.html">갤러리</a></li>
                                        <li><a href="#">상점<i class="ti-angle-down"></i></a>
                                            <ul class="submenu">
                                                <li><a href="blog.html">blog</a></li>
                                                <li><a href="single-blog.html">single-blog</a></li>
                                            </ul>
                                        </li>
                                        <li>
                                        	<a href="#">pages 
                                        		<i class="ti-angle-down"></i>
                                        	</a>
                                            <ul class="submenu">
                                                <li><a href="Accommodation.html">Accommodation</a></li>
                                                <li><a href="elements.html">elements</a></li>
                                            </ul>
                                        </li>
                                        <li><a href="askForm.do">고객센터</a></li>
                                        <li>
                                        	<a href="#">=  
                                        		<i class="ti-angle-down"></i>
                                        	</a>
                                            <ul class="submenu">
                                                <c:choose>
	                                        		<c:when test="${sessionScope.sessionID eq null }">
	                                        			<li>
	                                        				<a href = "loginForm.do">로그인</a>
	                                        			</li>
                                                		<li>
                                                			<a href="signup.do">회원가입</a>
                                                		</li>
	                                        		</c:when>
	                                        		<c:otherwise>
	                                        			<li>
	                                        				<a href = "myPage.do">마이페이지</a>
	                                        			</li>
                                                		<li>
                                                			<a href = "logout.do">장바구니</a>
                                                		</li>
                                                		<li>
                                                			<a href = "logout.do">로그아웃</a>
                                                		</li>
	                                        		</c:otherwise>
	                                        	</c:choose>
                                            </ul>                                        
                                        </li>
                                    </ul>
                                </nav>
                            </div>
                        </div>
                        <div class="col-12">
                            <div class="mobile_menu d-block d-lg-none"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </header>
    <!--/ header-->
    
	<!--
		07-19 YoungJin
		헤더에서 메인이미지 각 파일별로 이동
		메인사진 이미지는 index파일의 최상단부로 이동
	-->
