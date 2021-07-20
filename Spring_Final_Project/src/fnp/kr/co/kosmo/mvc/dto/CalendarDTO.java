package fnp.kr.co.kosmo.mvc.dto;

public class CalendarDTO {

	private int cidx;
	private String cTitle;
	private String cStartDay;
	private String cEndDay;
	private String cLocal;
	private String cContent;
	private String cColor;
	private String cImportance;
	private int user_couplenum;

	public int getCidx() {
		return cidx;
	}

	public void setCidx(int cidx) {
		this.cidx = cidx;
	}

	public String getcTitle() {
		return cTitle;
	}

	public void setcTitle(String cTitle) {
		this.cTitle = cTitle;
	}

	public String getcStartDay() {
		return cStartDay;
	}

	public void setcStartDay(String cStartDay) {
		this.cStartDay = cStartDay;
	}

	public String getcEndDay() {
		return cEndDay;
	}

	public void setcEndDay(String cEndDay) {
		this.cEndDay = cEndDay;
	}

	public String getcLocal() {
		return cLocal;
	}

	public void setcLocal(String cLocal) {
		this.cLocal = cLocal;
	}

	public String getcContent() {
		return cContent;
	}

	public void setcContent(String cContent) {
		this.cContent = cContent;
	}

	public String getcColor() {
		return cColor;
	}

	public void setcColor(String cColor) {
		this.cColor = cColor;
	}

	public String getcImportance() {
		return cImportance;
	}

	public void setcImportance(String cImportance) {
		this.cImportance = cImportance;
	}

	public int getUser_couplenum() {
		return user_couplenum;
	}

	public void setUser_couplenum(int user_couplenum) {
		this.user_couplenum = user_couplenum;
	}

}
