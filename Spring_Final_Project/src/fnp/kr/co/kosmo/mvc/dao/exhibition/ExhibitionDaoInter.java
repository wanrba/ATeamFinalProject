package fnp.kr.co.kosmo.mvc.dao.exhibition;

import java.util.List;
import java.util.Map;

import fnp.kr.co.kosmo.mvc.dto.ExhibitionDTO;

public interface ExhibitionDaoInter {
	
	public List<ExhibitionDTO> getExhibitionList(Map<String, String> searchMap);

}
