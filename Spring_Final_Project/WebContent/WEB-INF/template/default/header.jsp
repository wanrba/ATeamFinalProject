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
                                        <li><a class="active" href="index.do">home</a></li>
                                        <li><a href="story.html">Our Story</a></li>
                                        <li><a href="Gallery.html">Gallery</a></li>
                                        <li><a href="#">blog <i class="ti-angle-down"></i></a>
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
                                        <li><a href="contact.html">Contact</a></li>
                                        <li>
                                        	<a href="#">=  
                                        		<i class="ti-angle-down"></i>
                                        	</a>
                                            <ul class="submenu">
                                                <c:choose>
	                                        		<c:when test="${sessionScope.sessionID eq null }">
	                                        			<li>
	                                        				<a href = "loginForm.do">Login</a>
	                                        			</li>
                                                		<li>
                                                			<a href="signup.do">Join</a>
                                                		</li>
	                                        		</c:when>
	                                        		<c:otherwise>
	                                        			<li>
	                                        				<a href = "myPage.do">MyPage</a>
	                                        			</li>
                                                		<li>
                                                			<a href = "logout.do">Logout</a>
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
		������� �����̹��� �� ���Ϻ��� �̵�
		���λ��� �̹����� index������ �ֻ�ܺη� �̵�
	-->
