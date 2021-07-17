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

//	public List<CalendarDTO> insertCalendar(CalendarDTO cdto) {
//		
//		return calendarDao.insertCalendar(cdto);
//	}
	/**
	 * ����ڰ� ����� ������ �������� DB�� �Է� ����ڰ� �Է��� ���� ó�� �� ���� ó��
	 */
	@Override
	public void insertScheduleInfo(CalendarDTO cdto) throws SQLException {
		// TODO Auto-generated method stub

		// �߿䵵�� ���� ����ó��
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
//		return calendarDaoInter.insertCalendar(cdto) > 0 ? true : false;
	}

	@Override
	public List<CalendarDTO> getScheduleList(int user_cupleNum) {
		// TODO Auto-generated method stub
		return calendarDaoInter.getScheduleList(user_cupleNum);
	}

	/**
	 * calendar�� ��ϵ� ���� Ŭ�� �� �󼼺��� �������� �̵��ؼ� ������ ������ ������
	 * 
	 * @param cidx
	 * @return
	 */
	@Override
	public CalendarDTO getDetailScheduleInfo(int cidx) {
		// TODO Auto-generated method stub
		System.out.println("service's cidx ::: " + cidx);
		return calendarDaoInter.getDetailScheduleInfo(cidx);
	}

}