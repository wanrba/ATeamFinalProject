package fnp.kr.co.kosmo.mvc.controller.like;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import fnp.kr.co.kosmo.mvc.dto.Like_mDTO;
import fnp.kr.co.kosmo.mvc.service.like.LikeServiceInter;
import fnp.kr.co.kosmo.mvc.service.map.MapServerInter;

@Controller
public class LikeController {
	
	@Autowired
	private LikeServiceInter likeServiceInter;
	@Autowired
	public MapServerInter mapServerInter;
	
	/**
	 * 좋아요 추가 기능 07.24, 하늘,성경
	 * @param m
	 * @param session
	 * @param marker_num
	 * @return
	 */
	@PostMapping("/uplike.do")
	public String upLike(Model m,HttpSession session,int marker_num) {
		int coupleNum=(Integer) session.getAttribute("sessionCoupleNum");
		Like_mDTO dto=new Like_mDTO();
		dto.setL_num(1); // up이기 때문에 1로 설정 
		dto.setL_couplenum(coupleNum); //marker 테이블의 like를 1로 바꾸기
		dto.setL_markernum(marker_num); //marker번호 (하트할 marker)
		likeServiceInter.insertLike(dto);// 라이크(좋아요) 테이블에 추가하기 
		Map<String, Integer> map=new HashMap<String, Integer>(); //dao 에 hashmap으로 두개 int 넣기위함
		map.put("marker_mnum", coupleNum);
		map.put("marker_num",marker_num );
		mapServerInter.upDateLike(map);//marker 테이블의 해당 row의 likes업데이트 1로 (하트가 들어간)
		m.addAttribute("like", 1);
		return "gallery/likes/likes";
	}
	/**
	 * 좋아요 삭제기능 07.24  하늘,성경
	 * @param m
	 * @param session
	 * @param marker_num
	 * @return
	 */
	@PostMapping("/downlike.do")
	public String downLike(Model m,HttpSession session,int marker_num) {
		int coupleNum=(Integer) session.getAttribute("sessionCoupleNum");
		Like_mDTO dto=new Like_mDTO();
		dto.setL_couplenum(coupleNum); //marker 테이블의 like를 0로 바꾸기
		dto.setL_markernum(marker_num);//marker번호 (하트할 marker)
		likeServiceInter.deleteLike(dto);//좋아요 없애기 delete로
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("marker_mnum", coupleNum);
		map.put("marker_num",marker_num );
		mapServerInter.UpdatedownLike(map);//marker 테이블의 해당 row의 likes업데이트 1로 (하트가 들어간)
		m.addAttribute("like", 0);
		return "gallery/likes/likes";
	}
}
