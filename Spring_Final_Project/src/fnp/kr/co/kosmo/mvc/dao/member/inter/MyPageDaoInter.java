package fnp.kr.co.kosmo.mvc.dao.member.inter;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

public interface MyPageDaoInter {

	// 0717 ���ϴ� , ���������� ���� ���
	public MemberDTO myInfo(String user_id);
	// 0717 ���ϴ� , ���������� ȸ������ ����
	public MemberDTO memchk(MemberDTO vo);
	// 0717 ���ϴ� , ���������� �� ���� ������Ʈ
	public void memUpdate(MemberDTO vo);
}
