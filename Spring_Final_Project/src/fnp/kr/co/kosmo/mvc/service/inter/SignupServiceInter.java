package fnp.kr.co.kosmo.mvc.service.inter;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

public interface SignupServiceInter {
	//회원가입
	public String signup(MemberDTO dto);
		
	// id체크
	public int idcheck(String user_id);
	
}
