package fnp.kr.co.kosmo.mvc.service.map.inter;

import java.util.List;

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
	 * Ŀ�ù�ȣ�� �´� �ʹ�ȣ
	 * @param couplenum
	 */
	public int coupleMapNum(int couplenum);
}
