package fnp.kr.co.kosmo.mvc.service.member;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fnp.kr.co.kosmo.mvc.dao.member.inter.SignupDaoInter;
import fnp.kr.co.kosmo.mvc.dto.MemberDTO;
import fnp.kr.co.kosmo.mvc.service.member.inter.SignupServiceInter;

@Service
public class SignUpService implements SignupServiceInter {

	@Autowired
	private SignupDaoInter signupDaoInter;

	// 회원가입
	/**
	 * 0718 유민기 - 난수 생성 죽임
	 * @param dto
	 * @return
	 */
	@Override
	public void signup(MemberDTO dto) {
		signupDaoInter.signup(dto);
		
			//int pk = signupDaoInter.random(randomnum);
			//if (pk == 0) {
				//dto.setUser_primarykey(randomnum);
				//return randomnum;
	}

	// id체크
	@Override
	public int idcheck(String user_id) {

		int num = signupDaoInter.idcheck(user_id);
		return num;
	}

}
