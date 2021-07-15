package fnp.kr.co.kosmo.mvc.dao.member;

import org.mybatis.spring.SqlSessionTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fnp.kr.co.kosmo.mvc.daointer.LoginDaoInter;
import fnp.kr.co.kosmo.mvc.dto.MemberDTO;
@Repository
public class LoginDao implements LoginDaoInter{
	
	@Autowired
	private SqlSessionTemplate ss;
	
	//로그인기능
	@Override
	public MemberDTO login(MemberDTO dto) {
		return ss.selectOne("member.login",dto);
	}

	//난수 유무
	@Override
	public int random(String pk) {
		return ss.selectOne("member.random",pk);
	}
	
	//난수를 가지고있는사람 체크
	@Override
	public int seluser(String pk) {

		return ss.selectOne("member.seluser",pk);
	}

	//매칭 신청
	@Override
	public void requestMatch(MemberDTO dto) {
		
		ss.update("member.requestMatch", dto);
	}

	

	
}
