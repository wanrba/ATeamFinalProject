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
import fnp.kr.co.kosmo.mvc.service.member.MyPageServiceInter;

@Controller
public class MyPageController {

	@Autowired
	private MyPageServiceInter myPageServiceInter;

	/**
	 * 0717 �ϴ�
	 * mypage ��ư Ŭ�� => ���� ���� ���
	 * 
	 * @param session, dto
	 * @return mav
	 */
	@RequestMapping("/myPage.do")
	public ModelAndView mypageInfo(HttpSession session) {

		ModelAndView mav = new ModelAndView();
		mav.addObject("info", myPageServiceInter.getUserInfo((String) session.getAttribute("sessionID")));
		mav.setViewName("mypage/mypage");

		return mav;
	}

	/**
	 * 0717 �ϴ�
	 * mypage ������ ȸ������ ���� ��ư Ŭ�� => ���� ����
	 * ��������������
	 * @return 
	 */
	@RequestMapping(value = "/mypagepwdchk.do")
	public String myPageLoginChk() {
		return "mypage/mypagepwdchk";
	}

	/**
	 * 0717 �ϴ�
	 * ���������� => �������� => Ȯ�ι�ư �� ������ ������
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
			mav.addObject("emsg", "���� �����Դϴ�! �ٽ� �Է����ּ���!");
		} else {
			mav.addObject("info", myPageServiceInter.getUserInfo(vo.getUser_id()));
			mav.setViewName("mypage/mypageupdate");
		}
		return mav;
	}

	/**
	 * 0717 �ϴ� ���������� ������ => �����Ϸ� ��ư ��
	 * 
	 * @param dto, request
	 * @return mvo
	 */
	// ȸ������ ����
	@RequestMapping("/updateComplete.do")
	public ModelAndView updateComplete(MemberDTO mvo, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();

		myPageServiceInter.memUpdate(mvo);
		mav.setViewName("redirect:/index.do");
		return mav;
	}

	/**
	 * ȸ��Ż�� �� �̵� - 7/24 ��̿�
	 * @return
	 */
   @RequestMapping(value = { "/delChkForm.do" })
   public String delChkForm() {
      
      return "mypage/delChkForm";
   }

   /**
    * ȸ��Ż�� ���� - 7/24 ��̿�
    * @param session
    * @return
    */
   @RequestMapping(value = { "/delinfo.do" })
   public String delInfo(HttpSession session) {
      
      //���� Ŀ�ó� �޾Ƽ� ����
      int couple_num=(int) session.getAttribute("sessionCoupleNum");
      System.out.println("dd"+(Integer)couple_num);
      //Ŀ���� ���� �ƴѻ���(�� Ŀ������ ���� Ż���Ұ��)
      if(couple_num == 0) {
         myPageServiceInter.delInfo2((int) session.getAttribute("sessionNum"));
      
      //Ŀ���� Ż���� ���
      }else {
         myPageServiceInter.delInfo(couple_num);
      }
      
      
      //�ɾ���� ���� ����
      session.removeAttribute("sessionNum");
       session.removeAttribute("sessionName");
       session.removeAttribute("sessionID");
       session.removeAttribute("sessionCoupleNum");
      return "redirect:/index.do";
   }

}