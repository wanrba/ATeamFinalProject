<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="resources/views/map/css/map.css" rel="stylesheet">
<div id="modal">
</div>
<div class="map_wrap">
	<c:forEach var="e" items="${list}">
		<input type="hidden" class="lat" value=${e.marker_lat }>
		<input type="hidden" class="lon" value=${e.marker_lon }>
		<input type="hidden" class="title" value="${e.marker_title}">
		<input type="hidden" class="content" value="${e.marker_content}">
		<input type="hidden" class="picture" value="${e.marker_picturename}">
		<input type="hidden" class="date" value="${e.marker_date}">
		<input type="hidden" class="num" value="${e.marker_num}">
	</c:forEach>
	
<!-- ���̾ƿ� �Է�â ��� Start -->
<div id = "banner_online">
    <div id="close_button" style ="cursor: pointer;"> x
    </div>
   	<form action="markermaker.do" method="post" onsubmit="return test()" enctype="multipart/form-data">
    	<input type="hidden" id="marker_lat" name="marker_lat" value="">
    	<input type="hidden" id="marker_lon" name="marker_lon" value="">
    	<input type="hidden" id="marker_addr" name="marker_addr" value="">
		<h2>�߾� ��� ����</h2>
   		 �̹��� ��� �� ���� : <input type="number" id="code" value="0" min="1" step="1" max="5" onchange="addFile()">
    	<div id="target">
    	</div>	
    	
    
    	<p>
    		<label for="marker_title">����</label>
    		<input type="text" id="marker_title" name="marker_title">
    	</p>
    	<p>
    		<label for="marker_content">����</label>
    		<input type="text" id="marker_content" name="marker_content">
    	</p>
   		<p>
    		<label for="marker_date">��¥</label>
    		<input type="date" id="marker_date" name="marker_date">
    	</p>
    	<input type="submit" id="marker_Btn" value="���">
    </form>
    <!-- <input type="button" id="close_button" value="���"> -->
</div>
<!-- ���̾ƿ� �Է�â ��� End -->
	<div style="margin:auto;">
		<p>
    		<label for="keyword">Ű���� </label>
    		<input type="text" value="" id="keyword" name="keyword" size="15">
    	</p>
	</div>
        
    <div id="map" style="width:1000px;height:800px;position:relative;overflow:hidden;margin:auto"></div> 
    <!-- ������� �ּ� ���� -->
    <div class="hAddr">
        <span class="title">�����߽ɱ��� ������ �ּ�����</span>
        <span id="centerAddr"></span>
    </div>
   
    <!-- ����Ÿ�� ��Ʈ�� div �Դϴ� -->
    <div class="custom_typecontrol radius_border">
        <span id="btnRoadmap" class="selected_btn" onclick="setMapType('roadmap')">����</span>
        <span id="btnSkyview" class="btn" onclick="setMapType('skyview')">��ī�̺�</span>
    </div>
    <!-- ���� Ȯ��, ��� ��Ʈ�� div �Դϴ� -->
    <div class="custom_zoomcontrol radius_border"> 
        <span onclick="zoomIn()"><img src="https://t1.daumcdn.net/localimg/localimages/07/mapapidoc/ico_plus.png" alt="Ȯ��"></span>  
        <span onclick="zoomOut()"><img src="https://t1.daumcdn.net/localimg/localimages/07/mapapidoc/ico_minus.png" alt="���"></span>
    </div>
</div>

<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=5af734516ecff914eb9191e0fb660742&libraries=services,clusterer"></script>
<!-- <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script> -->
<script src="resources/views/map/js/map.js" type="text/javascript"></script>