package fnp.kr.co.kosmo.mvc.dao.exhibition;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fnp.kr.co.kosmo.mvc.dto.ExhibitionDTO;

@Repository
public class ExhibitionDao implements ExhibitionDaoInter{

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	/**
	 * 07-23 YoungJin
	 * Ŀ�û����� ��ϸ���Ʈ ��ȯ
	 * �˻� ������ ������� ���ǿ� �°� �˻� �� ��ȯ
	 */
	@Override
	public List<ExhibitionDTO> getExhibitionList(Map<String, String> searchMap) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList("exhibition.contentList", searchMap);
	}
	
	

}
