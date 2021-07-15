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
import fnp.kr.co.kosmo.mvc.service.inter.calendar.CalendarServiceInter;

@Controller
public class CalendarController {

	@Autowired
	private CalendarServiceInter calendarServiceInter;

	@GetMapping(value = { "/insertCalendarDetailForm.do" })
	public String calendarDetailForm(HttpServletRequest request, Model m) {

		m.addAttribute("startDate", request.getParameter("startDay"));
		m.addAttribute("endDate", request.getParameter("endDay"));

		return "calendar/calendarForm";
	}

	@PostMapping(value = { "/insertCalendar.do" })
	public String insertCalendar(CalendarDTO cdto, HttpSession session) throws SQLException {

		cdto.setUser_cuplenum(Integer.parseInt((String) session.getAttribute("USER_CUPLENUM")));

		calendarServiceInter.insertScheduleInfo(cdto);

		return "redirect:/index.do";
	}

}
