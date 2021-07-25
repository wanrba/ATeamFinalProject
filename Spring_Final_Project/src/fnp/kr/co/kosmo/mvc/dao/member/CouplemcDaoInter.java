package fnp.kr.co.kosmo.mvc.dao.member;

import java.util.Map;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

public interface CouplemcDaoInter {
	/**
	 * 07-20 Woo
	 * couplemc 신규 등록
	 */
	public void couplemcM(String first);
	public void couplemcW(String first,String second);
	public MemberDTO getMatchInfo(int match);
	public void couplemcSuccess(String first,String second);
}
