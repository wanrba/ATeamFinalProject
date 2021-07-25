<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" href="resources/common/css/customerService.css">
<div class="attending_area" style="padding-top: 0px;">
	<div id="content" class="sub_wrap more_wrap">
		<style>
li {
	float: left;
}
</style>
		<!--  0724 최형우 거래목록 리스트,페이징처리 -->
		<!-- 사이드영역 -->
		<!-- Nav -->
		<nav style="padding-left: 200px;">
			<ul style="width:180px;">
				<li><a href="accountForm.do" >커플통장 계좌 개설</a></li>
				<li><a href="dashboard.do" class="active">통장 내역 조회</a></li>
	
			</ul>
		</nav>
		<!-- 		센터영역 -->

		<div class="container">

			<div class="align_rt">
				<div>
					<table style="">
						<td>계좌명 : ${list[1]["ACCOUNT_NAME"]} /</td>
						<td>계좌번호 : ${list[1]["ACCOUNT_NUM"]} /</td>
						<td>잔액 : ${list[1]["ACCOUNT_BAL"]}</td>
					</table>
				</div>
				<!-- 			거래내역 -->
				<main class="h-full overflow-y-auto">
				<div class="container px-6 mx-auto grid">
					<!-- New Table -->
					<div class="w-full overflow-hidden rounded-lg shadow-xs">
						<div class="w-full overflow-x-auto">
							<table class="w-full whitespace-no-wrap">
								<thead>
									<tr
										class="text-xs font-semibold tracking-wide text-left text-gray-500 uppercase border-b dark:border-gray-700 bg-gray-50 dark:text-gray-400 dark:bg-gray-800">
										<th class="px-4 py-3">날짜</th>
										<th class="px-4 py-3">입금</th>
										<th class="px-4 py-3">출금</th>
										<th class="px-4 py-3">이름</th>
									</tr>
								</thead>
								<tbody
									class="bg-white divide-y dark:divide-gray-700 dark:bg-gray-800">
									<c:forEach items="${list}" var="e">
										<tr class="text-gray-700 dark:text-gray-400">
											<td class="px-4 py-3">
												<!-- 											<div class="flex items-center text-sm"> -->
												<!-- 												날짜 --> ${e["ACCOUNTIO_DATE"]} <!-- 											</div> -->
											</td>
											<td class="px-4 py-3 text-sm">
												<!-- 											입금  --> ${e.WITHDRAW}
											</td>
											<td class="px-4 py-3 text-xs">
												<!-- 										<span --> <!-- 											class="px-2 py-1 font-semibold leading-tight text-green-700 bg-green-100 rounded-full dark:bg-green-700 dark:text-green-100"> -->
												<!-- 												출금 --> ${e.DEPOSIT} <!-- 										</span> -->
											</td>
											<td class="px-4 py-3 text-sm">
												<!-- 											이름 --> ${e.USER_NAME}
											</td>
										</tr>
									</c:forEach>



								</tbody>
							</table>
						</div>
						<!-- 					여기부터 페이징 -->
						<div
							class="grid px-4 py-3 text-xs font-semibold tracking-wide text-gray-500 uppercase border-t dark:border-gray-700 bg-gray-50 sm:grid-cols-9 dark:text-gray-400 dark:bg-gray-800">
							<span class="col-span-2"></span>
							<!-- Pagination -->
							<span class="flex col-span-4 mt-2 sm:mt-auto sm:justify-end">
								<!-- 							<nav aria-label="Table navigation"> -->
								<ul class="inline-flex items-center">
									<!-- 이전페이지 < -->
									<c:if test="${paging.startPage != 1 }">
										<a href="dashboard.do?nowPage=${paging.startPage - 1 }&
										cntPerPage=${paging.cntPerPage}">&lt;</a>
									</c:if>
									<c:forEach begin="${paging.startPage }"
										end="${paging.endPage }" var="p">
										<c:choose>
											<c:when test="${p == paging.nowPage }">
												<b>${p }</b>
												<%--현제 페이지 일경우 링크 해제 --%>
											</c:when>
											<c:when test="${p != paging.nowPage }">
												<%-- 다른페이지 링크 --%>
												<a
													href="dashboard.do?nowPage=${p }&cntPerPage=${paging.cntPerPage}">${p }</a>
											</c:when>
										</c:choose>
									</c:forEach>
									<!-- 다음페이지 > -->
									<c:if test="${paging.endPage != paging.lastPage}">
										<a
											href="dashboard.do?nowPage=${paging.endPage+1 }&cntPerPage=
${paging.cntPerPage}">&gt;</a>
									</c:if>
						</div>
						</ul>
						<!-- 							</nav> -->
						</span>
					</div>
				</div>
			</div>
		</div>
	</div>
	</main>

</div>
