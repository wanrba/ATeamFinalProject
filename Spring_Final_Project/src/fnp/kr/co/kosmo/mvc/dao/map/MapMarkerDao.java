package fnp.kr.co.kosmo.mvc.dao.map;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fnp.kr.co.kosmo.mvc.dto.MapDTO;
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
	
	/**
    * 7/20 김미연
    * @param couplenum
    */
   @Override
   public MapDTO coupleMapNum(int couplenum) {
      return ss.selectOne("map.coupleMapNum", couplenum);  //지도번호
      
   }
	
	/**
	 * gallery controller에서 travelGal로 리스트 뿌려주기 0724 김성경
	 */
	@Override
	public List<MarkerDTO> markerPD(int member_num) {
		return ss.selectList("map.markerPD", member_num);
	}

	/**
	 * marker테이블에 좋아요 1로 업데이트하기 0724 김성경
	 */
	@Override
	public void upDateLike(Map<String, Integer> map) {
		ss.update("map.upDateLike", map);
	}

	/**
	 * marker테이블에 조항요 1인 라이크컬럼 0으로 업데이트하기 0724
	 */
	@Override
	public void UpdatedownLike(Map<String, Integer> map) {
		ss.update("map.downUpdateLike", map);

	}

}
