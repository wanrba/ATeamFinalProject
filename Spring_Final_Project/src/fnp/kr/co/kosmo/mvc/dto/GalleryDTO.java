package fnp.kr.co.kosmo.mvc.dto;

public class GalleryDTO {
	private int picture_index;
	private int couple_num;
	private String picture;
	private int usage;
	private String p_date;
	private String p_title;
	public String getP_title() {
		return p_title;
	}
	public void setP_title(String p_title) {
		this.p_title = p_title;
	}
	public int getPicture_index() {
		return picture_index;
	}
	public void setPicture_index(int picture_index) {
		this.picture_index = picture_index;
	}
	public int getCouple_num() {
		return couple_num;
	}
	public void setCouple_num(int couple_num) {
		this.couple_num = couple_num;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public int getUsage() {
		return usage;
	}
	public void setUsage(int usage) {
		this.usage = usage;
	}
	public String getP_date() {
		return p_date;
	}
	public void setP_date(String p_date) {
		this.p_date = p_date;
	}
}
