package fnp.kr.co.kosmo.mvc.controller.calendar;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fnp.kr.co.kosmo.mvc.dto.CalendarDTO;
import fnp.kr.co.kosmo.mvc.service.calendar.inter.CalendarServiceInter;

@Controller
public class CalendarController {

	@Autowired
	private CalendarServiceInter calendarServiceInter;

	/**
	 * 07-16 YoungJin
	 * fullCalendar에서 이벤트(스케줄)등록 시 등록 Form으로 이동
	 * 
	 * @param request
	 * @param m
	 * @return
	 */
	@GetMapping(value = { "/insertCalendarDetailForm.do" })
	public String calendarDetailForm(HttpServletRequest request, Model m) {

		m.addAttribute("startDate", request.getParameter("startDay"));
		m.addAttribute("endDate", request.getParameter("endDay"));

		return "calendar/calendarForm";
	}

	/**
	 * 2021-07-15 YoungJin
	 * fullCalendar에서 등록된 이벤트(스케줄)클릭 후 수정하는 Form으로 이동
	 * 
	 * @param request
	 * @param m
	 * @return
	 */
	@GetMapping(value = { "/updateCalendarDetailForm.do" })
	public String updateCalendarDetailForm(HttpServletRequest request, Model m) {

		m.addAttribute("cdto",
				calendarServiceInter.getDetailScheduleInfo(Integer.parseInt(request.getParameter("cidx"))));

		return "calendar/updateCalendarForm";
	}

	/**
	 * 07-16 YoungJin
	 * fullCalendar에서 이벤트(스케줄)등록 후 메인화면으로 이동
	 * 
	 * @param cdto
	 * @param session
	 * @return
	 * @throws SQLException
	 */
	@PostMapping(value = { "/insertCalendar.do" })
	public String insertCalendar(CalendarDTO cdto, HttpSession session) throws SQLException {

		cdto.setUser_cuplenum(Integer.parseInt((String) session.getAttribute("USER_CUPLENUM")));

		calendarServiceInter.insertScheduleInfo(cdto);

		return "redirect:/index.do";
	}

}
