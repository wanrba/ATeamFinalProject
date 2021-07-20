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
		// 07-20 YoungJin
		// MemberDTO 변경으로 인해 주석처리 및 로직오류로 인한 값 직접 입력해놓음
		// 추후 수정필요
		
//		int usernum = loginDaoInter.random(dto.getUser_primarykey());
//		if(usernum > 0){
//			dto.setUser_nowmatch(loginDaoInter.seluser(dto.getUser_primarykey()));
//			loginDaoInter.requestMatch(dto);
//		}
//		return usernum;
		return 1;
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
