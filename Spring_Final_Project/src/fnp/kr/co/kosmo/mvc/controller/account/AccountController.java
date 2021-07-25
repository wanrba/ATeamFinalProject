package fnp.kr.co.kosmo.mvc.controller.account;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fnp.kr.co.kosmo.mvc.dto.AccountDTO;
import fnp.kr.co.kosmo.mvc.dto.PageDTO;
import fnp.kr.co.kosmo.mvc.service.account.AccountServiceInter;

@Controller
public class AccountController {
   
   @Autowired
   private AccountServiceInter accountServiceInter;
   
   /**
    * 7/25 - ���尳�� �� �̵� 
    * @param acdto
    * @param session
    * @param response
    * @return
    */
   @RequestMapping(value= {"accountForm.do"})
   public ModelAndView makeAccountForm(AccountDTO acdto,HttpSession session, HttpServletResponse response) {
         ModelAndView mav= new ModelAndView();
         
         mav.setViewName("account/makeAccount");
         
         if((Integer) session.getAttribute("sessionCoupleNum") != null) {
        	 //Ŀ�ù�ȣ ���� ����
            mav.addObject("couple_num", (int) session.getAttribute("sessionCoupleNum"));
         } else {
            mav.addObject("msg", "Ŀ������ ������ �α��� �� �̿����ּ��� ^__^");
         }
            
      return mav;
   }
   
   
   /**
    * 7/22- ��̿� Ŀ������ ����
    * @param acdto
    * @return
    */
   @PostMapping(value= {"makeaccount.do"})
   public String makeAccount(AccountDTO acdto) {
      
      accountServiceInter.makeAccount(acdto);
      return "index/index";
   }
   
   /**
	 * // 0724 ������ �ŷ���� ����Ʈ,����¡ó��
	 */
	@RequestMapping(value = { "/dashboard.do" })
	public String calendarDetailForm(HttpSession session, Model m,String nowPage, String cntPerPage) {
		int coupleNum = (int) session.getAttribute("sessionCoupleNum");
	
		
		// ����¡
		int spage = 1;
		if (nowPage != null && !nowPage.equals("")) {
		spage = Integer.parseInt(nowPage);
		}
		if (cntPerPage == null) {
		cntPerPage = "5";// ���� ��
		}
		int total = accountServiceInter.getTotalCount(coupleNum);
		PageDTO dto = new PageDTO(total, spage, 
		 Integer.parseInt(cntPerPage));
		m.addAttribute("paging", dto);

		// ����Ʈ
		List<Map<String, String>> list = accountServiceInter.getAccountInfo(coupleNum,dto);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		m.addAttribute("list", list);
		
		return "account/accountForm";
	}


}