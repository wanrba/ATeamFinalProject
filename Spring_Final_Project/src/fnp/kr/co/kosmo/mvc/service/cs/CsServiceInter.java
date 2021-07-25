package fnp.kr.co.kosmo.mvc.service.cs;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import fnp.kr.co.kosmo.mvc.dto.CalendarDTO;
import fnp.kr.co.kosmo.mvc.dto.CustomerServiceDTO;

public interface CsServiceInter {

	public void sendAsk(CustomerServiceDTO csdto);
	

}