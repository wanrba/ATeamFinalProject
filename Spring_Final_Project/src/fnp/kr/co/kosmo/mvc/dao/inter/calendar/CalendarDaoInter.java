package fnp.kr.co.kosmo.mvc.dao.inter.calendar;

import java.util.List;
import java.sql.SQLException;

import fnp.kr.co.kosmo.mvc.dto.CalendarDTO;

public interface CalendarDaoInter {
	
	/**
	 * 사용자가 등록한 스케줄 상세정보를 DB에 입력
	 */
	public void insertCalendar(CalendarDTO cdto) throws SQLException;
	
	public List<CalendarDTO> getScheduleList(int user_cupleNum);
	
	/**
	 * calendar에 등록된 일정 클릭 시 상세보기 페이지로 이동해서 보여줄 정보를 가져옴
	 * @param cidx
	 * @return
	 */
	public CalendarDTO getDetailScheduleInfo(int cidx);

}
