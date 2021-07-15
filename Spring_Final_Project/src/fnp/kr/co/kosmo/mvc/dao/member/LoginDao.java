package fnp.kr.co.kosmo.mvc.dao.member;

import org.mybatis.spring.SqlSessionTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fnp.kr.co.kosmo.mvc.daointer.LoginDaoInter;
import fnp.kr.co.kosmo.mvc.dto.MemberDTO;
@Repository
public class LoginDao implements LoginDaoInter{
	
	@Autowired
	private SqlSessionTemplate ss;
	
	//�α��α��
	@Override
	public MemberDTO login(MemberDTO dto) {
		return ss.selectOne("member.login",dto);
	}

	//���� ����
	@Override
	public int random(String pk) {
		return ss.selectOne("member.random",pk);
	}
	
	//������ �������ִ»�� üũ
	@Override
	public int seluser(String pk) {

		return ss.selectOne("member.seluser",pk);
	}

	//��Ī ��û
	@Override
	public void requestMatch(MemberDTO dto) {
		
		ss.update("member.requestMatch", dto);
	}

	

	
}
