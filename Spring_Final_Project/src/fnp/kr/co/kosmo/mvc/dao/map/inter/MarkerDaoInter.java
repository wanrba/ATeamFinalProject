package fnp.kr.co.kosmo.mvc.dao.map.inter;

import java.util.List;

import fnp.kr.co.kosmo.mvc.dto.MarkerDTO;

public interface MarkerDaoInter {
	
	public List<MarkerDTO> MapForm(int map_num);

	public void MapMarkerMake(MarkerDTO dto);
	
	public void delMarker(int marker_num);
}
