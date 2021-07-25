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
	 * 커플상점 클릭 시 구매할 수 있는 목록을 반환
	 * 검색 조건이 있을경우 조건에 맞게 검색 후 반환
	 */
	@GetMapping(value = {"/exhibition.do"})
	public ModelAndView shoppingForm(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("exhibition/exhibitionList");
		
		mav.addObject("list", exhibitionServiceInter.getExhibitionList(request));
		return mav;
	}
	
	/**
	 * 07-24 Mingi 상세보기 - 이대로 갈거라면 메서드화 필요
	 * @param request
	 * @return
	 */
	@RequestMapping(value= {"/temPurchase.do"})
	public ModelAndView temPurchase(HttpServletRequest request) {
		//이대로 사용할 거라면 별도 메서드화 필요
		ModelAndView mav = new ModelAndView("exhibition/purchase");
		//int index = request.getAttribute("ex_index");
		mav.addObject("list", exhibitionServiceInter.getExhibitionList(request));
		return mav;
	}

}
