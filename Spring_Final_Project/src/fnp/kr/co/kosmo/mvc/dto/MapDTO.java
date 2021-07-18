package fnp.kr.co.kosmo.mvc.dto;

import java.util.ArrayList;

public class MapDTO {

	//맵 고유번호
	private int map_num;
	//커플 고유번호
	private int map_cnum;
	
	private ArrayList<MarkerDTO> markerdto;

	public int getMap_num() {
		return map_num;
	}

	public void setMap_num(int map_num) {
		this.map_num = map_num;
	}

	public int getMap_cnum() {
		return map_cnum;
	}

	public void setMap_cnum(int map_cnum) {
		this.map_cnum = map_cnum;
	}

	public ArrayList<MarkerDTO> getMarkerdto() {
		return markerdto;
	}

	public void setMarkerdto(ArrayList<MarkerDTO> markerdto) {
		this.markerdto = markerdto;
	}
	
	
}
