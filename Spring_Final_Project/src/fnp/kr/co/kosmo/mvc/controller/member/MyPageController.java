package fnp.kr.co.kosmo.mvc.controller.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;
import fnp.kr.co.kosmo.mvc.service.member.inter.MyPageServiceInter;

@Controller
public class MyPageController {

	@Autowired
	private MyPageServiceInter myPageServiceInter;

	/**
	 * 0717 하늘
	 * mypage 버튼 클릭 => 나의 정보 출력
	 * 
	 * @param session, dto
	 * @return mav
	 */

	@RequestMapping("/myPage.do")
	public ModelAndView mypageInfo(HttpSession session) {

		ModelAndView mav = new ModelAndView();
		mav.addObject("info", myPageServiceInter.myInfo((String) session.getAttribute("sessionID")));
		mav.setViewName("mypage/mypage");

		return mav;
	}

	/**
	 * 0717 하늘
	 * mypage 내에서 회원정보 수정 버튼 클릭 => 본인 인증
	 * 본인인증폼으로
	 * @return 
	 */
	@RequestMapping(value = "/mypagepwdchk.do")
	public String myPageLoginChk() {
		return "mypage/mypagepwdchk";
	}

	/**
	 * 0717 하늘
	 * 마이페이지 => 본인인증 => 확인버튼 시 본인이 맞으면
	 * @param session
	 * @param request
	 * @param userAgent
	 * @param vo
	 * @return
	 */
	@PostMapping("/mypageUpForm.do")
	public ModelAndView updateMemberForm(HttpSession session, HttpServletRequest request,
			@RequestHeader("User-Agent") String userAgent, MemberDTO vo) {

		MemberDTO map = myPageServiceInter.memchk(vo);
		ModelAndView mav = new ModelAndView();

		if (map == null) {
			mav.setViewName("member/mypage/mypagepwdchk");
			mav.addObject("emsg", "인증 실패입니다! 다시 입력해주세요!");
		} else {
			mav.addObject("info", myPageServiceInter.myInfo(vo.getUser_id()));
			mav.setViewName("mypage/mypageupdate");
		}
		return mav;
	}

	/**
	 * 0717 하늘 마이페이지 수정폼 => 수정완료 버튼 시
	 * 
	 * @param dto, request
	 * @return mvo
	 */
	// 회원정보 수정
	@RequestMapping("/updateComplete.do")
	public ModelAndView updateComplete(MemberDTO mvo, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();

		myPageServiceInter.memUpdate(mvo);
		mav.setViewName("redirect:/index.do");
		return mav;
	}

}