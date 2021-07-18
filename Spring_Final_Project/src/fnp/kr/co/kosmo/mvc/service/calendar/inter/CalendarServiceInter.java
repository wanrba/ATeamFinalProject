package fnp.kr.co.kosmo.mvc.service.calendar.inter;

import java.sql.SQLException;
import java.util.List;

import fnp.kr.co.kosmo.mvc.dto.CalendarDTO;

public interface CalendarServiceInter {

	/**
	 * 07-15 YoungJin
	 * 이벤트(스케줄) 신규 등록
	 * @param cdto
	 * @throws SQLException
	 */
	public void insertScheduleInfo(CalendarDTO cdto) throws SQLException;

	/**
	 * 07-15 YoungJin
	 * 회원별 이벤트(스케줄) 목록 조회
	 * @param user_cupleNum
	 * @return
	 */
	public List<CalendarDTO> getScheduleList(int user_cupleNum);

	/**
	 * 07-15 YoungJin
	 * 이벤트(스케줄) 수정 시 수정할 이벤트의 정보 조회
	 * @param cidx
	 * @return
	 */
	public CalendarDTO getDetailScheduleInfo(int cidx);

}