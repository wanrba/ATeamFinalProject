package fnp.kr.co.kosmo.mvc.dao.member.inter;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

public interface MyPageDaoInter {

	// 0717 윤하늘 , 마이페이지 정보 출력
	public MemberDTO myInfo(String user_id);
	// 0717 윤하늘 , 마이페이지 회원정보 인증
	public MemberDTO memchk(MemberDTO vo);
	// 0717 윤하늘 , 마이페이지 내 정보 업데이트
	public void memUpdate(MemberDTO vo);
}
