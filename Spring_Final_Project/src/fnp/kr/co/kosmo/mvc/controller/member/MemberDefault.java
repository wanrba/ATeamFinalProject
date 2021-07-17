package fnp.kr.co.kosmo.mvc.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MemberDefault {

	
	//�α���
	@GetMapping(value= {"/loginForm.do"})
	public String LoginsignupForm() {
		return "member/login";
	}
	//ȸ������
	@GetMapping(value= {"/signup.do"})
	public String signupForm() {
		return "member/signup";
	}

}
