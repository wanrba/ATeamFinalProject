package fnp.kr.co.kosmo.mvc.controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;
import fnp.kr.co.kosmo.mvc.service.member.SignupServiceInter;

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
	 * 07-20 이건
	 * 회원가입 시 입력한 정보를 받아 DB에 입력
	 * @param dto
	 * @return
	 */
	@PostMapping("/signupAction.do")
	public ModelAndView signUp(MemberDTO dto) {
		signupServiceInter.signup(dto);
		ModelAndView mav = new ModelAndView();
		mav.addObject("num", 1);
		mav.setViewName("member/signup");
		return mav;

	}

}
