package fnp.kr.co.kosmo.mvc.dao.member.inter;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

public interface LoginDaoInter {

	public MemberDTO login(MemberDTO dto);
	
	public int random(String randomnum);
	
	public int seluser(String pk);
	
	public void requestMatch(MemberDTO dto);
	
	
	public MemberDTO memberIdFind(MemberDTO dto);
	
	public MemberDTO memberPwdFind(MemberDTO dto);
}
