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
	 * ���ƿ� �߰� ��� 07.24, �ϴ�,����
	 * @param m
	 * @param session
	 * @param marker_num
	 * @return
	 */
	@PostMapping("/uplike.do")
	public String upLike(Model m,HttpSession session,int marker_num) {
		int coupleNum=(Integer) session.getAttribute("sessionCoupleNum");
		Like_mDTO dto=new Like_mDTO();
		dto.setL_num(1); // up�̱� ������ 1�� ���� 
		dto.setL_couplenum(coupleNum); //marker ���̺��� like�� 1�� �ٲٱ�
		dto.setL_markernum(marker_num); //marker��ȣ (��Ʈ�� marker)
		likeServiceInter.insertLike(dto);// ����ũ(���ƿ�) ���̺� �߰��ϱ� 
		Map<String, Integer> map=new HashMap<String, Integer>(); //dao �� hashmap���� �ΰ� int �ֱ�����
		map.put("marker_mnum", coupleNum);
		map.put("marker_num",marker_num );
		mapServerInter.upDateLike(map);//marker ���̺��� �ش� row�� likes������Ʈ 1�� (��Ʈ�� ��)
		m.addAttribute("like", 1);
		return "gallery/likes/likes";
	}
	/**
	 * ���ƿ� ������� 07.24  �ϴ�,����
	 * @param m
	 * @param session
	 * @param marker_num
	 * @return
	 */
	@PostMapping("/downlike.do")
	public String downLike(Model m,HttpSession session,int marker_num) {
		int coupleNum=(Integer) session.getAttribute("sessionCoupleNum");
		Like_mDTO dto=new Like_mDTO();
		dto.setL_couplenum(coupleNum); //marker ���̺��� like�� 0�� �ٲٱ�
		dto.setL_markernum(marker_num);//marker��ȣ (��Ʈ�� marker)
		likeServiceInter.deleteLike(dto);//���ƿ� ���ֱ� delete��
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("marker_mnum", coupleNum);
		map.put("marker_num",marker_num );
		mapServerInter.UpdatedownLike(map);//marker ���̺��� �ش� row�� likes������Ʈ 1�� (��Ʈ�� ��)
		m.addAttribute("like", 0);
		return "gallery/likes/likes";
	}
}
