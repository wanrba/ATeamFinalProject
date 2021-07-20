package fnp.kr.co.kosmo.mvc.dao.member.inter;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

public interface MyPageDaoInter {

	/**
	 * 07-17 HN
	 * 마이페이지 정보 출력
	 * @param user_id
	 * @return
	 */
	public MemberDTO getUserInfo(String user_id);

	/**
	 * 07-17 HN
	 * 마이페이지 회원정보 인증
	 * @param vo
	 * @return
	 */
	public MemberDTO memchk(MemberDTO vo);

	/**
	 * 07-17 HN
	 * 마이페이지 내 정보 업데이트
	 * @param vo
	 */
	public void memUpdate(MemberDTO vo);
}
