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
	 * Ŀ�û����� ��ϸ���Ʈ ��ȯ
	 * �˻� ������ ������� ���ǿ� �°� �˻� �� ��ȯ
	 */
	@Override
	public List<ExhibitionDTO> getExhibitionList(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
		Map<String, String> searchMap = new HashMap<String, String>();
		
		// �˻� �� �Ѱ��� parameter ����
		String ex_startday = request.getParameter("ex_startday");
		String ex_endday = request.getParameter("ex_endday");
		String searchKeywordType = request.getParameter("searchKeywordType");
		//String searchKeyword = URLDecoder.decode(request.getParameter("searchKeyword"));
		String newList = request.getParameter("note1");
		
		// �˻��Ⱓ�� �ִ°��
		if(ex_startday != "" || ex_startday != null) { searchMap.put("ex_startday", ex_startday); }
		if(ex_endday != "" || ex_endday != null) { searchMap.put("ex_endday", ex_endday); }
		
		// �˻� Ÿ�� �� �˻� ��
		searchMap.put("searchKeywordType", searchKeywordType);
		//searchMap.put("searchKeyword", searchKeyword);
		searchMap.put("newList", newList);
		
		return exhibitionDaoInter.getExhibitionList(searchMap);
	}

}
