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
public class MypageAction {
	
	// =====�ϴ� �۾�  START =========
	@Autowired
	private MyPageServiceInter myPageServiceInter;
	
	/**
	 * 0717 �ϴ� 
	 * mypage ��ư Ŭ�� => ���� ���� ���
	 * @param session, dto
	 * @return mav
	 */
	
	@RequestMapping("/myPage.do")
	public ModelAndView mypageInfo(HttpSession session) {
	System.out.println("mypageInfo ����!!");
	ModelAndView mav = new ModelAndView();
	String user_id = (String) session.getAttribute("sessionID");
	mav.addObject("info", myPageServiceInter.myInfo(user_id)); 
	mav.setViewName("mypage/mypage");
	
	
	return mav;
}
	
	/**
	 * 0717 �ϴ� 
	 * mypage ������ ȸ������ ���� ��ư Ŭ�� => ���� ����
	 * @return ��������������
	 */
	@RequestMapping(value="/mypagepwdchk.do")
	public String myPageLoginChk() {
		System.out.println("myPageLoginChk");
		return "mypage/mypagepwdchk";
	}
	
	/**
	 * 0717 �ϴ� 
	 * ���������� => �������� => Ȯ�ι�ư ��  ������ ������ 
	 * @return ��������������
	 */
	// ȸ������ ����-> ���� ������ ����
		@PostMapping("/mypageUpForm.do")
		public ModelAndView updateMemberForm(HttpSession session, HttpServletRequest request, 
				@RequestHeader("User-Agent") String userAgent, MemberDTO vo) {
			System.out.println("updateMemberForm ����!");
			// 
			MemberDTO map = myPageServiceInter.memchk(vo);
			ModelAndView mav = new ModelAndView();
			
			if (map == null) {
				mav.setViewName("member/mypage/mypagepwdchk");
				mav.addObject("emsg", "���� �����Դϴ�! �ٽ� �Է����ּ���!" );
			} else {
				mav.addObject("info", myPageServiceInter.myInfo(vo.getUser_id()));
				mav.setViewName("mypage/mypageupdate");
			}
			return mav;
		}
		
		/**
		 * 0717 �ϴ� 
		 * ���������� ������ => �����Ϸ� ��ư �� 
		 * @param dto, request 
		 * @return mvo 
		 */
		// ȸ������ ���� 
		@RequestMapping("/updateComplete.do")
		public ModelAndView updateComplete(MemberDTO mvo, HttpServletRequest request){
			ModelAndView mav = new ModelAndView();
			
			System.out.println(mvo.getUser_id());
			// ������Ʈ �޼��� ����
			myPageServiceInter.memUpdate(mvo);
			mav.setViewName("redirect:/index.do");
			return mav;
		}
	
	
	// =====�ϴ� �۾�  END =========


}
