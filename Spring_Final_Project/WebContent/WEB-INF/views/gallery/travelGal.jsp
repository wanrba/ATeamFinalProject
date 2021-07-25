<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<div class="child-page-listing">
	<form action="#" method="post">
		<table>
			<c:forEach var="e" items="${markerPD}" varStatus="status">
				<tr>
					<td><img
						src="resources/fileUpload/${fn:replace(e.marker_picture,',','')}"
						style="width: 80px;"></td>
				</tr>
				<tr>
					<td>날짜 : ${e.marker_date }</td>
				</tr>
				<tr>
					<td>제목 : ${e.marker_title }</td>
				</tr>
				<tr>
					<td>markernum : ${e.marker_num }</td>
				</tr>
				<tr>
					<td>내용: ${e.marker_content } <br> 이 사진 오때?
					
						<c:if	test="${sessionScope.sessionID != null}">
							<c:set var="markernum" value="${e.marker_num }" />
							<c:choose>
								<c:when test="${e.marker_likes==1 }">

									<img class="like" onclick="onlike(${e.marker_num},${e.marker_likes })"
										src="resources/likes/heart2.svg" width="20px">
								</c:when>
								<c:when test="${e.marker_likes==0 }">

									<!-- result만 뽑아오면 됨.  -->
									<img class="like" onclick="onlike(${e.marker_num},${e.marker_likes })"
										src="resources/likes/heart1.svg" width="20px">
								</c:when>
							</c:choose>
						</c:if>
					</td>
				</tr>
			</c:forEach>
		</table>
	</form>
</div>
<script src="resources/views/gallery/js/httpRequest.js"></script>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
	if ("<c:out value='${sessionScope.sessionID != null}'/>") { //로그인이 된 경우만 사용
		var MarkerNum=0;
		function onlike(markernum,likes) {
			MarkerNum=markernum;
			if (likes == 0) { //likes가 0일때 ,하트에 빨간불이 안들어왔을때
				var flag = false;
			} else {
				var flag = true; // likes가 1일때 즉 빨간불이 들어왔을 때
			}

			if (flag == false) {

				flag = true;
				uplike();

			} else { //like가 1일때 불이 들어왔을 때

				flag = false; 
				downlike();
			}
			history.go(0);  //새로고침 기능 (하트 누르면 빨간불 들어오면서 새로고침해줘야 선택된 하트만 불들어옴.)
		}

		function uplike() { //하트에 빨간불 안들어왔을때
			var url = "uplike.do?marker_num=" + MarkerNum;
			sendRequest(url, null, res, "post");
		}

		function downlike() { //빨간불 들어왔을 때  //flag 는 false 
			var url = "downlike.do?marker_num=" + MarkerNum;
			sendRequest(url, null, res, "post");
		}
		function res() {
			if (xhr.readyState === 4) {
				if (xhr.status === 200) {
					var txt = xhr.responseText;
					//console.log("txt::::"+txt);
					//document.getElementById("likeupdate").innerHTML = "싫어유"; //하트 불들어올때 넣어두되고 안넣어두 되고
				} else {
					console.log("실패!");
				}
			}
		}
	}
</script>