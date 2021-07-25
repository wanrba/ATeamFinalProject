package fnp.kr.co.kosmo.mvc.service.map;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fnp.kr.co.kosmo.mvc.dao.map.MarkerDaoInter;
import fnp.kr.co.kosmo.mvc.dto.MapDTO;
import fnp.kr.co.kosmo.mvc.dto.MarkerDTO;

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
	 * 0720 김미연
	 * 커플번호랑 맞는 맵번호
	 * @param couplenum
	 */
	   @Override
	   public MapDTO coupleMapNum(int couplenum) {
	      MapDTO mapdto=markerDaoInter.coupleMapNum(couplenum);
	      return mapdto;
	      
	   }
	
	/**
	 * marker리스트 받아서 travelgal 에 뿌려주기 
	 * 0724 김성경
	 */
		@Override
		public List<MarkerDTO> markerPD(int member_num) {
			return markerDaoInter.markerPD(member_num);
		}


	/**
	 * marker테이블의 좋아요 컬럼 1로 변경하기
	 * 0724 김성경
	 */
		@Override
		public void upDateLike(Map<String, Integer> map) {
			markerDaoInter.upDateLike(map);
			
		}
		/**
		 * marker테이블의 좋아요 컬럼 0으로 변경하기
		 * 0724 김성경
		 */
		@Override
		public void UpdatedownLike(Map<String, Integer> map) {
			markerDaoInter.UpdatedownLike(map);
			
		}
	
	
}
