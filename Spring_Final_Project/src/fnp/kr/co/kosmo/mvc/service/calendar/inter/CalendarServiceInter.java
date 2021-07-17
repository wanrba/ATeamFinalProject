package fnp.kr.co.kosmo.mvc.service.calendar.inter;

import java.sql.SQLException;
import java.util.List;

import fnp.kr.co.kosmo.mvc.dto.CalendarDTO;

public interface CalendarServiceInter {

	/**
	 * ����ڰ� ����� ������ �������� DB�� �Է�
	 * 
	 * @param cdto
	 * @return
	 * @throws SQLException
	 */
	public void insertScheduleInfo(CalendarDTO cdto) throws SQLException;

	/**
	 * 2021-07-15 YoungJin
	 * calendar�� ����ڰ� ����� ������ ����� ������
	 * 
	 * @param session
	 * @return List<CalendarDTO>
	 */
	public List<CalendarDTO> getScheduleList(int user_cupleNum);

	/**
	 * 2021-07-15 YoungJin
	 * calendar�� ��ϵ� ���� Ŭ�� �� �󼼺��� �������� �̵��ؼ� ������ ������ ������
	 * 
	 * @param cidx
	 * @return
	 */
	public CalendarDTO getDetailScheduleInfo(int cidx);

}