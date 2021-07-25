package fnp.kr.co.kosmo.mvc.dao.like;

import java.util.Map;

import fnp.kr.co.kosmo.mvc.dto.Like_mDTO;

public interface LikeDaoInter {
	public void insertLike(Like_mDTO dto);
	public void deleteLike(Like_mDTO dto);
}
