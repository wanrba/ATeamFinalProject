package fnp.kr.co.kosmo.mvc.service.gallery;
import java.util.List;

import fnp.kr.co.kosmo.mvc.dto.GalleryDTO;

public interface GalleryServiceInter {
   
   // ���� ���ε�
   public void galleryUpload(GalleryDTO dto);
   
   // ���� ����Ʈ ���
   public List<GalleryDTO> galleryForm(int couple_num);
   
}