package fnp.kr.co.kosmo.mvc.service.map;

import java.util.List;
import java.util.Map;

import fnp.kr.co.kosmo.mvc.dto.MapDTO;
import fnp.kr.co.kosmo.mvc.dto.MarkerDTO;

public interface MapServerInter {
	
	
	/**
	 * 기존에 표시되어있는 마커 출력
	 * @param map_num
	 * @return
	 */
	public List<MarkerDTO> MapForm(int map_num);

	/**
	 * 마커 생성시 작동
	 * @param dto
	 */
	public void markerMake(MarkerDTO dto);
	
	/**
	 * 마커 삭제
	 * @param marker_num
	 */
	public void delMarker(int marker_num);
	
	/**
	 * 0720 김미연
	 * 커플번호랑 맞는 맵번호
	 * @param couplenum
	 */
	public MapDTO coupleMapNum(int couplenum);
//------------------------------------------------
	/**
	 * marker리스트 gallery컨트롤러에서 travelgal jsp로 뿌려주기 
	 * 0724 김성경
	 * @param member_num
	 * @return
	 */
	public List<MarkerDTO> markerPD(int member_num);
	
	
	/**
	 * marker테이블의 좋아요 컬럼 1로 변경
	 * 0724 김성경
	 * @param map
	 */
	public void upDateLike(Map<String, Integer> map);
	/**
	 * marker테이블의 좋아요 컬럼 0으로 변경
	 * 0724 김성경
	 * @param map
	 */
	public void UpdatedownLike(Map<String,Integer> map);
}
