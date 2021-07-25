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
	 * �ű� �̺�Ʈ(������) ���
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
	 * fullCalendar�� ����� ȸ���� �̺�Ʈ(������) ����Ʈ ��ȸ
	 */
	@Override
	public List<CalendarDTO> getScheduleList(int user_cupleNum) {
		// TODO Auto-generated method stub

		return sqlSessionTemplate.selectList("calendar.getCalendarList", user_cupleNum);
	}

	/**
	 * 2021-07-15 YoungJin
	 * �̺�Ʈ(������) ���� �� �ش� �̺�Ʈ�� ���� ��ȸ
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
	 * calendar update cdto �� �޾Ƽ� (insert �� ���� ���� form)
	 * 0716 �輺��
	 */
	@Override
	public void updateCalendar(CalendarDTO cdto) {
		sqlSessionTemplate.update("calendar.updateCalendar",cdto);
	}
	
	/**
	 * 
	 * @param idx
	 * idx �� �޾Ƽ� delete idx = index ��ȣ
	 */
	@Override
	public void deleteCalendar(int idx) {
		sqlSessionTemplate.delete("calendar.deleteCalendar",idx);
	}

}