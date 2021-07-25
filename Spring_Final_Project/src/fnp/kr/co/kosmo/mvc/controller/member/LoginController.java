package fnp.kr.co.kosmo.mvc.controller.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;
import fnp.kr.co.kosmo.mvc.service.member.LoginServiceInter;

@Controller
public class LoginController {

   @Autowired
   public LoginServiceInter loginServiceInter;

   /**
    * �α��������� �̵� �̰�
    * 
    * @return
    */
   @GetMapping(value = { "/loginForm.do" })
   public String LoginsignupForm() {
      return "member/login";
   }

   /**
    * 0720 ������ ���Ǽ���
    */
   /**
    * 0712�α��� �۵� �̰�
    * 
    * @param session, dto
    * @return mav
    */
   @PostMapping("/login.do")
   public ModelAndView loginAction(HttpSession session, MemberDTO dto) {
      MemberDTO map = loginServiceInter.login(dto);
      ModelAndView mav = new ModelAndView();
      if (map == null) {
         mav.setViewName("member/login");
         mav.addObject("emsg", "�ùٸ� ȸ�������� �ƴմϴ�.");
      } else {
         session.setAttribute("sessionNum", map.getUser_num());
         session.setAttribute("sessionID", map.getUser_id());
         session.setAttribute("sessionName", map.getUser_name());
         session.setAttribute("sessionCoupleNum", map.getUser_couplenum());
         session.setAttribute("sessionMatch", map.getUser_match());
         mav.addObject("chk", "��������");
         mav.setViewName("index/index");
      }
      return mav;
   }

   // logout
   @GetMapping("/logout.do")
   public String logoutAction(HttpSession session) {
      session.removeAttribute("sessionNum");
      session.removeAttribute("sessionName");
      session.removeAttribute("sessionID");
      session.removeAttribute("sessionCoupleNum");
      return "redirect:/index.do";
   }
}
