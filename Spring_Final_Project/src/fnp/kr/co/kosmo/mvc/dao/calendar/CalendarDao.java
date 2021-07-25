package fnp.kr.co.kosmo.mvc.dao.calendar;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fnp.kr.co.kosmo.mvc.dto.CalendarDTO;

@Repository
public class CalendarDao implements CalendarDaoInter {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	/**
	 * 07-15 YoungJin
	 * 신규 이벤트(스케줄) 등록
	 */
	public void insertCalendar(CalendarDTO cdto) {
		cdto.setUser_couplenum(1);
		System.out.println(cdto.getcColor());
		System.out.println(cdto.getcContent());
		System.out.println(cdto.getcEndDay());
		System.out.println(cdto.getCidx());
		System.out.println(cdto.getcImportance());
		System.out.println(cdto.getcLocal());
		System.out.println(cdto.getcStartDay());
		System.out.println(cdto.getcTitle());
		System.out.println(cdto.getUser_couplenum());
		sqlSessionTemplate.insert("calendar.insertCalendar", cdto);
	}

	/**
	 * 07-15 YoungJin
	 * fullCalendar에 출력할 회원별 이벤트(스케줄) 리스트 조회
	 */
	@Override
	public List<CalendarDTO> getScheduleList(int user_cupleNum) {
		// TODO Auto-generated method stub

		return sqlSessionTemplate.selectList("calendar.getCalendarList", user_cupleNum);
	}

	/**
	 * 2021-07-15 YoungJin
	 * 이벤트(스케줄) 수정 시 해당 이벤트의 내용 조회
	 * @param cidx
	 * @return
	 */
	@Override
	public CalendarDTO getDetailScheduleInfo(int cidx) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne("calendar.getCalendarDetailInfo", cidx);
	}
	/**
	 * 
	 * @param cdto
	 * calendar update cdto 를 받아서 (insert 할 때와 같은 form)
	 * 0716 김성경
	 */
	@Override
	public void updateCalendar(CalendarDTO cdto) {
		sqlSessionTemplate.update("calendar.updateCalendar",cdto);
	}
	
	/**
	 * 
	 * @param idx
	 * idx 를 받아서 delete idx = index 번호
	 */
	@Override
	public void deleteCalendar(int idx) {
		sqlSessionTemplate.delete("calendar.deleteCalendar",idx);
	}

}