package fnp.kr.co.kosmo.mvc.service.like;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fnp.kr.co.kosmo.mvc.dao.like.LikeDaoInter;
import fnp.kr.co.kosmo.mvc.dto.Like_mDTO;

@Service
public class LikeService implements LikeServiceInter{
	@Autowired
	public LikeDaoInter likeDaoInter;
/**
 * 좋아요 누르면 좋아요 테이블에 좋아요 row 추가
 * 0724 김성경
 */
	@Override
	public void insertLike(Like_mDTO dto) {
		likeDaoInter.insertLike(dto);
	}

	/**
	 * 좋아요 누른상태에서 다시한번 누르면 좋아요 row 삭제
	 * 0724 김성경
	 */

	@Override
	public void deleteLike(Like_mDTO dto) {
		likeDaoInter.deleteLike(dto);
	}
}
