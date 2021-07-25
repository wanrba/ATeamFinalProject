package fnp.kr.co.kosmo.mvc.controller.exhibition;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fnp.kr.co.kosmo.mvc.service.exhibition.ExhibitionServiceInter;

@Controller
public class ExhibitionController {
	
	@Autowired
	private ExhibitionServiceInter exhibitionServiceInter;
	
	/**
	 * 07-23 YoungJin
	 * Ŀ�û��� Ŭ�� �� ������ �� �ִ� ����� ��ȯ
	 * �˻� ������ ������� ���ǿ� �°� �˻� �� ��ȯ
	 */
	@GetMapping(value = {"/exhibition.do"})
	public ModelAndView shoppingForm(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("exhibition/exhibitionList");
		
		mav.addObject("list", exhibitionServiceInter.getExhibitionList(request));
		return mav;
	}
	
	/**
	 * 07-24 Mingi �󼼺��� - �̴�� ���Ŷ�� �޼���ȭ �ʿ�
	 * @param request
	 * @return
	 */
	@RequestMapping(value= {"/temPurchase.do"})
	public ModelAndView temPurchase(HttpServletRequest request) {
		//�̴�� ����� �Ŷ�� ���� �޼���ȭ �ʿ�
		ModelAndView mav = new ModelAndView("exhibition/purchase");
		//int index = request.getAttribute("ex_index");
		mav.addObject("list", exhibitionServiceInter.getExhibitionList(request));
		return mav;
	}

}
