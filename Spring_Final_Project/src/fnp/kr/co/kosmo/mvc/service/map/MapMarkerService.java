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
	
	@Override
	public void markerMake(MarkerDTO dto) {
		markerDaoInter.MapMarkerMake(dto);
	}

	@Override
	public List<MarkerDTO> MapForm(int map_num) {
		
		return markerDaoInter.MapForm(map_num);
	}

	@Override
	public void delMarker(int marker_num) {
		markerDaoInter.delMarker(marker_num);
	}

	
	
}
