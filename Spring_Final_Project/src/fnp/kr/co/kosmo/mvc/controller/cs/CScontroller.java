package fnp.kr.co.kosmo.mvc.controller.cs;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fnp.kr.co.kosmo.mvc.dto.CustomerServiceDTO;
import fnp.kr.co.kosmo.mvc.service.cs.CsServiceInter;
@Controller
public class CScontroller {
   
   @Autowired
   private CsServiceInter csServiceInter;
   
   //1:1 문의 폼으로 이동
   @RequestMapping(value= {"/askForm.do"})
   public ModelAndView askForm(HttpSession session) {
      ModelAndView mav= new ModelAndView();
      mav.setViewName("customerService/askForm");
      
      //로그인 했을경우
      if(session.getAttribute("sessionID") != null) {
         mav.addObject("sessionID",session.getAttribute("sessionID"));
         
      //로그인안하고 문의남기려는경우
      }else {
         mav.addObject("msg", "1:1문의는  로그인 후 이용해주세요 ^__^");
      }
      return mav;
   }
   
   //문의 전송
   @PostMapping(value= {"/askSend.do"})
   public String sendAsk(CustomerServiceDTO csdto) {
      csServiceInter.sendAsk(csdto);
      return "redirect:index.do";
   }
   //FAQ 페이지 이동
   @RequestMapping(value= {"/faqForm.do"})
   public String faqForm() {
      return "customerService/faq2";
   }

}