<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<style>
.attending_area .main_attending_area .popup_box p {
	color: black;
}
</style>

<div class="attending_area">
	<div id="content" class="sub_wrap more_wrap">
		<div class="container">
			<div class="row">
				<div class="col-xl-10 offset-xl-1 col-lg-10 offset-lg-1">
					<div class="main_attending_area">
						<div class="row justify-content-center">
							<div class="col-xl-10 col-lg-8">
								<div class="popup_box" style="width: 700px; height: 800px">
									<div class="popup_inner">
										<form action="delinfo.do" method="post">
											<div class="col-xl-12">

												<div style="font-size: 30px">
													<b>유의사항</b>
												</div>
												<p>
													<br>본 사이트 회원탈퇴 시 연애사이트 서비스에 탈퇴됩니다.
												</p>
												<p>연애사이트 회원탈퇴 시 회원이 보유하고 있던 커플통장 머니, 커플상점 구매 상품, 커플지도 기록
													등은 모두 소멸되며, 복구가 불가능합니다.</p>
												<p>연애사이트 회원탈퇴 후 재가입하더라도 탈퇴 전의 회원정보, 거래정보 및 커플통장 머니, 사용
													전의 구매 티켓 등은 복구되지 않습니다.</p>
												<p>유상성 쿠폰 및 커플통장 머니 잔액 등은 [ 로그인 > 마이페이지 > 구매내역 ] 에서 확인하실
													수 있습니다.</p>
												<p>연애사이트 회원은 유상성 쿠폰 및 커플통장 머니를 회원탈퇴 신청 전에 환불신청하거나 소진하여야
													합니다. 회원이 환불 신청 없이 자진 탈퇴하고자 하는 경우, 회사는 위 상품들에대한 소멸 동의를 받습니다.</p>
												<p>연애사이트 회원은 고객센터 1:1 문의를 통해 환불이 가능한 상품의 경우 환불을 신청할 수
													있습니다.</p>
												<p>연애사이트 회원탈퇴 시 회원정보 및 서비스 이용기록은 모두 삭제되며, 삭제된 데이터는 복구가
													불가능 합니다. 다만, 회사 내부정책에 의하여 보관해야하는 정보는 회원탈퇴 후에도 일정기간 보관됩니다.
													자세한 사항은 연애사이트 개인정보처리방침에서 확인하실 수 있습니다.</p>
											</div>
											<div class="col-xl-12">
												<input type="checkbox" id="chk" name="chk" style="width: 30px; margin-bottom: 40px;"> 유의사항을 모두
												확인하였고 상기 내용에 동의합니다. 
												<input type="button" value="계정 삭제" id="delBtn"
													style="width: 45%; background-color: #fbbfa542;">&nbsp;&nbsp;&nbsp;
												<input type="button" value="탈퇴하고싶지 않아요!"
													onclick="location='index.do'"
													style="width: 45%; background-color: #f64a0094; font-weight: bold;" />
											</div>
										</form>
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
<script>
$("#delBtn").click(function(){
	if($("#chk").is(":checked")===true ){
		console.log('동의 체크함');
		location.href="delinfo.do";
	}else{
		alert('유의사항 동의여부에 체크해주세요.');
		location.reload();
	}
})
</script>