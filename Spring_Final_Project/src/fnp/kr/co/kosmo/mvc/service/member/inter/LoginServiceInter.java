package fnp.kr.co.kosmo.mvc.service.member.inter;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

public interface LoginServiceInter {

	// login
	public MemberDTO login(MemberDTO dto);


	// id find
	public MemberDTO memberIdFind(MemberDTO dto);

	// pwd find
	public MemberDTO memberPwdFind(MemberDTO dto);
}
