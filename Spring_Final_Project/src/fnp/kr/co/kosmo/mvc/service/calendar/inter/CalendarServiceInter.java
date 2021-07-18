package fnp.kr.co.kosmo.mvc.service.calendar.inter;

import java.sql.SQLException;
import java.util.List;

import fnp.kr.co.kosmo.mvc.dto.CalendarDTO;

public interface CalendarServiceInter {

	/**
	 * 07-15 YoungJin
	 * �̺�Ʈ(������) �ű� ���
	 * @param cdto
	 * @throws SQLException
	 */
	public void insertScheduleInfo(CalendarDTO cdto) throws SQLException;

	/**
	 * 07-15 YoungJin
	 * ȸ���� �̺�Ʈ(������) ��� ��ȸ
	 * @param user_cupleNum
	 * @return
	 */
	public List<CalendarDTO> getScheduleList(int user_cupleNum);

	/**
	 * 07-15 YoungJin
	 * �̺�Ʈ(������) ���� �� ������ �̺�Ʈ�� ���� ��ȸ
	 * @param cidx
	 * @return
	 */
	public CalendarDTO getDetailScheduleInfo(int cidx);

}