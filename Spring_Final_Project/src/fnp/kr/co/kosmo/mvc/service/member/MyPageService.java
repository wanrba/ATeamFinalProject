package fnp.kr.co.kosmo.mvc.service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fnp.kr.co.kosmo.mvc.dao.member.MyPageDaoInter;
import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

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
	
	@Override
	   public void delInfo(int couple_num) {
	      myPageDaoInter.delInfo(couple_num);
	      
   }

   @Override
   public void delInfo2(int user_num) {
      myPageDaoInter.delInfo2(user_num);
      
   }
}
