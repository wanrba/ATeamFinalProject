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
		<!--  0724 ������ �ŷ���� ����Ʈ,����¡ó�� -->
		<!-- ���̵念�� -->
		<!-- Nav -->
		<nav style="padding-left: 200px;">
			<ul style="width:180px;">
				<li><a href="accountForm.do" >Ŀ������ ���� ����</a></li>
				<li><a href="dashboard.do" class="active">���� ���� ��ȸ</a></li>
	
			</ul>
		</nav>
		<!-- 		���Ϳ��� -->

		<div class="container">

			<div class="align_rt">
				<div>
					<table style="">
						<td>���¸� : ${list[1]["ACCOUNT_NAME"]} /</td>
						<td>���¹�ȣ : ${list[1]["ACCOUNT_NUM"]} /</td>
						<td>�ܾ� : ${list[1]["ACCOUNT_BAL"]}</td>
					</table>
				</div>
				<!-- 			�ŷ����� -->
				<main class="h-full overflow-y-auto">
				<div class="container px-6 mx-auto grid">
					<!-- New Table -->
					<div class="w-full overflow-hidden rounded-lg shadow-xs">
						<div class="w-full overflow-x-auto">
							<table class="w-full whitespace-no-wrap">
								<thead>
									<tr
										class="text-xs font-semibold tracking-wide text-left text-gray-500 uppercase border-b dark:border-gray-700 bg-gray-50 dark:text-gray-400 dark:bg-gray-800">
										<th class="px-4 py-3">��¥</th>
										<th class="px-4 py-3">�Ա�</th>
										<th class="px-4 py-3">���</th>
										<th class="px-4 py-3">�̸�</th>
									</tr>
								</thead>
								<tbody
									class="bg-white divide-y dark:divide-gray-700 dark:bg-gray-800">
									<c:forEach items="${list}" var="e">
										<tr class="text-gray-700 dark:text-gray-400">
											<td class="px-4 py-3">
												<!-- 											<div class="flex items-center text-sm"> -->
												<!-- 												��¥ --> ${e["ACCOUNTIO_DATE"]} <!-- 											</div> -->
											</td>
											<td class="px-4 py-3 text-sm">
												<!-- 											�Ա�  --> ${e.WITHDRAW}
											</td>
											<td class="px-4 py-3 text-xs">
												<!-- 										<span --> <!-- 											class="px-2 py-1 font-semibold leading-tight text-green-700 bg-green-100 rounded-full dark:bg-green-700 dark:text-green-100"> -->
												<!-- 												��� --> ${e.DEPOSIT} <!-- 										</span> -->
											</td>
											<td class="px-4 py-3 text-sm">
												<!-- 											�̸� --> ${e.USER_NAME}
											</td>
										</tr>
									</c:forEach>



								</tbody>
							</table>
						</div>
						<!-- 					������� ����¡ -->
						<div
							class="grid px-4 py-3 text-xs font-semibold tracking-wide text-gray-500 uppercase border-t dark:border-gray-700 bg-gray-50 sm:grid-cols-9 dark:text-gray-400 dark:bg-gray-800">
							<span class="col-span-2"></span>
							<!-- Pagination -->
							<span class="flex col-span-4 mt-2 sm:mt-auto sm:justify-end">
								<!-- 							<nav aria-label="Table navigation"> -->
								<ul class="inline-flex items-center">
									<!-- ���������� < -->
									<c:if test="${paging.startPage != 1 }">
										<a href="dashboard.do?nowPage=${paging.startPage - 1 }&
										cntPerPage=${paging.cntPerPage}">&lt;</a>
									</c:if>
									<c:forEach begin="${paging.startPage }"
										end="${paging.endPage }" var="p">
										<c:choose>
											<c:when test="${p == paging.nowPage }">
												<b>${p }</b>
												<%--���� ������ �ϰ�� ��ũ ���� --%>
											</c:when>
											<c:when test="${p != paging.nowPage }">
												<%-- �ٸ������� ��ũ --%>
												<a
													href="dashboard.do?nowPage=${p }&cntPerPage=${paging.cntPerPage}">${p }</a>
											</c:when>
										</c:choose>
									</c:forEach>
									<!-- ���������� > -->
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
