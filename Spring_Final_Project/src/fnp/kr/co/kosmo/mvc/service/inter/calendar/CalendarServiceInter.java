package fnp.kr.co.kosmo.mvc.service.inter.calendar;

import java.util.List;
import java.sql.SQLException;

import fnp.kr.co.kosmo.mvc.dto.CalendarDTO;

public interface CalendarServiceInter {
	
	/**
	 * ����ڰ� ����� ������ �������� DB�� �Է�
	 * @param cdto
	 * @return
	 * @throws SQLException 
	 */
	public void insertScheduleInfo(CalendarDTO cdto) throws SQLException;
	
	/**
	 * calendar�� ����ڰ� ����� ������ ����� ������
	 * @param session
	 * @return List<CalendarDTO>
	 */
	public List<CalendarDTO> getScheduleList(int user_cupleNum);
	
	/**
	 * calendar�� ��ϵ� ���� Ŭ�� �� �󼼺��� �������� �̵��ؼ� ������ ������ ������
	 * @param cidx
	 * @return
	 */
	public CalendarDTO getDetailScheduleInfo(int cidx);
	
}
