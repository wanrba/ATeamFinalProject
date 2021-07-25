package fnp.kr.co.kosmo.mvc.dao.calendar;
import java.sql.SQLException;
import java.util.List;

import fnp.kr.co.kosmo.mvc.dto.CalendarDTO;
public interface CalendarDaoInter {
	
	/**
	 * 07-15 YoungJin
	 * 신규 이벤트(스케줄) 등록
	 */
	public void insertCalendar(CalendarDTO cdto) throws SQLException;

	/**
	 * 07-15 YoungJin
	 * fullCalendar에 출력할 회원별 이벤트(스케줄) 리스트 조회
	 */
	public List<CalendarDTO> getScheduleList(int user_cupleNum);

	/**
	 * 2021-07-15 YoungJin
	 * 이벤트(스케줄) 수정 시 해당 이벤트의 내용 조회
	 * @param cidx
	 * @return
	 */
	public CalendarDTO getDetailScheduleInfo(int cidx);
	

	/**
	 * calendar update
	 * @param cdto
	 * @throws SQLException
	 * 0717 김성경
	 */
	public void updateCalendar(CalendarDTO cdto) throws SQLException;
	/**
	 * calendar delete
	 * @param idx
	 * @throws SQLException
	 * 0717 김성경
	 */
	public void deleteCalendar(int idx) throws SQLException;
}