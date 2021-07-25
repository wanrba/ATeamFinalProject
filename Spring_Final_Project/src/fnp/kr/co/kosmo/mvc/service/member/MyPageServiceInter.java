package fnp.kr.co.kosmo.mvc.service.member;

import fnp.kr.co.kosmo.mvc.dto.MemberDTO;

public interface MyPageServiceInter {

	public MemberDTO getUserInfo(String user_id);

	public MemberDTO memchk(MemberDTO vo);

	public void memUpdate(MemberDTO vo);
	
	public void delInfo(int couple_num);   //Ä¿ÇÃÀÌ Å»ÅðÇÒ °æ¿ì
	   
   public void delInfo2(int user_num);  //Ä¿ÇÃµî·Ï Àü Å»Åð
}
