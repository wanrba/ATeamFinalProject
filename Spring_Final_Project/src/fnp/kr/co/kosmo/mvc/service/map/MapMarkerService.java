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
	 * ��Ŀ ������ �۵�
	 * @param dto
	 */
	@Override
	public void markerMake(MarkerDTO dto) {
		markerDaoInter.MapMarkerMake(dto);
	}

	/**
	 * ������ ǥ�õǾ��ִ� ��Ŀ ���
	 * @param map_num
	 * @return
	 */
	@Override
	public List<MarkerDTO> MapForm(int map_num) {
		
		return markerDaoInter.MapForm(map_num);
	}

	/**
	 * ��Ŀ ����
	 * @param marker_num
	 */
	@Override
	public void delMarker(int marker_num) {
		markerDaoInter.delMarker(marker_num);
	}

	/**
	 * 0720 ��̿�
	 * Ŀ�ù�ȣ�� �´� �ʹ�ȣ
	 * @param couplenum
	 */
	   @Override
	   public MapDTO coupleMapNum(int couplenum) {
	      MapDTO mapdto=markerDaoInter.coupleMapNum(couplenum);
	      return mapdto;
	      
	   }
	
	/**
	 * marker����Ʈ �޾Ƽ� travelgal �� �ѷ��ֱ� 
	 * 0724 �輺��
	 */
		@Override
		public List<MarkerDTO> markerPD(int member_num) {
			return markerDaoInter.markerPD(member_num);
		}


	/**
	 * marker���̺��� ���ƿ� �÷� 1�� �����ϱ�
	 * 0724 �輺��
	 */
		@Override
		public void upDateLike(Map<String, Integer> map) {
			markerDaoInter.upDateLike(map);
			
		}
		/**
		 * marker���̺��� ���ƿ� �÷� 0���� �����ϱ�
		 * 0724 �輺��
		 */
		@Override
		public void UpdatedownLike(Map<String, Integer> map) {
			markerDaoInter.UpdatedownLike(map);
			
		}
	
	
}
