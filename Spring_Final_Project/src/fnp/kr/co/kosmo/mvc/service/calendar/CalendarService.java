package fnp.kr.co.kosmo.mvc.service.calendar;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fnp.kr.co.kosmo.mvc.dao.calendar.inter.CalendarDaoInter;
import fnp.kr.co.kosmo.mvc.dto.CalendarDTO;
import fnp.kr.co.kosmo.mvc.service.calendar.inter.CalendarServiceInter;

@Service
public class CalendarService implements CalendarServiceInter {

	@Autowired
	private CalendarDaoInter calendarDaoInter;

	/**
	 * 07-15 YoungJin
	 * �̺�Ʈ(������) �ű� ���
	 * @param cdto
	 * @throws SQLException
	 */
	@Override
	public void insertScheduleInfo(CalendarDTO cdto) throws SQLException {
		// TODO Auto-generated method stub

		switch (cdto.getcColor()) {
		case "high":
			cdto.setcColor("red");
			break;
		case "middle":
			cdto.setcColor("yellow");
			break;
		case "low":
			cdto.setcColor("pink");
			break;
		}

		calendarDaoInter.insertCalendar(cdto);
	}

	/**
	 * 07-15 YoungJin
	 * ȸ���� �̺�Ʈ(������) ��� ��ȸ
	 * @param user_cupleNum
	 * @return
	 */
	@Override
	public List<CalendarDTO> getScheduleList(int user_cupleNum) {
		// TODO Auto-generated method stub
		return calendarDaoInter.getScheduleList(user_cupleNum);
	}

	/**
	 * 07-15 YoungJin
	 * �̺�Ʈ(������) ���� �� ������ �̺�Ʈ�� ���� ��ȸ
	 * @param cidx
	 * @return
	 */
	@Override
	public CalendarDTO getDetailScheduleInfo(int cidx) {
		// TODO Auto-generated method stub
		return calendarDaoInter.getDetailScheduleInfo(cidx);
	}
	/**
	 * 0718 seonggyeong
	 * �󼼺����� ���� ����, ���� ��ɱ���
	 * @param cdto
	 * @throws SQLException
	 */
	@Override
	public void updateScheduleInfo(CalendarDTO cdto) throws SQLException {
		calendarDaoInter.updateCalendar(cdto);
	}

	@Override
	public void deleteScheduleInfo(int idx) throws SQLException {
		calendarDaoInter.deleteCalendar(idx);
	}
	

}