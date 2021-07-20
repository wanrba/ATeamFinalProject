<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<!-- 
CIDX
USER_CUPLENUM
CTITLE   		O
CSTARTDAY		O
CENDDAY			O
CLOCAL			O
CCONTENT		O
CCOLOR 			O 
** 이 두개 컬럼 추가해야 될 듯
CSDTIME 시작시간
CEDTIME 종료시간
-->

</head>
<body>
	<h4>일정 등록폼</h4>
	<br><form name="insertCalendar" method="post" action="updateCalendar.do" encType="EUC-KR">
	
	<input type="hidden" id="cidx" name="cidx" class="calendartext" 
		value="${cdto.cidx }">

		<p><label for=cTitle><strong>제목</strong></label>  
		<input type="text" id="cTitle" name="cTitle" class="calendartext" 
		value="${cdto.cTitle }"><br></p>

		<p><label for="cLocal"><strong>장소</strong></label> 
		<input type="text" id="cLocal" name="cLocal" class="calendartext" 
		value="${cdto.cLocal}"><br></p>

		<p><label for="cStartDay"><strong>시작 일시</strong></label> 
      	<p><input type="date" id="cStartDay" name="cStartDay" value="${cdto.cStartDay }">
     	 <input type="time" id="csdtime" name="csdtime" value=""></p>

		<p><label for="cEndDay"><strong>종료 일시</strong></label> 
      	<input type="date" id="cEndDay" name="cEndDay" value="${cdto.cEndDay }">
      	<input type="time" id="cedtime" name="cedtime" value=""></p>

	 	<p><label for="cContent">내용 <br></label>
		<textarea id="cContent" name="cContent"rows="5" cols="33" placeholder="내용을 입력">${cdto.cContent }</textarea></p>

		<!-- <p><label for="cColor"><strong>중요도</strong></label>  -->
		<!-- <input type="radio" name="cColor" value="high">높음
		<input type="radio" name="cColor" value="middle">보통
		<input type="radio" name="cColor" value="low">낮음</p 
		이거 대신 색상표 넣기
		-->
		<p><label for="cColor"><strong>중요도</strong></label>
		>
		<input type="color" name="cColor" id="cColor">

	<!-- 	<h4>일정 color! 혹시 몰라서 넣어봄</h4>
		<input type="color" name="favcolor" value="#CC6600"> -->

  		<p><input type="submit" id="calendarinsert" value="수정">	
	     <input type="button" onclick="deleteInfo()" value="삭제"></p>
	    <br>
   	<hr>
</form>
<script>
// 2021_07_06 김성경 삭제로 이동하는 메서드
function deleteInfo() {
	location.href="deleteCalendar.do?cidx=" + $('#cidx').val();
}
</script>
</body>
</html> 