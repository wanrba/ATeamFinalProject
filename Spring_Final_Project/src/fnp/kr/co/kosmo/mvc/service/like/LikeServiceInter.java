package fnp.kr.co.kosmo.mvc.service.like;

import java.util.Map;

import fnp.kr.co.kosmo.mvc.dto.Like_mDTO;

public interface LikeServiceInter {
	//up like
	public void insertLike(Like_mDTO dto);
	
	//down like
	public void deleteLike(Like_mDTO dto);
}
