package fnp.kr.co.kosmo.mvc.service.account;

import java.util.List;
import java.util.Map;

import fnp.kr.co.kosmo.mvc.dto.AccountDTO;
import fnp.kr.co.kosmo.mvc.dto.PageDTO;

public interface AccountServiceInter {
	// 0724 ������ �ŷ���� ����Ʈ,����¡ó��
	public List<Map<String, String>> getAccountInfo(int coupleNum,PageDTO dto);
	// 0724 ������ �ŷ���� ����Ʈ,����¡ó�� 
	public int getTotalCount(int coupleNum);
	
	/**
	 * 7/22 ��̿�-Ŀ������ ����
	 * @param acdto
	 */
	public void makeAccount(AccountDTO acdto);
}