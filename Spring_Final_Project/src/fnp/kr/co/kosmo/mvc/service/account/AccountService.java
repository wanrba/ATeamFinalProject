package fnp.kr.co.kosmo.mvc.service.account;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fnp.kr.co.kosmo.mvc.dao.account.AccountDaoInter;
import fnp.kr.co.kosmo.mvc.dto.PageDTO;
import fnp.kr.co.kosmo.mvc.service.account.AccountServiceInter;

import fnp.kr.co.kosmo.mvc.dto.AccountDTO;


@Service
public class AccountService implements AccountServiceInter {

	@Autowired
	private AccountDaoInter accountDaoInter;
	// 0724 최형우 거래목록 리스트,페이징처리
	@Override
	public List<Map<String, String>> getAccountInfo(int coupleNum,PageDTO dto) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("coupleNum", coupleNum);
		map.put("dto", dto);
		List<Map<String, String>> list = accountDaoInter.getAccountInfo(map);
		return list;
	}
	// 0724 최형우 거래목록 리스트,페이징처리
	@Override
	public int getTotalCount(int coupleNum) {
		return accountDaoInter.getTotalCount(coupleNum);
	}
	//7/22 김미연-커플통장 개설
	@Override
	public void makeAccount(AccountDTO acdto) {
		accountDaoInter.makeAccount(acdto);

}
}