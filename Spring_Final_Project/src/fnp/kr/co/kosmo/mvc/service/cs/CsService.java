package fnp.kr.co.kosmo.mvc.service.cs;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fnp.kr.co.kosmo.mvc.dao.cs.inter.CsDaoInter;
import fnp.kr.co.kosmo.mvc.dto.CustomerServiceDTO;
import fnp.kr.co.kosmo.mvc.service.cs.inter.CsServiceInter;

@Service
public class CsService implements CsServiceInter {

	@Autowired
	private CsDaoInter csDaoInter;

	/**
	 * 0721-��̿�
	 * @param csdto
	 * ����ڰ� ���ǳ���� db����ǵ���
	 */
	@Override
	public void sendAsk(CustomerServiceDTO csdto) {
		csDaoInter.sendAsk(csdto);
		
	}
	

}