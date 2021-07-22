package fnp.kr.co.kosmo.mvc.dao.member;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fnp.kr.co.kosmo.mvc.dao.member.inter.SignupDaoInter;
import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

@Repository
public class SignUpDao implements SignupDaoInter{
	@Autowired
	private SqlSessionTemplate ss;
	
	@Override
	public void signup(MemberDTO dto) {
		ss.insert("member.signup",dto);
	}

	@Override
	public int idcheck(String user_id) {
		return ss.selectOne("member.idchek", user_id);
	}



}
