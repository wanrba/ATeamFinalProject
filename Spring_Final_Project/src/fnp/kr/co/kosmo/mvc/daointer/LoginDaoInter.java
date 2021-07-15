package fnp.kr.co.kosmo.mvc.daointer;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

public interface LoginDaoInter {

	// 로그인
	public MemberDTO login(MemberDTO dto);
	
	//난수 유무
	public int random(String randomnum);
	
	// 난수를 가지고 있는 사용자 체크
	public int seluser(String pk);
	
	//매칭 신청
	public void requestMatch(MemberDTO dto);
}
