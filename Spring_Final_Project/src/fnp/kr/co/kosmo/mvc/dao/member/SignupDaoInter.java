package fnp.kr.co.kosmo.mvc.dao.member;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

public interface SignupDaoInter {

	public void signup(MemberDTO dto);
		
	//idüũ
	public int idcheck(String user_id);
	
	/**
	 *  0718 ���α� public int random(String randomnum); ����
	 * @param randomnum
	 * @return
	 */
	
}
