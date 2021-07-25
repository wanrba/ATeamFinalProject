package fnp.kr.co.kosmo.mvc.service.exhibition;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fnp.kr.co.kosmo.mvc.dao.exhibition.ExhibitionDaoInter;
import fnp.kr.co.kosmo.mvc.dto.ExhibitionDTO;

@Service
public class ExhibitionService implements ExhibitionServiceInter{

	@Autowired
	private ExhibitionDaoInter exhibitionDaoInter;
	
	/**
	 * 07-23 YoungJin
	 * 커플상점의 목록리스트 반환
	 * 검색 조건이 있을경우 조건에 맞게 검색 후 반환
	 */
	@Override
	public List<ExhibitionDTO> getExhibitionList(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
		Map<String, String> searchMap = new HashMap<String, String>();
		
		// 검색 시 넘겨준 parameter 정리
		String ex_startday = request.getParameter("ex_startday");
		String ex_endday = request.getParameter("ex_endday");
		String searchKeywordType = request.getParameter("searchKeywordType");
		//String searchKeyword = URLDecoder.decode(request.getParameter("searchKeyword"));
		String newList = request.getParameter("note1");
		
		// 검색기간이 있는경우
		if(ex_startday != "" || ex_startday != null) { searchMap.put("ex_startday", ex_startday); }
		if(ex_endday != "" || ex_endday != null) { searchMap.put("ex_endday", ex_endday); }
		
		// 검색 타입 및 검색 값
		searchMap.put("searchKeywordType", searchKeywordType);
		//searchMap.put("searchKeyword", searchKeyword);
		searchMap.put("newList", newList);
		
		return exhibitionDaoInter.getExhibitionList(searchMap);
	}

}
