package fnp.kr.co.kosmo.mvc.dao.member;

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
	
	/**
    * 7/24 ��̿�
    * ȸ��Ż��
    * @param couple_num
    */
   public void delInfo(int couple_num);
	   
   /**
    * Ŀ�õ�� ���� Ż���Ұ��  7/24 ��̿�
    * @param user_num
    */
   public void delInfo2(int user_num);
}
