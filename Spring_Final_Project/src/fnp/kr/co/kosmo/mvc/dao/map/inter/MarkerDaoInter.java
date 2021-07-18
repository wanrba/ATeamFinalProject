package fnp.kr.co.kosmo.mvc.dao.map.inter;

import java.util.List;

import fnp.kr.co.kosmo.mvc.dto.MarkerDTO;

public interface MarkerDaoInter {
	
	/**
	 * 
	 * @param map_num
	 * @return
	 */
	public List<MarkerDTO> MapForm(int map_num);

	/**
	 * 
	 * @param dto
	 */
	public void MapMarkerMake(MarkerDTO dto);
	
	/**
	 * 
	 * @param marker_num
	 */
	public void delMarker(int marker_num);
}
