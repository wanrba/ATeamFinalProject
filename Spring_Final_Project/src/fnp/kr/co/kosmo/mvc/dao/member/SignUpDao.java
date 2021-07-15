package fnp.kr.co.kosmo.mvc.dao.member;

import org.mybatis.spring.SqlSessionTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import fnp.kr.co.kosmo.mvc.daointer.SignupDaoInter;
import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

@Repository
public class SignUpDao implements SignupDaoInter{
	@Autowired
	private SqlSessionTemplate ss;

//	// 이메일(id) 체크하는 메서드
//	public int emailchek(String user_id) {
//			return ss.selectOne("signup.emailchek", user_id);
//		}
	
	//회원가입하는 메서드
	@Override
	public void signup(MemberDTO dto) {
		System.out.println("Dao실행");
		ss.insert("member.signup",dto);
		
	}

	//id체크하는 메서드
	@Override
	public int idcheck(String user_id) {
		return ss.selectOne("member.idchek", user_id);
	}

	//특이문자 포함 난수 발생
	@Override
	public int random(String pk) {
		return ss.selectOne("member.random",pk);
	}

}
