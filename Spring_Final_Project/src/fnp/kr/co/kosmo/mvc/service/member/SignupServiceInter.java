package fnp.kr.co.kosmo.mvc.service.member;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

public interface SignupServiceInter {

	public void signup(MemberDTO dto);
		
	// idüũ
	public int idcheck(String user_id);
	
}
