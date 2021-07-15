package fnp.kr.co.kosmo.mvc.controller.member;



import java.io.IOException;
import java.util.Calendar;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;
import fnp.kr.co.kosmo.mvc.service.inter.SignupServiceInter;
@Controller
public class SignUpAction {
	
	@Autowired
	private SignupServiceInter signupServiceInter;
	
	
	//회원가입 메서드
	@PostMapping("/signupAction.do")
	public ModelAndView signUp(MemberDTO dto) {
		System.out.println("");
		//==========현재 날짜 구해서 민증번호로 생년월일 출력
		Calendar cal = Calendar.getInstance();
		String year = String.valueOf(cal.get(Calendar.YEAR));
		//System.out.println(year);         2021 : type String
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
		//System.out.println(sb.toString());
		dto.setUser_birth(sb.toString());
		//================ end =================
		
		//===============민증 뒤에 한자리로 성별 출력===========
		int gen = Integer.parseInt(usersplit[1]);
		if(gen%2 ==0) {
			dto.setUser_gender("여자");
		}else {
			dto.setUser_gender("남자");
		}
		//System.out.println(dto.getUser_age());		나이 현재나이
		//System.out.println(dto.getUser_gender());     성별
		//============== end ========================= 
		String pk=signupServiceInter.signup(dto);
		ModelAndView mav = new ModelAndView();
		mav.addObject("num", 1);
		mav.addObject("pk", pk);
		mav.setViewName("member/signup/signup");
		return mav;

	}
	
	// 아이디 체크
	@RequestMapping(value = "/loginAction.do")
	@ResponseBody
	public void login(String user_id, HttpServletResponse response) {
		//System.out.println(user_id);
		int num = signupServiceInter.idcheck(user_id);
		int checknum;
		try {
			response.setContentType("text/html; charset=EUC-KR");
			if (num == 0) {
				checknum = 1;
				response.getWriter().print(checknum);
			} else if (num > 0) {
				checknum = 2;
				response.getWriter().print(checknum);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
