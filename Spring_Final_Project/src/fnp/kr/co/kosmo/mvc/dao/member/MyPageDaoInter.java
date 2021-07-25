package fnp.kr.co.kosmo.mvc.dao.member;

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
	
	/**
    * 7/24 김미연
    * 회원탈퇴
    * @param couple_num
    */
   public void delInfo(int couple_num);
	   
   /**
    * 커플등록 전에 탈퇴할경우  7/24 김미연
    * @param user_num
    */
   public void delInfo2(int user_num);
}
