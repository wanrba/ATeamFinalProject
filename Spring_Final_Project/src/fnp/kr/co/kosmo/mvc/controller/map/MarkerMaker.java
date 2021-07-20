package fnp.kr.co.kosmo.mvc.controller.map;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import fnp.kr.co.kosmo.mvc.dto.MarkerDTO;
import fnp.kr.co.kosmo.mvc.service.map.inter.MapServerInter;

@Controller
public class MarkerMaker {

	@Autowired
	public MapServerInter mapServerInter;

	/**
	 * map.jsp�� �̵� ������ ǥ�õǾ��ִ� ��Ŀ ��� ���� ��Ŀ�� ������ ������ ������
	 * 
	 * @param map_num
	 * @return
	 */
	@RequestMapping(value = { "/map.do" })
	public String maptest(Model m, HttpSession session) {
		//���ǿ� ���� Ŀ�ù�ȣ �޾ƿͼ� ������ȣ �̱�
		int map_num = mapServerInter.coupleMapNum((int) session.getAttribute("sessionCoupleNum"));
		List<MarkerDTO> list = mapServerInter.MapForm(map_num);

		m.addAttribute("list", list);
		return "map/map";
	}

	/**
	 * ��Ŀ ������ ���� ���
	 * 
	 * @param marker_picture
	 * @param dto
	 * @param request
	 * @return
	 */
	@PostMapping(value = { "/markermaker.do" })
	public String mapMarkerSave(List<MultipartFile> marker_picture, MarkerDTO dto, HttpServletRequest request) {
		String img_path = "resources\\fileUpload";
		
		String r_path = "C:\\Users\\Mingi\\OneDrive\\KOSMO 2021.01~2021.08\\FinalProj\\FinalSpring\\ATeamFinalProject\\Spring_Final_Project\\WebContent\\";
		StringBuffer picname = new StringBuffer();
		for (MultipartFile mf : marker_picture) {
			String orlFn = mf.getOriginalFilename();

			StringBuffer path = new StringBuffer();
			path.append(r_path).append(img_path).append("\\");
			path.append(orlFn);
			File f = new File(path.toString());
			try {
				mf.transferTo(f);
				picname.append(orlFn).append(",");
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}

		}
		dto.setMarker_picturename(picname.toString());
		// Ŀ���� ������ȣ�� ���� ���
		dto.setMarker_mnum(1);
		mapServerInter.markerMake(dto);

		return "redirect:map.do";
	}

	/**
	 * ��Ŀ �����ϴ� �޼���
	 * 
	 * @param marker_num
	 * @return
	 */
	@GetMapping(value = { "/markerDel.do" })
	@ResponseBody
	public void markerDel(int marker_num, HttpServletResponse response) {
		mapServerInter.delMarker(marker_num);
		try {
			response.setContentType("text/html; charset=euc-kr");

			response.getWriter().print("������ �Ϸ�Ǿ����ϴ�");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
