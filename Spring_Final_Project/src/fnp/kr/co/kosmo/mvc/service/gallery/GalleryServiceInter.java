package fnp.kr.co.kosmo.mvc.service.gallery;
import java.util.List;

import fnp.kr.co.kosmo.mvc.dto.GalleryDTO;

public interface GalleryServiceInter {
   
   // 사진 업로드
   public void galleryUpload(GalleryDTO dto);
   
   // 사진 리스트 출력
   public List<GalleryDTO> galleryForm(int couple_num);
   
}