package fnp.kr.co.kosmo.mvc.dao.member;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;
@Repository
public class CouplemcDao implements fnp.kr.co.kosmo.mvc.dao.member.CouplemcDaoInter{
	
	@Autowired
	private SqlSessionTemplate ss;
	/**
	 * 07-20 Woo
	 * couplemc 신규 등록
	 */
	@Override
	public void couplemcM(String first) {
		ss.update("couplemc.updateMcouplemc", first);
	}
	@Override
	public void couplemcW(String first,String second) {
		Map<String,String> params = new HashMap<>();
				params.put("first", first);
				params.put("second",second);
		ss.update("couplemc.updateWcouplemc",params);
	}
	@Override
	public MemberDTO getMatchInfo(int match) {
		MemberDTO result = ss.selectOne("couplemc.getMatchInfo",match);
		return result;
	}
	@Override
	public void couplemcSuccess(String first,String second) {
		Map<String,String> params = new HashMap<>();
		params.put("first", first);
		params.put("second",second);
		ss.insert("couplemc.insertCouple",params);
	}
	
	
}
