package fnp.kr.co.kosmo.mvc.service.account;

import java.util.List;
import java.util.Map;

import fnp.kr.co.kosmo.mvc.dto.AccountDTO;
import fnp.kr.co.kosmo.mvc.dto.PageDTO;

public interface AccountServiceInter {
	// 0724 최형우 거래목록 리스트,페이징처리
	public List<Map<String, String>> getAccountInfo(int coupleNum,PageDTO dto);
	// 0724 최형우 거래목록 리스트,페이징처리 
	public int getTotalCount(int coupleNum);
	
	/**
	 * 7/22 김미연-커플통장 개설
	 * @param acdto
	 */
	public void makeAccount(AccountDTO acdto);
}