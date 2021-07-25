package fnp.kr.co.kosmo.mvc.service.map;

import java.util.List;
import java.util.Map;

import fnp.kr.co.kosmo.mvc.dto.MapDTO;
import fnp.kr.co.kosmo.mvc.dto.MarkerDTO;

public interface MapServerInter {
	
	
	/**
	 * ������ ǥ�õǾ��ִ� ��Ŀ ���
	 * @param map_num
	 * @return
	 */
	public List<MarkerDTO> MapForm(int map_num);

	/**
	 * ��Ŀ ������ �۵�
	 * @param dto
	 */
	public void markerMake(MarkerDTO dto);
	
	/**
	 * ��Ŀ ����
	 * @param marker_num
	 */
	public void delMarker(int marker_num);
	
	/**
	 * 0720 ��̿�
	 * Ŀ�ù�ȣ�� �´� �ʹ�ȣ
	 * @param couplenum
	 */
	public MapDTO coupleMapNum(int couplenum);
//------------------------------------------------
	/**
	 * marker����Ʈ gallery��Ʈ�ѷ����� travelgal jsp�� �ѷ��ֱ� 
	 * 0724 �輺��
	 * @param member_num
	 * @return
	 */
	public List<MarkerDTO> markerPD(int member_num);
	
	
	/**
	 * marker���̺��� ���ƿ� �÷� 1�� ����
	 * 0724 �輺��
	 * @param map
	 */
	public void upDateLike(Map<String, Integer> map);
	/**
	 * marker���̺��� ���ƿ� �÷� 0���� ����
	 * 0724 �輺��
	 * @param map
	 */
	public void UpdatedownLike(Map<String,Integer> map);
}
