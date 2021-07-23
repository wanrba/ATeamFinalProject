package fnp.kr.co.kosmo.mvc.dto;

public class MemberDTO {

	private int user_num; // INDEX
	private String user_id; // 아이디
	private String user_pwd; // 비밀번호
	private String user_name; // 이름
	private String user_phone; // 연락처
	private String user_birth; // 생년월일
	private int user_age; // 나이
	private String user_gender; // 성별
	private int user_couplenum; // 커플 고유번호
	private int user_match; // 연인 매칭 유무 승인이전 0 승인대기 1 승인 이후 2
	private String user_dday; // 연인이 된 날짜
	private String user_adate; // 가입일

	public int getUser_num() {
		return user_num;
	}

	public void setUser_num(int user_num) {
		this.user_num = user_num;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pwd() {
		return user_pwd;
	}

	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_birth() {
		return user_birth;
	}

	public void setUser_birth(String user_birth) {
		this.user_birth = user_birth;
	}

	public int getUser_age() {
		return user_age;
	}

	public void setUser_age(int user_age) {
		this.user_age = user_age;
	}

	public String getUser_gender() {
		return user_gender;
	}

	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}

	public int getUser_couplenum() {
		return user_couplenum;
	}

	public void setUser_couplenum(int user_couplenum) {
		this.user_couplenum = user_couplenum;
	}

	public int getUser_match() {
		return user_match;
	}

	public void setUser_match(int user_match) {
		this.user_match = user_match;
	}

	public String getUser_dday() {
		return user_dday;
	}

	public void setUser_dday(String user_dday) {
		this.user_dday = user_dday;
	}

	public String getUser_adate() {
		return user_adate;
	}

	public void setUser_adate(String user_adate) {
		this.user_adate = user_adate;
	}

}