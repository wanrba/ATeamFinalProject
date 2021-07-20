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
	 * ���������� ���� ���
	 * @param user_id
	 * @return
	 */
	@Override
	public MemberDTO getUserInfo(String user_id) {
		return ss.selectOne("member.myInfo", user_id);
	}

	/**
	 * 07-17 HN
	 * ���������� ȸ������ ����
	 * @param vo
	 * @return
	 */
	@Override
	public MemberDTO memchk(MemberDTO vo) {
		return ss.selectOne("member.memchk",vo);
	}

	/**
	 * 07-17 HN
	 * ���������� �� ���� ������Ʈ
	 * @param vo
	 */
	@Override
	public void memUpdate(MemberDTO vo) {
		ss.update("member.mUpdate",vo);
	}
}
