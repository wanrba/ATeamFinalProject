package fnp.kr.co.kosmo.mvc.dao.account;

import java.util.List;
import java.util.Map;

import fnp.kr.co.kosmo.mvc.dto.AccountDTO;


public interface AccountDaoInter {
	
	public List<Map<String, String>> getAccountInfo(Map<String, Object> map);
	// 0724 ������ �ŷ���� ����Ʈ,����¡ó��
	public int getTotalCount(int coupleNum);

	/**
	 * 7/22 ��̿� - Ŀ������ ����
	 * @param acdto
	 */
	public void makeAccount(AccountDTO acdto);

}
