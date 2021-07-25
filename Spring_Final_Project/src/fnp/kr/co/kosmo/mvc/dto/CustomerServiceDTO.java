package fnp.kr.co.kosmo.mvc.dto;

public class CustomerServiceDTO {
	
	private int cs_num;
	private String user_id, cs_type;
	private String cs_title, cs_content, cs_write_date, cs_answer, cs_answer_date;
	
	
	public String getCs_type() {
		return cs_type;
	}
	public void setCs_type(String cs_type) {
		this.cs_type = cs_type;
	}
	public int getCs_num() {
		return cs_num;
	}
	public void setCs_num(int cs_num) {
		this.cs_num = cs_num;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getCs_title() {
		return cs_title;
	}
	public void setCs_title(String cs_title) {
		this.cs_title = cs_title;
	}
	public String getCs_content() {
		return cs_content;
	}
	public void setCs_content(String cs_content) {
		this.cs_content = cs_content;
	}
	public String getCs_write_date() {
		return cs_write_date;
	}
	public void setCs_write_date(String cs_write_date) {
		this.cs_write_date = cs_write_date;
	}
	public String getCs_answer() {
		return cs_answer;
	}
	public void setCs_answer(String cs_answer) {
		this.cs_answer = cs_answer;
	}
	public String getCs_answer_date() {
		return cs_answer_date;
	}
	public void setCs_answer_date(String cs_answer_date) {
		this.cs_answer_date = cs_answer_date;
	}
	
	


	

	
}
