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

	@Override
	public MemberDTO myInfo(String user_id) {
		System.out.println("myInfo ����!!!");
		return ss.selectOne("member.myInfo", user_id);
	}

	@Override
	public MemberDTO memchk(MemberDTO vo) {
		System.out.println("memchk Dao ����!");
		return ss.selectOne("member.memchk",vo);
	}

	@Override
	public void memUpdate(MemberDTO vo) {
		ss.update("member.mUpdate",vo);
	}
}
