package fnp.kr.co.kosmo.mvc.service.inter;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

public interface LoginServiceInter {
	//login
	public MemberDTO login(MemberDTO dto);
	
	//��Ī ��û
	public int requestMatch(MemberDTO dto);
}
