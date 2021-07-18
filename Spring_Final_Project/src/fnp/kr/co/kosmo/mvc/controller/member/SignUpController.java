package fnp.kr.co.kosmo.mvc.controller.member;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;
import fnp.kr.co.kosmo.mvc.service.member.inter.SignupServiceInter;

@Controller
public class SignUpController {

	@Autowired
	private SignupServiceInter signupServiceInter;

	/**
	 * LeeGun
	 * @return
	 */
	@GetMapping(value = { "/signup.do" })
	public String signupForm() {
		return "member/signup";
	}

	/**
	 * 07-12 LeeGun
	 * 회원가입 시 입력한 정보를 받아 DB에 입력
	 * @param dto
	 * @return
	 */
	@PostMapping("/signupAction.do")
	public ModelAndView signUp(MemberDTO dto) {

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
		String pk=signupServiceInter.signup(dto);
		ModelAndView mav = new ModelAndView();
		mav.addObject("num", 1);
		mav.addObject("pk", pk);
		mav.setViewName("member/signup");
		return mav;

	}

}
