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
													<b>���ǻ���</b>
												</div>
												<p>
													<br>�� ����Ʈ ȸ��Ż�� �� ���ֻ���Ʈ ���񽺿� Ż��˴ϴ�.
												</p>
												<p>���ֻ���Ʈ ȸ��Ż�� �� ȸ���� �����ϰ� �ִ� Ŀ������ �Ӵ�, Ŀ�û��� ���� ��ǰ, Ŀ������ ���
													���� ��� �Ҹ�Ǹ�, ������ �Ұ����մϴ�.</p>
												<p>���ֻ���Ʈ ȸ��Ż�� �� �簡���ϴ��� Ż�� ���� ȸ������, �ŷ����� �� Ŀ������ �Ӵ�, ���
													���� ���� Ƽ�� ���� �������� �ʽ��ϴ�.</p>
												<p>���� ���� �� Ŀ������ �Ӵ� �ܾ� ���� [ �α��� > ���������� > ���ų��� ] ���� Ȯ���Ͻ�
													�� �ֽ��ϴ�.</p>
												<p>���ֻ���Ʈ ȸ���� ���� ���� �� Ŀ������ �Ӵϸ� ȸ��Ż�� ��û ���� ȯ�ҽ�û�ϰų� �����Ͽ���
													�մϴ�. ȸ���� ȯ�� ��û ���� ���� Ż���ϰ��� �ϴ� ���, ȸ��� �� ��ǰ�鿡���� �Ҹ� ���Ǹ� �޽��ϴ�.</p>
												<p>���ֻ���Ʈ ȸ���� ������ 1:1 ���Ǹ� ���� ȯ���� ������ ��ǰ�� ��� ȯ���� ��û�� ��
													�ֽ��ϴ�.</p>
												<p>���ֻ���Ʈ ȸ��Ż�� �� ȸ������ �� ���� �̿����� ��� �����Ǹ�, ������ �����ʹ� ������
													�Ұ��� �մϴ�. �ٸ�, ȸ�� ������å�� ���Ͽ� �����ؾ��ϴ� ������ ȸ��Ż�� �Ŀ��� �����Ⱓ �����˴ϴ�.
													�ڼ��� ������ ���ֻ���Ʈ ��������ó����ħ���� Ȯ���Ͻ� �� �ֽ��ϴ�.</p>
											</div>
											<div class="col-xl-12">
												<input type="checkbox" id="chk" name="chk" style="width: 30px; margin-bottom: 40px;"> ���ǻ����� ���
												Ȯ���Ͽ��� ��� ���뿡 �����մϴ�. 
												<input type="button" value="���� ����" id="delBtn"
													style="width: 45%; background-color: #fbbfa542;">&nbsp;&nbsp;&nbsp;
												<input type="button" value="Ż���ϰ���� �ʾƿ�!"
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
		console.log('���� üũ��');
		location.href="delinfo.do";
	}else{
		alert('���ǻ��� ���ǿ��ο� üũ���ּ���.');
		location.reload();
	}
})
</script>