package fnp.kr.co.kosmo.mvc.service.member.inter;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

public interface MyPageServiceInter {
	
	// mypage  정보보기 
		public MemberDTO myInfo(String user_id);
		
		// mypage pwd 체크
		public MemberDTO memchk(MemberDTO vo);

		// mypage 업데이트
		public void memUpdate(MemberDTO vo);
}
