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
	 * 0724 여행일기 갤러리 컨트롤러 하늘,성경
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
	 * 작업일시 : 07/22 작업자 : 하늘, 성경, 민기 내용 : 다중 파일 업로드 구현 / merge하여 사용시 r_path 값을 변경하여
	 * 사용하기 바람.
	 * @param mtfRequest
	 * @param session
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "galleryup.do")
    public String requestupload2(MultipartHttpServletRequest mtfRequest,HttpSession session,
          HttpServletRequest request) {
		// 리스트형 fileList 변수에 사진업로드폼에 업로드한 사진을 저장함
        List<MultipartFile> fileList = mtfRequest.getFiles("picture");
        // 사진업로드폼에서 입력한 p_title값을 저장
        String p_title = request.getParameter("p_title");
        // 사진이 저장 될 경로를 설정
        String r_path = "C:\\Users\\Mingi\\OneDrive\\KOSMO 2021.01~2021.08\\FinalProj\\FinalSpring\\ATeamFinalProject\\Spring_Final_Project\\WebContent\\resources\\imgUpload\\";
        
        // GalleryDTO 객체 생성
        GalleryDTO dto = new GalleryDTO();
        StringBuffer sb = new StringBuffer();
        // StringBuffer를 사용하여 파일명 + "," append함
        for (MultipartFile mf : fileList) {
        	// fileList = 주소값을 가라키는 상태인데
			// getOriginalFilename를 사용하여 파일명으로 바꿔준다.
			String originFileName = mf.getOriginalFilename(); // 원본 파일 명
			sb.append(originFileName).append(",");
			// safeFile = 경로+파일명
			String safeFile = r_path + originFileName;
			try {
				// 경로와 파일명을 더한 safeFile을 transferTo 메서드를 사용해 해당 경로에 저장함!
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
