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
	// 0724 ������ �ŷ���� ����Ʈ,����¡ó�� 
	@Override
	public List<Map<String, String>> getAccountInfo(Map<String, Object> map) {
		List<Map<String, String>> list = ss.selectList("account.accountList", map);
		return list;
	}
	// 0724 ������ �ŷ���� ����Ʈ,����¡ó��
	@Override
	public int getTotalCount(int coupleNum) {
		return ss.selectOne("account.accountTotalCount",coupleNum);
	}

	// 7/22��̿�-Ŀ������ ����
		@Override
		public void makeAccount(AccountDTO acdto) {
			ss.insert("account.makeAccount", acdto);
	
}
}