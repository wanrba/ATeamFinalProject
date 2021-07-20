package fnp.kr.co.kosmo.mvc.dao.member;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fnp.kr.co.kosmo.mvc.dao.member.inter.MyPageDaoInter;
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
}
