package fnp.kr.co.kosmo.mvc.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MemberDefault {

	
	//로그인
	@GetMapping(value= {"/login.do"})
	public String LoginsignupForm() {
		return "member/login/login";
	}
	//회원가입
	@GetMapping(value= {"/signup.do"})
	public String signupForm() {
		return "member/signup/signup";
	}

}
