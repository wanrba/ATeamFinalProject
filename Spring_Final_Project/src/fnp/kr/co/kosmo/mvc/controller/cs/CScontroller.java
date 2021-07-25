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
   
   //1:1 ���� ������ �̵�
   @RequestMapping(value= {"/askForm.do"})
   public ModelAndView askForm(HttpSession session) {
      ModelAndView mav= new ModelAndView();
      mav.setViewName("customerService/askForm");
      
      //�α��� �������
      if(session.getAttribute("sessionID") != null) {
         mav.addObject("sessionID",session.getAttribute("sessionID"));
         
      //�α��ξ��ϰ� ���ǳ�����°��
      }else {
         mav.addObject("msg", "1:1���Ǵ�  �α��� �� �̿����ּ��� ^__^");
      }
      return mav;
   }
   
   //���� ����
   @PostMapping(value= {"/askSend.do"})
   public String sendAsk(CustomerServiceDTO csdto) {
      csServiceInter.sendAsk(csdto);
      return "redirect:index.do";
   }
   //FAQ ������ �̵�
   @RequestMapping(value= {"/faqForm.do"})
   public String faqForm() {
      return "customerService/faq2";
   }

}