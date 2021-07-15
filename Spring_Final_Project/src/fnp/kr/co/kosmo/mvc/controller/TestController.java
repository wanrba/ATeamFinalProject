package fnp.kr.co.kosmo.mvc.controller;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fnp.kr.co.kosmo.mvc.dao.inter.calendar.CalendarDaoInter;
import fnp.kr.co.kosmo.mvc.dto.CalendarDTO;

@Controller
public class TestController {
	
	@Autowired
	private CalendarDaoInter calendarServiceInter;
	
	@RequestMapping(value = {"/index.do"})
	public String indexTest(Model m) {
		JSONObject event = new JSONObject();
		JSONArray ja = new JSONArray();
		List<CalendarDTO> list = calendarServiceInter.getScheduleList(1);
		for(int i = 0; i < list.size(); i++) {
			JSONObject jo = new JSONObject();
			jo.put("title", list.get(i).getcTitle());
			jo.put("start", list.get(i).getcStartDay());
			jo.putIfAbsent("end", list.get(i).getcEndDay());
			ja.add(jo);
		}
		
		event.put("id", list.get(0).getUser_cuplenum());
		event.put("event", ja);
		
		m.addAttribute("scheduleList", event);
		System.out.println("========================== Test Controller ========================== ");
		return "index/index";
	}

}
