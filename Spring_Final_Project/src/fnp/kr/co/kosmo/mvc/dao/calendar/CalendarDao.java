package fnp.kr.co.kosmo.mvc.dao.calendar;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fnp.kr.co.kosmo.mvc.dao.calendar.inter.CalendarDaoInter;
import fnp.kr.co.kosmo.mvc.dto.CalendarDTO;

@Repository
public class CalendarDao implements CalendarDaoInter {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	/**
	 * ����ڰ� ����� ������ �������� DB�� �Է�
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
	 * calendar�� ��ϵ� ���� Ŭ�� �� �󼼺��� �������� �̵��ؼ� ������ ������ ������
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