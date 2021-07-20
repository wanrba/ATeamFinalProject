package fnp.kr.co.kosmo.mvc.controller.restful;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import fnp.kr.co.kosmo.mvc.dto.CalendarDTO;
import fnp.kr.co.kosmo.mvc.service.calendar.inter.CalendarServiceInter;

@RestController
public class CalendarRestfulController {
	@Autowired
	private CalendarServiceInter calendarServiceInter;

	/**
	 * 2021-07-15 YoungJin
	 * 
	 * @param session
	 * @return JSONArray
	 */
	@PostMapping(value = { "/getCalendarList.do" })
	public JSONArray getScheduleList(HttpSession session) {
		JSONObject event = new JSONObject();
		JSONArray ja = new JSONArray();

		try {
//			List<CalendarDTO> list = calendarServiceInter.getScheduleList(Integer.parseInt((String) session.getAttribute("USER_NUM")));
//			List<CalendarDTO> list = calendarServiceInter.getScheduleList(Integer.parseInt((String) session.getAttribute("USER_NUM")));
			List<CalendarDTO> list = calendarServiceInter.getScheduleList(1);
			for (int i = 0; i < list.size(); i++) {
				JSONObject jo = new JSONObject();
				jo.put("id", list.get(i).getCidx());
				jo.put("title", list.get(i).getcTitle());
				jo.put("start", list.get(i).getcStartDay());
				jo.put("color", list.get(i).getcColor());
				jo.putIfAbsent("end", list.get(i).getcEndDay());
				ja.add(jo);
			}

			event.put("id", list.get(0).getUser_couplenum());
			event.put("member_id", list.get(0).getUser_couplenum());
			event.put("event", ja);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return ja;
	}
}