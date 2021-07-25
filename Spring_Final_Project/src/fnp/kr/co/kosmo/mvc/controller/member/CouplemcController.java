package fnp.kr.co.kosmo.mvc.controller.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;
import fnp.kr.co.kosmo.mvc.service.member.CouplemcServiceInter;


@Controller
public class CouplemcController {
	/**
	 * 07-20 최형우 couplemc 신규 등록
	 */
	@Autowired
	private CouplemcServiceInter couplemcServiceInter;

	@RequestMapping(value = { "/couplemc.do" })
	public String couplemcPage(HttpServletRequest request, Model m) {
		HttpSession session = request.getSession();
		int match = (int) session.getAttribute("sessionMatch");
		if (match == 1) {
			m.addAttribute("msg", "승인 대기상태입니다.");
		}
		if (match >= 2) {
			MemberDTO result = couplemcServiceInter.getMatchInfo(match);
			m.addAttribute("matchInfo", result);
		}
		return "mypage/couplemc";
	}

	@PostMapping("/couplemcAction.do")
	public ModelAndView couplemc(HttpServletRequest httpServletRequest) {
		ModelAndView mav = new ModelAndView();
		String first = (String) httpServletRequest.getSession().getAttribute("sessionID");
		String second = httpServletRequest.getParameter("secondid");
		couplemcServiceInter.couplemcMservice(first);
		couplemcServiceInter.couplemcWservice(first, second);
		mav.addObject("num", 1);
		mav.setViewName("mypage/couplemc");
		return mav;
	}

	@RequestMapping(value = { "/matchSucess.do" })
	public String couplemcsuccess(HttpServletRequest request, Model m) {
		HttpSession session = request.getSession();
		String first = request.getParameter("user_firstid");
		String second = (String) session.getAttribute("sessionID");
		couplemcServiceInter.couplemcSuccess(first, second);
		m.addAttribute("matchingnum", 1);
		return "mypage/couplemc";
	}
}
