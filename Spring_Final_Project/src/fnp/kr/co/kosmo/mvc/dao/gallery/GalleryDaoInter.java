package fnp.kr.co.kosmo.mvc.dao.gallery;

import java.util.List;

import fnp.kr.co.kosmo.mvc.dto.GalleryDTO;

public interface GalleryDaoInter {
   
   // ���� ���ε�
   public void galleryUpload(GalleryDTO dto);
   
   //���� ����Ʈ ���
   public List<GalleryDTO> galleryForm(int couple_num);
   
}