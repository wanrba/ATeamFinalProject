package fnp.kr.co.kosmo.mvc.controller.index;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fnp.kr.co.kosmo.mvc.service.member.MyPageServiceInter;

@Controller
public class IndexController {

	@Autowired
	private MyPageServiceInter myPageServiceInter;

	/**
	 * 07-11 YoungJin
	 * 메인화면으로 이동
	 * @param m
	 * @return
	 */
	@RequestMapping(value = { "/index.do" })
	public String indexTest(HttpSession session, Model m) {
		
		// 07-20 YoungJin
		// IndexPage에서 연애한지 몇일이 지났는지 및 언제 시작했는지 정보를 얻어오기 위한 정보 추가
		m.addAttribute("mdto", myPageServiceInter.getUserInfo("1"));
		
		return "index/index";
	}

}
