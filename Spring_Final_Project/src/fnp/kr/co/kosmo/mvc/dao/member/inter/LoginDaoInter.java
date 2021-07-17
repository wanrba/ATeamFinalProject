package fnp.kr.co.kosmo.mvc.dao.member.inter;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

public interface LoginDaoInter {

	// �α���
	public MemberDTO login(MemberDTO dto);
	
	//���� ����
	public int random(String randomnum);
	
	// ������ ������ �ִ� ����� üũ
	public int seluser(String pk);
	
	//��Ī ��û
	public void requestMatch(MemberDTO dto);
}
