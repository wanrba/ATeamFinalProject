package fnp.kr.co.kosmo.mvc.service.member;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fnp.kr.co.kosmo.mvc.dao.member.CouplemcDaoInter;
import fnp.kr.co.kosmo.mvc.dto.MemberDTO;
@Service
public class CouplemcService implements CouplemcServiceInter{

	@Autowired
	private CouplemcDaoInter couplemcDaoInter;
	
	
	/**
	 * 07-20 Woo
	 * couplemc 신규 등록
	 */
	@Override
	public void couplemcMservice(String first) {
		couplemcDaoInter.couplemcM(first);
	}
	@Override
	public void couplemcWservice(String first,String second) {
		couplemcDaoInter.couplemcW(first, second);
	}
	@Override
	public MemberDTO getMatchInfo(int match) {
		MemberDTO result = couplemcDaoInter.getMatchInfo(match);
		return result;
	}
	@Override
	public void couplemcSuccess(String first, String second) {
		couplemcDaoInter.couplemcSuccess(first, second);
	}
	

}
