package fnp.kr.co.kosmo.mvc.dao.cs;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fnp.kr.co.kosmo.mvc.dao.cs.inter.CsDaoInter;
import fnp.kr.co.kosmo.mvc.dto.CustomerServiceDTO;

@Repository
public class CsDao implements CsDaoInter{
	
	@Autowired
	private SqlSessionTemplate ss;

	@Override
	public void sendAsk(CustomerServiceDTO csdto) {
		ss.insert("cs.sendAsk",csdto);
		
	}
	
	

}
