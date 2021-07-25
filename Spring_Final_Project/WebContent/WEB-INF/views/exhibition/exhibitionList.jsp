<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> <!-- jstl의 함수태그 -->


<link rel="stylesheet" type="text/css" href="resources/views/exhibition/css/contents5e7d.css">
<link rel="stylesheet" type="text/css" href="resources/views/exhibition/css/respond5e7d.css">
<link rel="stylesheet" type="text/css" href="resources/views/exhibition/css/webzine5e7d.css"> <!-- 문화포털 웹진 css -->
<script type="text/javascript" src="resources/views/exhibition/js/slick.min5e7d.js"></script>
<script type="text/javascript" src="resources/views/exhibition/js/common_ui5e7d.js"></script>
<script type="text/javascript" src="resources/views/exhibition/js/common_fn5e7d.js"></script>
<script type="text/javascript" src="resources/views/exhibition/js/calendar5e7d.js"></script>
<script type="text/javascript" src="resources/views/exhibition/js/layout5e7d.js"></script>


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

<div class="attending_area" style="margin-top : 8%">
	<div id="content" class="sub_wrap more_wrap">
	
	
		<div class="container">
			<div class="align_rt">
			
			<!-- Faq -->
			<div class="faq">
	
	
					<!-- List -->
					<div class="faq_list">
					
						<!-- Total Data Count & Search Condition -->
						<div class="bbs_search type2">
							<span class="left">총 
								<span class="num">
									<c:choose>
										<c:when test="${list eq null }">0</c:when>
										<c:otherwise>${fn:length(list) }</c:otherwise>
									</c:choose>
								</span>건
							</span>
							<form name="performForm" id="performForm" method="get" action="exhibition.do">
								<fieldset>
									<legend>검색</legend>
										<input type="hidden" id="cPage" name="cPage" value="">
										<input type="hidden" id="genre" name="genre" value="">
										<input type="hidden" id="pid" name="pid" value="">
										<input type="hidden" id="ex_startday" name="ex_startday">
										<input type="hidden" id="ex_endday" name="ex_endday">
										<div class="sel_group hbox jc period_group">
											<label for="genreSelect" class="hide">카테고리 선택</label>
<!-- 											<select name="genreSelect" id="genreSelect" title="카테고리 선택" class="form_category"> -->
<!-- 												<option value="" selected="selected">전체</option> -->
<!-- 												<option value="2">음악/콘서트</option> -->
<!-- 												<option value="8">뮤지컬/오페라</option> -->
<!-- 												<option value="1">연극</option> -->
<!-- 												<option value="4">국악</option> -->
<!-- 												<option value="5">무용/발레</option> -->
<!-- 												<option value="9">아동/가족</option> -->
<!-- 												<option value="6">전시</option> -->
<!-- 												<option value="7">기타</option> -->
<!-- 											</select> -->
<!-- 											<label for="location" class="hide">지역 선택</label> -->
<!-- 											<select title="지역 선택" id="location" name="location" class="form_category"> -->
<!-- 												<option value="">내지역</option> -->
<!-- 												<option value="02">서울</option> -->
<!-- 												<option value="051">부산</option> -->
<!-- 												<option value="053">대구</option> -->
<!-- 												<option value="032">인천</option> -->
<!-- 												<option value="062">광주</option> -->
<!-- 												<option value="042">대전</option> -->
<!-- 												<option value="052">울산</option> -->
<!-- 												<option value="044">세종</option> -->
<!-- 												<option value="031">경기</option> -->
<!-- 												<option value="033">강원</option> -->
<!-- 												<option value="043">충북</option> -->
<!-- 												<option value="041">충남</option> -->
<!-- 												<option value="063">전북</option> -->
<!-- 												<option value="061">전남</option> -->
<!-- 												<option value="054">경북</option> -->
<!-- 												<option value="055">경남</option> -->
<!-- 												<option value="064">제주</option> -->
<!-- 											</select> -->
											<div class="period_wrap">
												<a href="#period" title="기간선택" class="period" id="periodId">기간</a>
												<div class="period_select">
													<ul class="date_list">
														<li>
															<a href="javascript:dateSearch('0');">전체</a>
														</li>
														<li>
															<a href="javascript:dateSearch('1');">1일</a>
														</li>
														<li>
															<a href="javascript:dateSearch('2');">1주일</a>
														</li>
														<li>
															<a href="javascript:dateSearch('3');">1개월</a>
														</li>
														<li>
															<a href="javascript:dateSearch('4');">1년</a>
														</li>
													</ul>
													<p class="tit">기간선택</p>
													<div class="period_input">
														<label for="srchFr" class="hide">기간 선택(시작일)</label>
														<input type="text" class="form_date" id="srchFr" title="시작일(예시:20200101)" placeholder="시작일(예시 :20200101)" onkeyup="auto_date_format(event, this)" onkeypress="auto_date_format(event, this)" maxlength="10">
														<button type="button" class="btn_calendar" onclick="openCalendar(document.getElementById('srchFr'));">달력</button>
													</div>
													<div class="period_input">
														<label for="srchTo" class="hide">기간 선택(종료일)</label>
														<input type="text" class="form_date" id="srchTo" title="종료일(예시:20200101)" placeholder="종료일(예시 :20200101)" onkeyup="auto_date_format(event, this)" onkeypress="auto_date_format(event, this)" maxlength="10">
														<button type="button" class="btn_calendar" onclick="openCalendar(document.getElementById('srchTo'));">달력</button>
													</div>
													<button type="button" class="btn_apply" onclick="javascript:dateSearch('5');">기간적용</button>
												</div>
												
												<script type="text/javascript">
													function auto_date_format( e, oThis ){
														var numCheck = /[^0-9:\-]/g ;
														var key_code = ( e.which ) ? e.which : e.keyCode;
														var num_arr = [
															97, 98, 99, 100, 101, 102, 103, 104, 105, 96,
															48, 49, 50, 51, 52, 53, 54, 55, 56, 57
														]
														
														if (numCheck.test(oThis.value)){
															$(oThis).val($(oThis).val().replace(/[^0-9:\-]/g,""));
														}else {
															if( num_arr.indexOf( Number( key_code ) ) != -1 ){
																var len = oThis.value.length;
																if( len == 4 ) oThis.value += "-";
																if( len == 7 ) oThis.value += "-";
															}
														}
													}
	
													var getURLPara = function (name) {
														var url = window.location.href;
														name = name.replace(/[\[\]]/g, "\\$&");
														var regex = new RegExp("[?&]" + name + "(=([^&#]*)|&|#|$)"),
														results = regex.exec(url);
														var returnVal = '';
		
														if(results != null){
															returnVal = decodeURI(results[2]);
														}
		
													return returnVal;
												}
	
												// 이미 검색한 날짜 처리
												var ex_startday = getURLPara('ex_startday');
												var ex_endday = getURLPara('ex_endday');
	
												if(ex_startday.length != 0){
													$('#srchFr').val(ex_startday);
													$('#ex_startday').val(ex_startday);
												}
	
												if(ex_endday.length != 0){
													$('#srchTo').val(ex_endday);
													$('#ex_endday').val(ex_endday);
												}
	
												function dateSearch(dateType) {
													var date = new Date();
													var res = date.toISOString().slice(0,10);
	
													if (dateType == '0') {
														$('#periodId').text('전체');
														$('#ex_endday').val('');
														$('#ex_startday').val('');
														$('#srchFr').val('');
														$('#srchTo').val('');
													}else if (dateType == '1') {
														$('#periodId').text('1일');
														$('#ex_endday').val(res);
														$('#ex_startday').val(res);
														$('#srchFr').val(res);
														$('#srchTo').val(res);
													}else if (dateType == '2') {
														$('#periodId').text('1주일');
														date.setDate(date.getDate() + 7);
														var aWeek = date.toISOString().slice(0, 10);
														$('#ex_endday').val(aWeek);
														$('#ex_startday').val(res);
														$('#srchTo').val(aWeek);
														$('#srchFr').val(res);
													}else if (dateType == '3') {
														$('#periodId').text('1개월');
														date.setDate(date.getDate() + 30);
														var aMonth = date.toISOString().slice(0, 10);
														$('#ex_endday').val(aMonth);
														$('#ex_startday').val(res);
														$('#srchTo').val(aMonth);
														$('#srchFr').val(res);
													}else if (dateType == '4') {
														$('#periodId').text('1년');
														date.setDate(date.getDate() + 365);
														var aYear = date.toISOString().slice(0, 10);
														$('#ex_endday').val(aYear);
														$('#ex_startday').val(res);
														$('#srchTo').val(aYear);
														$('#srchFr').val(res);
													}else if (dateType == '5') {
														$('#periodId').text('사용자설정');
														$('#ex_startday').val($('#srchFr').val());
														$('#ex_endday').val($('#srchTo').val());
													}
												}
												</script>
											</div>
											<label for="searchKeywordType" class="hide">항목 선택</label>
											<select title="항목 선택" id="searchKeywordType" name="searchKeywordType" class="form_category">
												<option value="t" selected="selected">제목</option>
												<option value="c">내용</option>
												<option value="tc">제목+내용</option>
												<option value="v">장소</option>
											</select>
										</div>
										<div class="input_group">
											<label for="searchKeyword" class="hide">검색어 입력</label>
											<input type="text" id="searchKeyword" name="searchKeyword" class="form_keyword" title="검색어" placeholder="검색어를 입력하세요." value="">
											<button type="button" id="search1" class="btn_search" title="검색">검색</button>
										</div>
										<div class="btn_group">
											<button type="button" id="newListA" name="newListA" value="1" class="btn01" title="최신 선택됨">최신</button>
											<button type="button" id="newListB" name="newListB" value="2" class="btn02" title="지역별 선택됨">지역별</button>
											<input type="hidden" name="note1" id="note1" value="">
										</div>
										<script>
											$(document).ready(function() {
												
												$(function() {
													$("#search1").on("click", function() {
// 														var genre = $("select[name=genreSelect]").val();
										                var $performForm	=	$('form[name=performForm]');
// 										                var location1 = $("select[name=location]").val();
														var ex_startday = $("#ex_startday").val().trim() != null ? $("#ex_startday").val().trim() : null
														var ex_endday = $("#ex_endday").val().trim() != null ? $("#ex_endday").val().trim() : null
										                var searchKeywordType = $("select[name=searchKeywordType]").val();
										                var searchKeyword = $("input[name=searchKeyword]").val();
										                url = 'exhibition.do?ex_startday=' + $("#ex_startday").val() + '&ex_endday=' + $("#ex_endday").val() + '&searchKeywordType=' + searchKeywordType + '&searchKeyword=' + encodeURI(searchKeyword);
										                location.href = url;
													});
													
													$("#newListA").on("click", function() {
														var abc = "";
											            abc = $('#newListA').val();
											            $('#note1').val(abc);
											            $('[name=performForm]').submit();
													});
													
													$("#newListB").on("click", function() {
														var abc = "";
											            abc = $('#newListB').val();
											            $('#note1').val(abc);
											            $('[name=performForm]').submit();
													});
												});
											});
										</script>
									</fieldset>
								</form>
							</div>
					
						<!-- Content -->
						<div class="list_type">
							<ul>
								<c:forEach items="${list }" var="e">
									<li>
										<a href="temPurchase.do" class="hoverDot">
											<div class="thumb">
											<!-- 0724 이미지 업로드 경로 설정 -->
												<img src = "resources/fileUpload/${e.ex_thumb }" alt="">
											</div>
										</a>
		<!-- 								<a href="#uciDiv" data-id="G7061625865247990" onclick="ajaxUciPop(this.getAttribute('data-id'))" class="modal_open"> -->
		<!-- 									<img src = "resources/fileUpload/13.gif" alt="uci팝업"> -->
		<!-- 								</a> -->
										<dl class="info">
											<dt>
												<a href="temPurchase.do?ex_index=${e.ex_index} ">
													<span>${e.ex_title }</span>
												</a>
											</dt>
											<dd class="date">
												${e.ex_startday } ~ ${e.ex_endday } (예정)
											</dd>
											<dd>
												<span class="loc">서울</span>
												<span class="loc_detail">폼텍 웍스홀</span>
											</dd>
										</dl>
									</li>
								</c:forEach>
							</ul>
						</div>
					</div>
					<!-- //List -->
				
				</div>
			</div>
			<!-- //Faq -->
		</div>
	</div>
</div>