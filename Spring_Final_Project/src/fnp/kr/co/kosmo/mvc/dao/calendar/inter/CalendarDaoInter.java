package fnp.kr.co.kosmo.mvc.dao.calendar.inter;
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

}