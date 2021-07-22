package fnp.kr.co.kosmo.mvc.controller.member;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;
import fnp.kr.co.kosmo.mvc.service.member.inter.LoginServiceInter;
@Controller
public class LoginController {
	
	@Autowired
	public LoginServiceInter loginServiceInter;
	
	/**
	 * �α��������� �̵� �̰�
	 * @return
	 */
	@GetMapping(value= {"/loginForm.do"})
	public String LoginsignupForm() {
		return "member/login";
	}
	
	/**
	 * 0712�α��� �۵� �̰�
	 * @param session, dto
	 * @return mav
	 */
	@PostMapping("/login.do")
	public ModelAndView loginAction(HttpSession session, MemberDTO dto){
		MemberDTO map = loginServiceInter.login(dto);
		ModelAndView mav = new ModelAndView();
		if (map==null) {
			mav.setViewName("member/login");
			mav.addObject("emsg", "�ùٸ� ȸ�������� �ƴմϴ�.");
		}else {
			switch(map.getUser_match()) {
				case 0:
					session.setAttribute("sessionNum", map.getUser_num());
					session.setAttribute("sessionCoupleNum", map.getUser_cuplenum());
					session.setAttribute("sessionID", map.getUser_id());
					session.setAttribute("sessionName", map.getUser_name());
					mav.addObject("chk", "��������");
					mav.setViewName("index/index");
					break;
				case 1:
					mav.addObject("chk", "������");
					mav.setViewName("index/index");
					break;
				case 2:
					session.setAttribute("sessionNum", map.getUser_num());
					session.setAttribute("sessionID", map.getUser_id());
					session.setAttribute("sessionName", map.getUser_name());
					mav.setViewName("redirect:/index.do");
					break;
			}
			
		}
		return mav;
	}
	
	//logout
	@GetMapping("/logout.do")
	public String logoutAction(HttpSession session){
		session.removeAttribute("sessionNum");
		session.removeAttribute("sessionName");
		session.removeAttribute("sessionID");
		session.removeAttribute("sessionCoupleNum");
		return "redirect:/index.do";
	}


	
}
