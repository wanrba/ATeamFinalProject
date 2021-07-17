package fnp.kr.co.kosmo.mvc.dao.member.inter;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

public interface SignupDaoInter {

	//ȸ������
	public void signup(MemberDTO dto);
		
	//idüũ
	public int idcheck(String user_id);
	
	//Ư�̹��� ���� ���� �߻�
	public int random(String randomnum);
}
