package fnp.kr.co.kosmo.mvc.dao.account;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fnp.kr.co.kosmo.mvc.dao.account.AccountDaoInter;
import fnp.kr.co.kosmo.mvc.dto.AccountDTO;

@Repository
public class AccountDao implements AccountDaoInter {

	@Autowired
	private SqlSessionTemplate ss;
	// 0724 최형우 거래목록 리스트,페이징처리 
	@Override
	public List<Map<String, String>> getAccountInfo(Map<String, Object> map) {
		List<Map<String, String>> list = ss.selectList("account.accountList", map);
		return list;
	}
	// 0724 최형우 거래목록 리스트,페이징처리
	@Override
	public int getTotalCount(int coupleNum) {
		return ss.selectOne("account.accountTotalCount",coupleNum);
	}

	// 7/22김미연-커플통장 개설
		@Override
		public void makeAccount(AccountDTO acdto) {
			ss.insert("account.makeAccount", acdto);
	
}
}