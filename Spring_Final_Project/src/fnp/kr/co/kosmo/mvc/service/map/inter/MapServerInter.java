package fnp.kr.co.kosmo.mvc.service.map.inter;

import java.util.List;

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
	 * 커플번호랑 맞는 맵번호
	 * @param couplenum
	 */
	public int coupleMapNum(int couplenum);
}
