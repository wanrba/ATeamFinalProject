package fnp.kr.co.kosmo.mvc.dto;

public class MarkerDTO {

	//지도번호
	private int marker_mnum;
	// 마커 고유번호
	private int marker_num;
	//사진
	private String marker_picture;
	//제목
	private String marker_title;
	//내용
	private String marker_content;
	//위도
	private float marker_lat;
	//경도
	private float marker_lon;
	//주소
	private String marker_addr;
	//추억 날짜 
	private String marker_date;
	//좋아요
	private int marker_likes;
	
	public int getMarker_likes() {
		return marker_likes;
	}

	public void setMarker_likes(int marker_likes) {
		this.marker_likes = marker_likes;
	}

	public int getMarker_num() {
		return marker_num;
	}
	
	public void setMarker_num(int marker_num) {
		this.marker_num = marker_num;
	}
	
	public int getMarker_mnum() {
		return marker_mnum;
	}
	public void setMarker_mnum(int marker_mnum) {
		this.marker_mnum = marker_mnum;
	}
	
	public String getMarker_picture() {
		return marker_picture;
	}
	public void setMarker_picture(String marker_picture) {
		this.marker_picture = marker_picture;
	}
	public String getMarker_title() {
		return marker_title;
	}
	public void setMarker_title(String marker_title) {
		this.marker_title = marker_title;
	}
	public String getMarker_content() {
		return marker_content;
	}
	public void setMarker_content(String marker_content) {
		this.marker_content = marker_content;
	}
	public float getMarker_lat() {
		return marker_lat;
	}
	public void setMarker_lat(float marker_lat) {
		this.marker_lat = marker_lat;
	}
	public float getMarker_lon() {
		return marker_lon;
	}
	public void setMarker_lon(float marker_lon) {
		this.marker_lon = marker_lon;
	}
	public String getMarker_addr() {
		return marker_addr;
	}
	public void setMarker_addr(String marker_addr) {
		this.marker_addr = marker_addr;
	}
	public String getMarker_date() {
		return marker_date;
	}
	public void setMarker_date(String marker_date) {
		this.marker_date = marker_date;
	}
	

	
}
