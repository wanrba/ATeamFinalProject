package fnp.kr.co.kosmo.mvc.service.map;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fnp.kr.co.kosmo.mvc.dao.map.inter.MarkerDaoInter;
import fnp.kr.co.kosmo.mvc.dto.MarkerDTO;
import fnp.kr.co.kosmo.mvc.service.map.inter.MapServerInter;
@Service
public class MapMarkerService implements MapServerInter{
	@Autowired
	public MarkerDaoInter markerDaoInter;
	
	/**
	 * 마커 생성시 작동
	 * @param dto
	 */
	@Override
	public void markerMake(MarkerDTO dto) {
		markerDaoInter.MapMarkerMake(dto);
	}

	/**
	 * 기존에 표시되어있는 마커 출력
	 * @param map_num
	 * @return
	 */
	@Override
	public List<MarkerDTO> MapForm(int map_num) {
		
		return markerDaoInter.MapForm(map_num);
	}

	/**
	 * 마커 삭제
	 * @param marker_num
	 */
	@Override
	public void delMarker(int marker_num) {
		markerDaoInter.delMarker(marker_num);
	}

	/**
	 * 커플번호랑 맞는 맵번호
	 * @param couplenum
	 */
	@Override
	public int coupleMapNum(int couplenum) {
		int mapnum=markerDaoInter.coupleMapNum(couplenum);
		return mapnum;
		
	}

	
	
}
