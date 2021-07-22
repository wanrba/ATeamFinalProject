<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="urlPath"
	value="${pageContext.request.contextPath}/resources" />
<!doctype html>
<html class="no-js" lang="zxx">

<head>
<meta charset="EUC-KR">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>Weeding</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- <link rel="manifest" href="site.webmanifest"> -->
<!-- <link rel="shortcut icon" type="image/x-icon" href="img/favicon.png"> -->
<!-- Place favicon.ico in the root directory -->

<!-- CSS here -->
<link rel="stylesheet" href="resources/common/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/common/css/owl.carousel.min.css">
<link rel="stylesheet" href="resources/common/css/magnific-popup.css">
<link rel="stylesheet" href="resources/common/css/font-awesome.min.css">
<link rel="stylesheet" href="resources/common/css/themify-icons.css">
<link rel="stylesheet" href="resources/common/css/nice-select.css">
<link rel="stylesheet" href="resources/common/css/flaticon.css">
<link rel="stylesheet" href="resources/common/css/gijgo.css">
<link rel="stylesheet" href="resources/common/css/slicknav.css">
<link rel="stylesheet" href="resources/common/css/style.css">
<link rel="stylesheet" href="resources/common/css/customerService.css">

<script src="resources/views/index/js/vendor/jquery-1.12.4.min.js"></script>
</head>
<body>
	<tiles:insertAttribute name="header" />
<%-- 	<tiles:insertAttribute name="menu" /> --%>
	<tiles:insertAttribute name="body" />
	<tiles:insertAttribute name="footer" />
</body>
</html>