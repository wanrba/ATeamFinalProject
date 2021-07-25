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
	 * 0720 ��̿�
	 * Ŀ�ù�ȣ�� �´� �ʹ�ȣ
	 * @param couplenum
	 */
	public MapDTO coupleMapNum(int couplenum);
	
	/**
	 * gallery controller���� marker�� mnum�� �޾Ƽ� ����Ʈ �ѷ��ֱ�.
	 * @param member_num
	 * @return
	 */
	public List<MarkerDTO> markerPD(int member_num);
	

	/**
	 * marker���̺��� ���ƿ� �÷� 0���� 1�� ������Ʈ
	 * @param map
	 */
	public void upDateLike(Map<String, Integer> map);
	/**
	 * marker���̺��� ���ƿ� �÷�  1�� 0���� ������Ʈ
	 * @param map
	 */
	public void UpdatedownLike(Map<String, Integer> map);
}
