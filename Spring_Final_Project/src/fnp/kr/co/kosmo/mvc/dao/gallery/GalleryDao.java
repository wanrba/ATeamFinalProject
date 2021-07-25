package fnp.kr.co.kosmo.mvc.dao.gallery;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fnp.kr.co.kosmo.mvc.dto.GalleryDTO;
@Repository
public class GalleryDao implements GalleryDaoInter{
   @Autowired
   public SqlSessionTemplate ss;

   // ���� ���ε�
   @Override
   public void galleryUpload(GalleryDTO dto) {
 
      ss.insert("gallery.galleryup",dto);
   }
   // ���� ���
   @Override
   public List<GalleryDTO> galleryForm(int couple_num) {
      
      return ss.selectList("gallery.galleryform",couple_num);
   }
   

}