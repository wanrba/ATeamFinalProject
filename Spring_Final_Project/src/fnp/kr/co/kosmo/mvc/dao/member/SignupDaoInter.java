package fnp.kr.co.kosmo.mvc.dao.member;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

public interface SignupDaoInter {

	public void signup(MemberDTO dto);
		
	//id체크
	public int idcheck(String user_id);
	
	/**
	 *  0718 유민기 public int random(String randomnum); 삭제
	 * @param randomnum
	 * @return
	 */
	
}
