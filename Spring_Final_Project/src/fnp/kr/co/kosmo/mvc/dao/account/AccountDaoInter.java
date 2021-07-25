package fnp.kr.co.kosmo.mvc.dao.account;

import java.util.List;
import java.util.Map;

import fnp.kr.co.kosmo.mvc.dto.AccountDTO;


public interface AccountDaoInter {
	
	public List<Map<String, String>> getAccountInfo(Map<String, Object> map);
	// 0724 최형우 거래목록 리스트,페이징처리
	public int getTotalCount(int coupleNum);

	/**
	 * 7/22 김미연 - 커플통장 개설
	 * @param acdto
	 */
	public void makeAccount(AccountDTO acdto);

}
