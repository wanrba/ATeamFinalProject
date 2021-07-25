<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div class="attending_area">
		<div class="container">
			<div class="row">
				<div class="col-xl-10 offset-xl-1 col-lg-10 offset-lg-1">
					<div class="main_attending_area">
						<div class="flower_1 d-none d-lg-block">
							<img src="resources/views/index/image/appointment/flower-top.png"
								alt="">
						</div>
						<div class="flower_2 d-none d-lg-block">
							<img
								src="resources/views/index/image/appointment/flower-bottom.png"
								alt="">
						</div>
						<div class="row justify-content-center">
							<div class="col-xl-10 col-lg-8">
								<div class="popup_box " style="margin-left: 110px;">
									<div class="popup_inner">
										<div class="form_heading text-center">
											<div class="col-xl-12">
												<img src="resources/common/image/logo_banner/logo.png"
													width="100%" alt="">
											</div>
										</div>
										<div class="pt-30"></div>
										<c:choose>

											<c:when test="${sessionScope.sessionMatch eq 0 }">
												<form action="couplemcAction.do" method="post"
													onsubmit="return couplemcBlank()">
													<div class="row">
														<div class="col-xl-12">
															<input type="text" id="secondid" name="secondid"
																placeholder="�ǵ���� ���̵�">
														</div>
														<div class="col-xl-12">
															<input type="submit" id="couplemcbtn" name="couplemctn"
																value="Ŀ�õ��">
														</div>
														</div>
														</form>
											</c:when>
											
											<c:when test="${sessionScope.sessionMatch eq 1 }">
												<h1>${msg}</h1>
											</c:when>
											
											<c:otherwise>
												<form action="matchSucess.do" method="post">
													<div class="row">
														<h1>Ŀ�ý�û�� ���̵� : ${matchInfo.user_id}</h1>
														<h1>Ŀ�ý�û�� �̸� : ${matchInfo.user_name}</h1>
														<div class="col-xl-12">
															<input type="submit" id="couplemcYbtn" name="couplemcYbtn"
																value="Ŀ�ý�û ����"> <input type="submit"
																id="couplemcNbtn" name="couplemcNbtn" value="Ŀ�ý�û �ź�">
														</div>
														<input type="hidden" id="user_firstid" name="user_firstid"
															value="${matchInfo.user_id}">
															</div>
															</form>
											</c:otherwise>
										</c:choose>
									</div>
									
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>

</body>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script>
	function couplemcBlank() {
		var secondidv = $("#secondid").val();
		if (!secondidv) {
			alert("�ǵ����ID�� �Է��ϼ���");
			return false;
		}
	}
</script>

<script>
	window.onload = function() {
		var txt = "${num}";
		if (txt == "0") {
			alert("Ŀ�ý�û�� �Ϸ���� �ʾҽ��ϴ�.");
		} else if (txt == "1") {
			alert("Ŀ�ý�û�� �Ϸ�Ǿ����ϴ�");
			if (confirm('Ŀ�ý�û�� �Ϸ��߽��ϴ� Ȩ���� ���ư��ðڽ��ϱ�?')) {
				location = "index.do";
			}
		}
	}
</script>
<script>
	$(function() {
		$('#couplemcYbtn').click(function() {
			location.href = "matchSucess.do"
			var user_firstid = $("#user_firstid").val();
		});
	});
</script>

</html>