package fnp.kr.co.kosmo.mvc.service.inter;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

public interface SignupServiceInter {
	//ȸ������
	public String signup(MemberDTO dto);
		
	// idüũ
	public int idcheck(String user_id);
	
}
