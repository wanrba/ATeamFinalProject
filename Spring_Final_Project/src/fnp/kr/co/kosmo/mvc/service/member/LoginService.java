package fnp.kr.co.kosmo.mvc.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fnp.kr.co.kosmo.mvc.dao.member.inter.LoginDaoInter;
import fnp.kr.co.kosmo.mvc.dto.MemberDTO;
import fnp.kr.co.kosmo.mvc.service.member.inter.LoginServiceInter;

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
	public int requestMatch(MemberDTO dto) {
		int usernum = loginDaoInter.random(dto.getUser_primarykey());
		if(usernum > 0){
			dto.setUser_nowmatch(loginDaoInter.seluser(dto.getUser_primarykey()));
			loginDaoInter.requestMatch(dto);
		}
		return usernum;
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
