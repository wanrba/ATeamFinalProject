package fnp.kr.co.kosmo.mvc.dao.member.inter;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

public interface MyPageDaoInter {

	public MemberDTO myInfo(String user_id);
	
	public MemberDTO memchk(MemberDTO vo);
	
	public void memUpdate(MemberDTO vo);
}
