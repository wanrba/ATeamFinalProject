package fnp.kr.co.kosmo.mvc.dao.calendar;
import java.sql.SQLException;
import java.util.List;

import fnp.kr.co.kosmo.mvc.dto.CalendarDTO;
public interface CalendarDaoInter {
	
	/**
	 * 07-15 YoungJin
	 * �ű� �̺�Ʈ(������) ���
	 */
	public void insertCalendar(CalendarDTO cdto) throws SQLException;

	/**
	 * 07-15 YoungJin
	 * fullCalendar�� ����� ȸ���� �̺�Ʈ(������) ����Ʈ ��ȸ
	 */
	public List<CalendarDTO> getScheduleList(int user_cupleNum);

	/**
	 * 2021-07-15 YoungJin
	 * �̺�Ʈ(������) ���� �� �ش� �̺�Ʈ�� ���� ��ȸ
	 * @param cidx
	 * @return
	 */
	public CalendarDTO getDetailScheduleInfo(int cidx);
	

	/**
	 * calendar update
	 * @param cdto
	 * @throws SQLException
	 * 0717 �輺��
	 */
	public void updateCalendar(CalendarDTO cdto) throws SQLException;
	/**
	 * calendar delete
	 * @param idx
	 * @throws SQLException
	 * 0717 �輺��
	 */
	public void deleteCalendar(int idx) throws SQLException;
}