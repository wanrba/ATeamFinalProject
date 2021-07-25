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
 * ���ƿ� ������ ���ƿ� ���̺� ���ƿ� row �߰�
 * 0724 �輺��
 */
	@Override
	public void insertLike(Like_mDTO dto) {
		likeDaoInter.insertLike(dto);
	}

	/**
	 * ���ƿ� �������¿��� �ٽ��ѹ� ������ ���ƿ� row ����
	 * 0724 �輺��
	 */

	@Override
	public void deleteLike(Like_mDTO dto) {
		likeDaoInter.deleteLike(dto);
	}
}
