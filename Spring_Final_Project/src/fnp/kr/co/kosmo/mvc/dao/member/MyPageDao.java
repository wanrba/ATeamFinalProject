package fnp.kr.co.kosmo.mvc.dao.member;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

@Repository
public class MyPageDao implements MyPageDaoInter{
	@Autowired
	private SqlSessionTemplate ss;

	/**
	 * 07-17 HN
	 * 마이페이지 정보 출력
	 * @param user_id
	 * @return
	 */
	@Override
	public MemberDTO getUserInfo(String user_id) {
		return ss.selectOne("member.myInfo", user_id);
	}

	/**
	 * 07-17 HN
	 * 마이페이지 회원정보 인증
	 * @param vo
	 * @return
	 */
	@Override
	public MemberDTO memchk(MemberDTO vo) {
		return ss.selectOne("member.memchk",vo);
	}

	/**
	 * 07-17 HN
	 * 마이페이지 내 정보 업데이트
	 * @param vo
	 */
	@Override
	public void memUpdate(MemberDTO vo) {
		ss.update("member.mUpdate",vo);
	}
	

	/**
	 * 7/24 김미연
	 * 커플이 회원탈퇴
	 * @param couple_num
	 */
	@Override
	   public void delInfo(int couple_num) {
	      ss.delete("member.delinfo",couple_num);
	      
	   }

	   /**
	    * 커플등록 전에 탈퇴할경우  7/24 김미연
	    */
	   @Override
	   public void delInfo2(int user_num) {
	      ss.delete("member.delinfo2",user_num);
	      
	   }
}
