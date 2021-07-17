package fnp.kr.co.kosmo.mvc.dao.calendar.inter;
import java.util.List;
import java.sql.SQLException;
import fnp.kr.co.kosmo.mvc.dto.CalendarDTO;
public interface CalendarDaoInter {
	
	/**
	 * ����ڰ� ����� ������ �������� DB�� �Է�
	 */
	public void insertCalendar(CalendarDTO cdto) throws SQLException;

	public List<CalendarDTO> getScheduleList(int user_cupleNum);

	/**
	 * calendar�� ��ϵ� ���� Ŭ�� �� �󼼺��� �������� �̵��ؼ� ������ ������ ������
	 * @param cidx
	 * @return
	 */
	public CalendarDTO getDetailScheduleInfo(int cidx);

}