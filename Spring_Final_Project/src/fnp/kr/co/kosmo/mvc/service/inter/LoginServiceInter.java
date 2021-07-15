package fnp.kr.co.kosmo.mvc.service.inter;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

public interface LoginServiceInter {
	//login
	public MemberDTO login(MemberDTO dto);
	
	//¸ÅÄª ½ÅÃ»
	public int requestMatch(MemberDTO dto);
}
