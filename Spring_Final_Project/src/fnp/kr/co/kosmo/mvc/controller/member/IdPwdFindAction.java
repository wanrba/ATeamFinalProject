package fnp.kr.co.kosmo.mvc.controller.member;

import java.net.URLDecoder;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;
import fnp.kr.co.kosmo.mvc.service.member.LoginServiceInter;
@Controller
public class IdPwdFindAction {
	@Autowired
	public LoginServiceInter loginServiceInter;
	
	/**
	 * 아이디 비밀번호 찾기 Form
	 * @return
	 */
	@GetMapping("/idpwdFind.do")
	public String idpwdFind() {
		return "member/find/idPwdFindForm";
	}

	/**
	 * 비밀번호 찾기 폼
	 * @return
	 */
	@GetMapping(value = "/pwdFind.do")
	public String pwdFind() {
		return "member/find/pwdFind";
	}

	/**
	 * id찾기 액션 ajax
	 * @param dto
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/findId.do")
	@ResponseBody
	public String findId(MemberDTO dto, HttpServletResponse response) {

		MemberDTO list = loginServiceInter.memberIdFind(dto);

		if (list == null) {
			String msg = "입력한 정보를 다시 확인해주세요.";
			return msg;
		} else {
			String msg = "아이디 :" + list.getUser_id();

			return msg;
		}
	}

	/**
	 * 비밀번호 찾기 action (ajax)
	 * @param dto
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/findPwd.do")
	@ResponseBody
	public String findPwd(MemberDTO dto, HttpServletResponse response) {

		MemberDTO list = loginServiceInter.memberPwdFind(dto);

		if (list == null) {
			String msg = "입력한 정보를 다시 확인해주세요.";
			return msg;
		} else {
			String msg = "비밀번호 :" + list.getUser_pwd();

			return msg;
		}
	}
	
}
