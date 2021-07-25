package fnp.kr.co.kosmo.mvc.dao.map;

import java.util.List;
import java.util.Map;

import fnp.kr.co.kosmo.mvc.dto.MapDTO;
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
	
	/**
	 * 0720 김미연
	 * 커플번호랑 맞는 맵번호
	 * @param couplenum
	 */
	public MapDTO coupleMapNum(int couplenum);
	
	/**
	 * gallery controller에서 marker의 mnum을 받아서 리스트 뿌려주기.
	 * @param member_num
	 * @return
	 */
	public List<MarkerDTO> markerPD(int member_num);
	

	/**
	 * marker테이블에서 좋아요 컬럼 0에서 1로 업데이트
	 * @param map
	 */
	public void upDateLike(Map<String, Integer> map);
	/**
	 * marker테이블에서 좋아요 컬럼  1을 0으로 업데이트
	 * @param map
	 */
	public void UpdatedownLike(Map<String, Integer> map);
}
