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
					<td>��¥ : ${e.marker_date }</td>
				</tr>
				<tr>
					<td>���� : ${e.marker_title }</td>
				</tr>
				<tr>
					<td>markernum : ${e.marker_num }</td>
				</tr>
				<tr>
					<td>����: ${e.marker_content } <br> �� ���� ����?
					
						<c:if	test="${sessionScope.sessionID != null}">
							<c:set var="markernum" value="${e.marker_num }" />
							<c:choose>
								<c:when test="${e.marker_likes==1 }">

									<img class="like" onclick="onlike(${e.marker_num},${e.marker_likes })"
										src="resources/likes/heart2.svg" width="20px">
								</c:when>
								<c:when test="${e.marker_likes==0 }">

									<!-- result�� �̾ƿ��� ��.  -->
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
	if ("<c:out value='${sessionScope.sessionID != null}'/>") { //�α����� �� ��츸 ���
		var MarkerNum=0;
		function onlike(markernum,likes) {
			MarkerNum=markernum;
			if (likes == 0) { //likes�� 0�϶� ,��Ʈ�� �������� �ȵ�������
				var flag = false;
			} else {
				var flag = true; // likes�� 1�϶� �� �������� ������ ��
			}

			if (flag == false) {

				flag = true;
				uplike();

			} else { //like�� 1�϶� ���� ������ ��

				flag = false; 
				downlike();
			}
			history.go(0);  //���ΰ�ħ ��� (��Ʈ ������ ������ �����鼭 ���ΰ�ħ����� ���õ� ��Ʈ�� �ҵ���.)
		}

		function uplike() { //��Ʈ�� ������ �ȵ�������
			var url = "uplike.do?marker_num=" + MarkerNum;
			sendRequest(url, null, res, "post");
		}

		function downlike() { //������ ������ ��  //flag �� false 
			var url = "downlike.do?marker_num=" + MarkerNum;
			sendRequest(url, null, res, "post");
		}
		function res() {
			if (xhr.readyState === 4) {
				if (xhr.status === 200) {
					var txt = xhr.responseText;
					//console.log("txt::::"+txt);
					//document.getElementById("likeupdate").innerHTML = "�Ⱦ���"; //��Ʈ �ҵ��ö� �־�εǰ� �ȳ־�� �ǰ�
				} else {
					console.log("����!");
				}
			}
		}
	}
</script>