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

//	public int emailchek(String user_id) {
//			return ss.selectOne("signup.emailchek", user_id);
//		}
	
	@Override
	public void signup(MemberDTO dto) {
		System.out.println("Dao����");
		ss.insert("member.signup",dto);
		
	}

	@Override
	public int idcheck(String user_id) {
		return ss.selectOne("member.idchek", user_id);
	}

	@Override
	public int random(String pk) {
		return ss.selectOne("member.random",pk);
	}

}
