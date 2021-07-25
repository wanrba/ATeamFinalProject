package fnp.kr.co.kosmo.mvc.service.exhibition;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import fnp.kr.co.kosmo.mvc.dto.ExhibitionDTO;

public interface ExhibitionServiceInter {
	
	public List<ExhibitionDTO> getExhibitionList(HttpServletRequest request);

}
