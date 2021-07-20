package fnp.kr.co.kosmo.mvc.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fnp.kr.co.kosmo.mvc.dao.member.inter.MyPageDaoInter;
import fnp.kr.co.kosmo.mvc.dto.MemberDTO;
import fnp.kr.co.kosmo.mvc.service.member.inter.MyPageServiceInter;

@Service
public class MyPageService implements MyPageServiceInter{
	
	@Autowired
	private MyPageDaoInter myPageDaoInter;

	@Override
	public MemberDTO getUserInfo(String user_id) {
		return myPageDaoInter.getUserInfo(user_id);
	}

	@Override
	public MemberDTO memchk(MemberDTO vo) {
		return myPageDaoInter.memchk(vo);
	}

	@Override
	public void memUpdate(MemberDTO vo) {
		myPageDaoInter.memUpdate(vo);
		
	}

}
