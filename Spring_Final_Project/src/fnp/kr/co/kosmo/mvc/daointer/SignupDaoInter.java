package fnp.kr.co.kosmo.mvc.daointer;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

public interface SignupDaoInter {

	//회원가입
	public void signup(MemberDTO dto);
		
	//id체크
	public int idcheck(String user_id);
	
	//특이문자 포함 난수 발생
	public int random(String randomnum);
}
