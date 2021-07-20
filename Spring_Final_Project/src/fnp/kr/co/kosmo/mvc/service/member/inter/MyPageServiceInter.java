package fnp.kr.co.kosmo.mvc.service.member.inter;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

public interface MyPageServiceInter {

	public MemberDTO getUserInfo(String user_id);

	public MemberDTO memchk(MemberDTO vo);

	public void memUpdate(MemberDTO vo);
}
