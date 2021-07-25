<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> <!-- jstl�� �Լ��±� -->


<link rel="stylesheet" type="text/css" href="resources/views/exhibition/css/contents5e7d.css">
<link rel="stylesheet" type="text/css" href="resources/views/exhibition/css/respond5e7d.css">
<link rel="stylesheet" type="text/css" href="resources/views/exhibition/css/webzine5e7d.css"> <!-- ��ȭ���� ���� css -->
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
							<span class="left">�� 
								<span class="num">
									<c:choose>
										<c:when test="${list eq null }">0</c:when>
										<c:otherwise>${fn:length(list) }</c:otherwise>
									</c:choose>
								</span>��
							</span>
							<form name="performForm" id="performForm" method="get" action="exhibition.do">
								<fieldset>
									<legend>�˻�</legend>
										<input type="hidden" id="cPage" name="cPage" value="">
										<input type="hidden" id="genre" name="genre" value="">
										<input type="hidden" id="pid" name="pid" value="">
										<input type="hidden" id="ex_startday" name="ex_startday">
										<input type="hidden" id="ex_endday" name="ex_endday">
										<div class="sel_group hbox jc period_group">
											<label for="genreSelect" class="hide">ī�װ� ����</label>
<!-- 											<select name="genreSelect" id="genreSelect" title="ī�װ� ����" class="form_category"> -->
<!-- 												<option value="" selected="selected">��ü</option> -->
<!-- 												<option value="2">����/�ܼ�Ʈ</option> -->
<!-- 												<option value="8">������/�����</option> -->
<!-- 												<option value="1">����</option> -->
<!-- 												<option value="4">����</option> -->
<!-- 												<option value="5">����/�߷�</option> -->
<!-- 												<option value="9">�Ƶ�/����</option> -->
<!-- 												<option value="6">����</option> -->
<!-- 												<option value="7">��Ÿ</option> -->
<!-- 											</select> -->
<!-- 											<label for="location" class="hide">���� ����</label> -->
<!-- 											<select title="���� ����" id="location" name="location" class="form_category"> -->
<!-- 												<option value="">������</option> -->
<!-- 												<option value="02">����</option> -->
<!-- 												<option value="051">�λ�</option> -->
<!-- 												<option value="053">�뱸</option> -->
<!-- 												<option value="032">��õ</option> -->
<!-- 												<option value="062">����</option> -->
<!-- 												<option value="042">����</option> -->
<!-- 												<option value="052">���</option> -->
<!-- 												<option value="044">����</option> -->
<!-- 												<option value="031">���</option> -->
<!-- 												<option value="033">����</option> -->
<!-- 												<option value="043">���</option> -->
<!-- 												<option value="041">�泲</option> -->
<!-- 												<option value="063">����</option> -->
<!-- 												<option value="061">����</option> -->
<!-- 												<option value="054">���</option> -->
<!-- 												<option value="055">�泲</option> -->
<!-- 												<option value="064">����</option> -->
<!-- 											</select> -->
											<div class="period_wrap">
												<a href="#period" title="�Ⱓ����" class="period" id="periodId">�Ⱓ</a>
												<div class="period_select">
													<ul class="date_list">
														<li>
															<a href="javascript:dateSearch('0');">��ü</a>
														</li>
														<li>
															<a href="javascript:dateSearch('1');">1��</a>
														</li>
														<li>
															<a href="javascript:dateSearch('2');">1����</a>
														</li>
														<li>
															<a href="javascript:dateSearch('3');">1����</a>
														</li>
														<li>
															<a href="javascript:dateSearch('4');">1��</a>
														</li>
													</ul>
													<p class="tit">�Ⱓ����</p>
													<div class="period_input">
														<label for="srchFr" class="hide">�Ⱓ ����(������)</label>
														<input type="text" class="form_date" id="srchFr" title="������(����:20200101)" placeholder="������(���� :20200101)" onkeyup="auto_date_format(event, this)" onkeypress="auto_date_format(event, this)" maxlength="10">
														<button type="button" class="btn_calendar" onclick="openCalendar(document.getElementById('srchFr'));">�޷�</button>
													</div>
													<div class="period_input">
														<label for="srchTo" class="hide">�Ⱓ ����(������)</label>
														<input type="text" class="form_date" id="srchTo" title="������(����:20200101)" placeholder="������(���� :20200101)" onkeyup="auto_date_format(event, this)" onkeypress="auto_date_format(event, this)" maxlength="10">
														<button type="button" class="btn_calendar" onclick="openCalendar(document.getElementById('srchTo'));">�޷�</button>
													</div>
													<button type="button" class="btn_apply" onclick="javascript:dateSearch('5');">�Ⱓ����</button>
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
	
												// �̹� �˻��� ��¥ ó��
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
														$('#periodId').text('��ü');
														$('#ex_endday').val('');
														$('#ex_startday').val('');
														$('#srchFr').val('');
														$('#srchTo').val('');
													}else if (dateType == '1') {
														$('#periodId').text('1��');
														$('#ex_endday').val(res);
														$('#ex_startday').val(res);
														$('#srchFr').val(res);
														$('#srchTo').val(res);
													}else if (dateType == '2') {
														$('#periodId').text('1����');
														date.setDate(date.getDate() + 7);
														var aWeek = date.toISOString().slice(0, 10);
														$('#ex_endday').val(aWeek);
														$('#ex_startday').val(res);
														$('#srchTo').val(aWeek);
														$('#srchFr').val(res);
													}else if (dateType == '3') {
														$('#periodId').text('1����');
														date.setDate(date.getDate() + 30);
														var aMonth = date.toISOString().slice(0, 10);
														$('#ex_endday').val(aMonth);
														$('#ex_startday').val(res);
														$('#srchTo').val(aMonth);
														$('#srchFr').val(res);
													}else if (dateType == '4') {
														$('#periodId').text('1��');
														date.setDate(date.getDate() + 365);
														var aYear = date.toISOString().slice(0, 10);
														$('#ex_endday').val(aYear);
														$('#ex_startday').val(res);
														$('#srchTo').val(aYear);
														$('#srchFr').val(res);
													}else if (dateType == '5') {
														$('#periodId').text('����ڼ���');
														$('#ex_startday').val($('#srchFr').val());
														$('#ex_endday').val($('#srchTo').val());
													}
												}
												</script>
											</div>
											<label for="searchKeywordType" class="hide">�׸� ����</label>
											<select title="�׸� ����" id="searchKeywordType" name="searchKeywordType" class="form_category">
												<option value="t" selected="selected">����</option>
												<option value="c">����</option>
												<option value="tc">����+����</option>
												<option value="v">���</option>
											</select>
										</div>
										<div class="input_group">
											<label for="searchKeyword" class="hide">�˻��� �Է�</label>
											<input type="text" id="searchKeyword" name="searchKeyword" class="form_keyword" title="�˻���" placeholder="�˻�� �Է��ϼ���." value="">
											<button type="button" id="search1" class="btn_search" title="�˻�">�˻�</button>
										</div>
										<div class="btn_group">
											<button type="button" id="newListA" name="newListA" value="1" class="btn01" title="�ֽ� ���õ�">�ֽ�</button>
											<button type="button" id="newListB" name="newListB" value="2" class="btn02" title="������ ���õ�">������</button>
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
											<!-- 0724 �̹��� ���ε� ��� ���� -->
												<img src = "resources/fileUpload/${e.ex_thumb }" alt="">
											</div>
										</a>
		<!-- 								<a href="#uciDiv" data-id="G7061625865247990" onclick="ajaxUciPop(this.getAttribute('data-id'))" class="modal_open"> -->
		<!-- 									<img src = "resources/fileUpload/13.gif" alt="uci�˾�"> -->
		<!-- 								</a> -->
										<dl class="info">
											<dt>
												<a href="temPurchase.do?ex_index=${e.ex_index} ">
													<span>${e.ex_title }</span>
												</a>
											</dt>
											<dd class="date">
												${e.ex_startday } ~ ${e.ex_endday } (����)
											</dd>
											<dd>
												<span class="loc">����</span>
												<span class="loc_detail">���� ����Ȧ</span>
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