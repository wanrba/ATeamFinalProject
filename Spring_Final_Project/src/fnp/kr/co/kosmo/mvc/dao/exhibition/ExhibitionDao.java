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
	 * 커플상점의 목록리스트 반환
	 * 검색 조건이 있을경우 조건에 맞게 검색 후 반환
	 */
	@Override
	public List<ExhibitionDTO> getExhibitionList(Map<String, String> searchMap) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList("exhibition.contentList", searchMap);
	}
	
	

}
