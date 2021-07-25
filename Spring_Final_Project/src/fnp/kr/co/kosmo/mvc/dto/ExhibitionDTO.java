package fnp.kr.co.kosmo.mvc.dto;

public class ExhibitionDTO {

	private int ex_index;
	private String ex_title;
	private String ex_startday;
	private String ex_endday;
	private float ex_lat;
	private float ex_lon;
	private String ex_thumb;
	private int ex_pay;
	private String ex_time;

	public int getEx_index() {
		return ex_index;
	}

	public void setEx_index(int ex_index) {
		this.ex_index = ex_index;
	}

	public String getEx_title() {
		return ex_title;
	}

	public void setEx_title(String ex_title) {
		this.ex_title = ex_title;
	}

	public String getEx_startday() {
		return ex_startday;
	}

	public void setEx_startday(String ex_startday) {
		this.ex_startday = ex_startday;
	}

	public String getEx_endday() {
		return ex_endday;
	}

	public void setEx_endday(String ex_endday) {
		this.ex_endday = ex_endday;
	}

	public float getEx_lat() {
		return ex_lat;
	}

	public void setEx_lat(float ex_lat) {
		this.ex_lat = ex_lat;
	}

	public float getEx_lon() {
		return ex_lon;
	}

	public void setEx_lon(float ex_lon) {
		this.ex_lon = ex_lon;
	}

	public String getEx_thumb() {
		return ex_thumb;
	}

	public void setEx_thumb(String ex_thumb) {
		this.ex_thumb = ex_thumb;
	}

	public int getEx_pay() {
		return ex_pay;
	}

	public void setEx_pay(int ex_pay) {
		this.ex_pay = ex_pay;
	}

	public String getEx_time() {
		return ex_time;
	}

	public void setEx_time(String ex_time) {
		this.ex_time = ex_time;
	}

}
