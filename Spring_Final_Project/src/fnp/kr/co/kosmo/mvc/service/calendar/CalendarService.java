package fnp.kr.co.kosmo.mvc.service.calendar;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fnp.kr.co.kosmo.mvc.dao.inter.calendar.CalendarDaoInter;
import fnp.kr.co.kosmo.mvc.dto.CalendarDTO;
import fnp.kr.co.kosmo.mvc.service.inter.calendar.CalendarServiceInter;

@Service
public class CalendarService implements CalendarServiceInter{
	
	@Autowired
	private CalendarDaoInter calendarDaoInter;
	
//	public List<CalendarDTO> insertCalendar(CalendarDTO cdto) {
//		
//		return calendarDao.insertCalendar(cdto);
//	}

	/**
	 * 사용자가 등록한 스케줄 상세정보를 DB에 입력
	 * 사용자가 입력한 값을 처리 및 로직 처리
	 */
	@Override
	public void insertScheduleInfo(CalendarDTO cdto) throws SQLException {
		// TODO Auto-generated method stub
		
		// 중요도에 따른 색상처리
		switch(cdto.getcColor()) {
			case "high" :
				cdto.setcColor("red");
				break;
			case "middle" :
				cdto.setcColor("yellow");
				break;
			case "low" :
				cdto.setcColor("pink");
				break;
		}
		
		calendarDaoInter.insertCalendar(cdto);
//		return calendarDaoInter.insertCalendar(cdto) > 0 ? true : false;
	}

	@Override
	public List<CalendarDTO> getScheduleList(int user_cupleNum) {
		// TODO Auto-generated method stub
		return calendarDaoInter.getScheduleList(user_cupleNum);
	}

}
