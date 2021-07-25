package fnp.kr.co.kosmo.mvc.controller.restful;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fnp.kr.co.kosmo.mvc.service.member.SignupServiceInter;

@RestController
public class MemberRestfulController {

	@Autowired
	private SignupServiceInter signupServiceInter;

	/**
	 * 07-12 LeeGun
	 * 회원가입 시 아이디 중복체크버튼을 클릭했을 경우 사용 가능한 아이디인지 판별
	 * @param user_id
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/loginAction.do")
	public int login(String user_id, HttpServletResponse response) {
		
		if (signupServiceInter.idcheck(user_id) > 0) {
			return 2;
		} else {
			return 1;
		}

	}

}
