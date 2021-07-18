package fnp.kr.co.kosmo.mvc.dao.map;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fnp.kr.co.kosmo.mvc.dao.map.inter.MarkerDaoInter;
import fnp.kr.co.kosmo.mvc.dto.MarkerDTO;

@Repository
public class MapMarkerDao implements MarkerDaoInter {
	@Autowired
	public SqlSessionTemplate ss;

	/**
	 * 
	 * @param dto
	 */
	@Override
	public void MapMarkerMake(MarkerDTO dto) {
		ss.insert("map.markermake", dto);
	}

	/**
	 * 
	 * @param dto
	 */
	@Override
	public List<MarkerDTO> MapForm(int map_num) {
		return ss.selectList("map.mapform", map_num);
	}

	/**
	 * 
	 * @param marker_num
	 */
	@Override
	public void delMarker(int marker_num) {
		ss.delete("map.delMarker", marker_num);

	}

}
