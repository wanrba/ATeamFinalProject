package fnp.kr.co.kosmo.mvc.controller.member;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;
import fnp.kr.co.kosmo.mvc.service.inter.LoginServiceInter;
@Controller
public class LoginAction {
	
	@Autowired
	public LoginServiceInter loginServiceInter;
	
	@PostMapping("/login.do")
	public ModelAndView loginAction(HttpSession session, MemberDTO dto){
		MemberDTO map = loginServiceInter.login(dto);
		ModelAndView mav = new ModelAndView();
		if (map==null) {
			mav.setViewName("member/login/login");
			mav.addObject("emsg", "올바른 회원정보가 아닙니다.");
		}else {
			switch(map.getUser_match()) {
				case 0:
					session.setAttribute("sessionNum", map.getUser_num());
					session.setAttribute("sessionpk", map.getUser_primarykey());
					session.setAttribute("sessionID", map.getUser_id());
					session.setAttribute("sessionName", map.getUser_name());
					mav.addObject("chk", "승인이전");
					mav.setViewName("index");
					break;
				case 1:
					mav.addObject("chk", "승인중");
					mav.setViewName("index");
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
		session.removeAttribute("sessionpk");
		session.removeAttribute("sessionName");
		session.removeAttribute("sessionID");
		return "redirect:/index.do";
	}
	
	//user_match
	@GetMapping({"/usermach.do"})
	@ResponseBody
	public void usermatch(MemberDTO dto, HttpServletResponse response) {
		System.out.println("user_num"+dto.getUser_num());
		System.out.println("primarykey"+dto.getUser_primarykey());
		
		// 0 : 신청 실패(난수를 가진 사용자가 없다, 1 : 신청 선공 
		int num = loginServiceInter.requestMatch(dto);
		try {
			response.setContentType("text/html; charset=euc-kr");
			if (num == 0) {
				response.getWriter().print(1);
			} else if (num > 0) {
				response.getWriter().print(2);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
