package fnp.kr.co.kosmo.mvc.dao.like;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fnp.kr.co.kosmo.mvc.dao.like.LikeDaoInter;
import fnp.kr.co.kosmo.mvc.dto.Like_mDTO;

@Repository
public class LikeDao implements LikeDaoInter{

	@Autowired
	public SqlSessionTemplate ss;

	/**
	 * 0724 하늘,성경
	 * 하트 누르면 라이크테이블에 insert
	 */
	@Override
	public void insertLike(Like_mDTO dto) {
		ss.insert("likes.addLike", dto);
	}

	
/**
 * 0724 하늘,성경
 * 빨간하트에서 하트 다시 누르면 하트 테이블에 없애기
 */
	@Override
	public void deleteLike(Like_mDTO dto) {
		ss.delete("likes.deleteLike",dto);
	}
}
