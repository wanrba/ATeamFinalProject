package fnp.kr.co.kosmo.mvc.dao.calendar;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import fnp.kr.co.kosmo.mvc.dao.inter.calendar.CalendarDaoInter;
import fnp.kr.co.kosmo.mvc.dto.CalendarDTO;

@Repository
public class CalendarDao implements CalendarDaoInter {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	/**
	 * 사용자가 등록한 스케줄 상세정보를 DB에 입력
	 */
	public void insertCalendar(CalendarDTO cdto) {
		cdto.setUser_cuplenum(1);
		sqlSessionTemplate.insert("calendar.insertCalendar", cdto);
//		return sqlSessionTemplate.insert("calendar.insertCalendar", cdto);
	}

	@Override
	public List<CalendarDTO> getScheduleList(int user_cupleNum) {
		// TODO Auto-generated method stub

		return sqlSessionTemplate.selectList("calendar.getCalendarList", user_cupleNum);
	}

	/**
	 * 2021-07-15 YoungJin
	 * calendar에 등록된 일정 클릭 시 상세보기 페이지로 이동해서 보여줄 정보를 가져옴
	 * 
	 * @param cidx
	 * @return
	 */
	@Override
	public CalendarDTO getDetailScheduleInfo(int cidx) {
		// TODO Auto-generated method stub
		System.out.println("dao's cidx ::: " + cidx);
		return sqlSessionTemplate.selectOne("calendar.getCalendarDetailInfo", cidx);
	}

}