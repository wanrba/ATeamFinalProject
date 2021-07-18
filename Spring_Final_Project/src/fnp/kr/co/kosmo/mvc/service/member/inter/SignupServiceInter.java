package fnp.kr.co.kosmo.mvc.service.member.inter;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

public interface SignupServiceInter {

	public String signup(MemberDTO dto);
		
	// idüũ
	public int idcheck(String user_id);
	
}
