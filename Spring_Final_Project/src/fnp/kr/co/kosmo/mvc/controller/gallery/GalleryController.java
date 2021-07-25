package fnp.kr.co.kosmo.mvc.controller.gallery;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import fnp.kr.co.kosmo.mvc.dto.GalleryDTO;
import fnp.kr.co.kosmo.mvc.dto.MarkerDTO;
import fnp.kr.co.kosmo.mvc.service.gallery.GalleryServiceInter;
import fnp.kr.co.kosmo.mvc.service.map.MapServerInter;
import fnp.kr.co.kosmo.mvc.service.member.LoginServiceInter;
import oracle.net.aso.k;

@Controller
public class GalleryController<V> {

	@Autowired
	private GalleryServiceInter galleryServiceInter;

	@Autowired
	public MapServerInter mapServerInter;

	@Autowired
	public LoginServiceInter loginServiceInter;
	

	@RequestMapping("/galUpload.do")
	public String galUpload() {
		return "gallery/galUpload";
	}

	

	@GetMapping("/Gallery.do")
	public ModelAndView selectInfo() {
		ModelAndView mav = new ModelAndView("gallery/gallery");

		return mav;
	}

	/**
	 * 0724 �����ϱ� ������ ��Ʈ�ѷ� �ϴ�,����
	 * 
	 * @param session
	 * @return
	 */
	@GetMapping("/travelGal.do")
	public ModelAndView travelGal(HttpSession session) {
		ModelAndView mav = new ModelAndView("gallery/travelGal");
		int coupleNum = (Integer) session.getAttribute("sessionCoupleNum");
		List<MarkerDTO> markerPD = mapServerInter.markerPD(coupleNum);
		mav.addObject("markerPD", markerPD);
		return mav;

	}

	/**
	 * �۾��Ͻ� : 07/22 �۾��� : �ϴ�, ����, �α� ���� : ���� ���� ���ε� ���� / merge�Ͽ� ���� r_path ���� �����Ͽ�
	 * ����ϱ� �ٶ�.
	 * @param mtfRequest
	 * @param session
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "galleryup.do")
    public String requestupload2(MultipartHttpServletRequest mtfRequest,HttpSession session,
          HttpServletRequest request) {
		// ����Ʈ�� fileList ������ �������ε����� ���ε��� ������ ������
        List<MultipartFile> fileList = mtfRequest.getFiles("picture");
        // �������ε������� �Է��� p_title���� ����
        String p_title = request.getParameter("p_title");
        // ������ ���� �� ��θ� ����
        String r_path = "C:\\Users\\Mingi\\OneDrive\\KOSMO 2021.01~2021.08\\FinalProj\\FinalSpring\\ATeamFinalProject\\Spring_Final_Project\\WebContent\\resources\\imgUpload\\";
        
        // GalleryDTO ��ü ����
        GalleryDTO dto = new GalleryDTO();
        StringBuffer sb = new StringBuffer();
        // StringBuffer�� ����Ͽ� ���ϸ� + "," append��
        for (MultipartFile mf : fileList) {
        	// fileList = �ּҰ��� ����Ű�� �����ε�
			// getOriginalFilename�� ����Ͽ� ���ϸ����� �ٲ��ش�.
			String originFileName = mf.getOriginalFilename(); // ���� ���� ��
			sb.append(originFileName).append(",");
			// safeFile = ���+���ϸ�
			String safeFile = r_path + originFileName;
			try {
				// ��ο� ���ϸ��� ���� safeFile�� transferTo �޼��带 ����� �ش� ��ο� ������!
				mf.transferTo(new File(safeFile));

			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
		dto.setPicture(String.valueOf(sb));
		dto.setP_title(p_title);
		dto.setCouple_num((Integer) session.getAttribute("sessionCoupleNum"));
		galleryServiceInter.galleryUpload(dto);        
        return "redirect:/galleryAlbum.do";

    }

	@RequestMapping(value = { "/galleryAlbum.do" })
	 public ModelAndView galleryInfo(HttpSession session) {
	      ModelAndView mav = new ModelAndView();

	      List<GalleryDTO> list = galleryServiceInter.galleryForm((Integer) session.getAttribute("sessionCoupleNum"));
	      
	      
	      for(int i=0;i<list.size();i++) {
	    	  System.out.println("!!!!!!!!!!"+list.get(i));
	      }
	      
	      mav.addObject("info", list);
	      mav.setViewName("gallery/galleryAlbum");

	      return mav;
	   }


}
