package fnp.kr.co.kosmo.mvc.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fnp.kr.co.kosmo.mvc.dao.member.LoginDaoInter;
import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

@Service
public class LoginService implements LoginServiceInter{
	
	@Autowired
	public LoginDaoInter loginDaoInter;
	
	//login
	@Override
	public MemberDTO login(MemberDTO dto) {
		MemberDTO map = loginDaoInter.login(dto);
		return map;
	}


	
	@Override
	public MemberDTO memberIdFind(MemberDTO dto) {
		return loginDaoInter.memberIdFind(dto);
	}

	@Override
	public MemberDTO memberPwdFind(MemberDTO dto) {
		return loginDaoInter.memberPwdFind(dto);
	}
	
}
