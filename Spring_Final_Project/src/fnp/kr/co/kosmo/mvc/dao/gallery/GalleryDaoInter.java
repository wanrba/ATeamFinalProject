package fnp.kr.co.kosmo.mvc.dao.gallery;

import java.util.List;

import fnp.kr.co.kosmo.mvc.dto.GalleryDTO;

public interface GalleryDaoInter {
   
   // 사진 업로드
   public void galleryUpload(GalleryDTO dto);
   
   //사진 리스트 출력
   public List<GalleryDTO> galleryForm(int couple_num);
   
}