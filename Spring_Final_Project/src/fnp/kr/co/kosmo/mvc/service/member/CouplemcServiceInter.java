package fnp.kr.co.kosmo.mvc.service.member;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

public interface CouplemcServiceInter {
	
	
	/**
	 * 07-20 Woo
	 * couplemc �ű� ���
	 */
	public void couplemcMservice(String first);
	public void couplemcWservice(String first,String second);
	public MemberDTO getMatchInfo(int match);
	public void couplemcSuccess(String first,String second);
	
}
