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
	 * ȸ������ �� ���̵� �ߺ�üũ��ư�� Ŭ������ ��� ��� ������ ���̵����� �Ǻ�
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
