package fnp.kr.co.kosmo.mvc.service.member;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import fnp.kr.co.kosmo.mvc.daointer.SignupDaoInter;
import fnp.kr.co.kosmo.mvc.dto.MemberDTO;
import fnp.kr.co.kosmo.mvc.service.inter.SignupServiceInter;
@Service
public class SignUpService implements SignupServiceInter{
	
	@Autowired
	private SignupDaoInter signupDaoInter;
	
	//ȸ������
	@Override
	public String signup(MemberDTO dto) {
		System.out.println("SignUpService����");
		while(true){
			String randomnum = randomPassword();
			int pk = signupDaoInter.random(randomnum);
			if(pk == 0) {
				System.out.println("���� : "+randomnum);
				dto.setUser_primarykey(randomnum);
				signupDaoInter.signup(dto);
				return randomnum;
			}
		}
	}
	
	// idüũ
	@Override
	public int idcheck(String user_id) {
		
		int num = signupDaoInter.idcheck(user_id);
		return num;
	}
	
	//���� �Ҵ��ȣ (����+����) ���� ����
	public String randomPassword() {
		String pwd ="";
		StringBuffer sb = new StringBuffer();
		Random rnd = new Random();
		for(int i=0; i<8; i++) {
			rnd.nextBoolean();
			if(rnd.nextBoolean()) {
				sb.append((char)((int)(rnd.nextInt(26))+97));
			}else {
				sb.append(rnd.nextInt(10));
			}
		}
		pwd=sb.toString();
		
		return pwd; 
	}
	
}
