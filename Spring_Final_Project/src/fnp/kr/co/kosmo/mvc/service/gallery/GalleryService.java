package fnp.kr.co.kosmo.mvc.service.gallery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fnp.kr.co.kosmo.mvc.dao.gallery.GalleryDaoInter;
import fnp.kr.co.kosmo.mvc.dto.GalleryDTO;

@Service
public class GalleryService implements GalleryServiceInter {
   
   @Autowired
   public GalleryDaoInter galleryDaoInter;
   
   @Override
   public void galleryUpload(GalleryDTO dto) {
      
      galleryDaoInter.galleryUpload(dto);
   }

   @Override
   public List<GalleryDTO> galleryForm(int couple_num) {
      System.out.println("servoce" + couple_num);
      return galleryDaoInter.galleryForm(couple_num);
   }

}