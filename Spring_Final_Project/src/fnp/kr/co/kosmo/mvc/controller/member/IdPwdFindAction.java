package fnp.kr.co.kosmo.mvc.controller.member;

import java.net.URLDecoder;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;
import fnp.kr.co.kosmo.mvc.service.member.inter.LoginServiceInter;
@Controller
public class IdPwdFindAction {
	@Autowired
	public LoginServiceInter loginServiceInter;
	
	/**
	 * ���̵� ��й�ȣ ã�� Form
	 * @return
	 */
	@GetMapping("/idpwdFind.do")
	public String idpwdFind() {
		System.out.println("����־ȿ�?");
		return "member/idpwdFind";
	}

	/**
	 * ��й�ȣ ã�� ��
	 * @return
	 */
	@GetMapping(value = "/pwdFind.do")
	public String pwdFind() {
		return "member/pwdFind";
	}

	/**
	 * idã�� �׼� ajax
	 * @param dto
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/findId.do")
	@ResponseBody
	public String findId(MemberDTO dto, HttpServletResponse response) {
		System.out.println("findId.do++++++++++++++++++++++++");
		System.out.println("user_name: " + URLDecoder.decode(dto.getUser_name()));
		System.out.println("user_phone: " + dto.getUser_phone());

		MemberDTO list = loginServiceInter.memberIdFind(dto);

		if (list == null) {
			String msg = "�Է��� ������ �ٽ� Ȯ�����ּ���.";
			return msg;
		} else {
			String msg = "���̵� :" + list.getUser_id();

			return msg;
		}
	}

	/**
	 * ��й�ȣ ã�� action (ajax)
	 * @param dto
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/findPwd.do")
	@ResponseBody
	public String findPwd(MemberDTO dto, HttpServletResponse response) {
		System.out.println("findPwd.do++++++++++++++++++++++++");
		System.out.println("user_id: " + dto.getUser_id());
		System.out.println("user_name: " + URLDecoder.decode(dto.getUser_name()));
		System.out.println("user_phone: " + dto.getUser_phone());

		MemberDTO list = loginServiceInter.memberPwdFind(dto);

		if (list == null) {
			String msg = "�Է��� ������ �ٽ� Ȯ�����ּ���.";
			return msg;
		} else {
			String msg = "��й�ȣ :" + list.getUser_pwd();

			return msg;
		}
	}
	
}
