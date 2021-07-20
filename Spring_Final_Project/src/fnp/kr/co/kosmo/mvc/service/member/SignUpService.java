package fnp.kr.co.kosmo.mvc.service.member;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fnp.kr.co.kosmo.mvc.dao.member.inter.SignupDaoInter;
import fnp.kr.co.kosmo.mvc.dto.MemberDTO;
import fnp.kr.co.kosmo.mvc.service.member.inter.SignupServiceInter;

@Service
public class SignUpService implements SignupServiceInter {

	@Autowired
	private SignupDaoInter signupDaoInter;

	// 회원가입
	/**
	 * 0718 유민기 - 난수 생성 죽임
	 * 0720 이건 - 컨트롤러 서비스로 옮기는 작업
	 * @param dto
	 * @return
	 */
	@Override
	public void signup(MemberDTO dto) {
		
		//==========현재 날짜 구해서 민증번호로 생년월일 출력
		Calendar cal = Calendar.getInstance();
		String year = String.valueOf(cal.get(Calendar.YEAR));
		
		String[] years = year.split("");
		int yearone = Integer.parseInt(years[0]+years[1]);
		int yeartwo = Integer.parseInt(years[2]+years[3]);
		String user_number = dto.getUser_birth();
		String[] usersplit = user_number.split("-");
		String[] birth=usersplit[0].split("");
		int useryear = Integer.parseInt(birth[0]+birth[1]);
		StringBuffer sb = new StringBuffer();
		if(yeartwo < useryear) {
			sb.append(String.valueOf(yearone-1));
			dto.setUser_age(100-useryear+yeartwo+1);
		}else {
			sb.append(String.valueOf(yearone));
			dto.setUser_age(yeartwo-useryear+1);
		}
		sb.append(birth[0]+birth[1]).append("-").append(birth[2]+birth[3]).append("-").append(birth[4]+birth[5]);
		dto.setUser_birth(sb.toString());
		//================ end =================
		
		//===============민증 뒤에 한자리로 성별 출력===========
		int gen = Integer.parseInt(usersplit[1]);
		if(gen%2 ==0) {
			dto.setUser_gender("여자");
		}else {
			dto.setUser_gender("남자");
		}
		//============== end ========================= 

		signupDaoInter.signup(dto);

	}

	// id체크
	@Override
	public int idcheck(String user_id) {

		int num = signupDaoInter.idcheck(user_id);
		return num;
	}

}
