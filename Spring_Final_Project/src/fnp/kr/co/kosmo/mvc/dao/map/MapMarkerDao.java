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
    * 7/20 ��̿�
    * @param couplenum
    */
   @Override
   public MapDTO coupleMapNum(int couplenum) {
      return ss.selectOne("map.coupleMapNum", couplenum);  //������ȣ
      
   }
	
	/**
	 * gallery controller���� travelGal�� ����Ʈ �ѷ��ֱ� 0724 �輺��
	 */
	@Override
	public List<MarkerDTO> markerPD(int member_num) {
		return ss.selectList("map.markerPD", member_num);
	}

	/**
	 * marker���̺� ���ƿ� 1�� ������Ʈ�ϱ� 0724 �輺��
	 */
	@Override
	public void upDateLike(Map<String, Integer> map) {
		ss.update("map.upDateLike", map);
	}

	/**
	 * marker���̺� ���׿� 1�� ����ũ�÷� 0���� ������Ʈ�ϱ� 0724
	 */
	@Override
	public void UpdatedownLike(Map<String, Integer> map) {
		ss.update("map.downUpdateLike", map);

	}

}
