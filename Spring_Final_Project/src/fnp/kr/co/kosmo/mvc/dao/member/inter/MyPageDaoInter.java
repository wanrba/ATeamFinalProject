package fnp.kr.co.kosmo.mvc.dao.member.inter;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

public interface MyPageDaoInter {

	/**
	 * 07-17 HN
	 * ���������� ���� ���
	 * @param user_id
	 * @return
	 */
	public MemberDTO getUserInfo(String user_id);

	/**
	 * 07-17 HN
	 * ���������� ȸ������ ����
	 * @param vo
	 * @return
	 */
	public MemberDTO memchk(MemberDTO vo);

	/**
	 * 07-17 HN
	 * ���������� �� ���� ������Ʈ
	 * @param vo
	 */
	public void memUpdate(MemberDTO vo);
}
