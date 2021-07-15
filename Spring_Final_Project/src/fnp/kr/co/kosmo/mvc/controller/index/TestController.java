package fnp.kr.co.kosmo.mvc.controller.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping(value = { "/index.do" })
	public String indexTest() {

		return "index/index";
	}

}
