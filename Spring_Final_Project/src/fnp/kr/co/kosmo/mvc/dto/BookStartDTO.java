package fnp.kr.co.kosmo.mvc.dto;

public class BookStartDTO {

	private int bookstart_booknum; // 통장 INDEX
	private int bookstart_num; // 입 / 출 INDEX
	private int bookstart_input; // 입금
	private int bookstart_output; // 출금
	private int bookstart_usernum; // 유저 INDEX
	private String bookstart_date; // 사용일

	public int getBookstart_booknum() {
		return bookstart_booknum;
	}

	public void setBookstart_booknum(int bookstart_booknum) {
		this.bookstart_booknum = bookstart_booknum;
	}

	public int getBookstart_num() {
		return bookstart_num;
	}

	public void setBookstart_num(int bookstart_num) {
		this.bookstart_num = bookstart_num;
	}

	public int getBookstart_input() {
		return bookstart_input;
	}

	public void setBookstart_input(int bookstart_input) {
		this.bookstart_input = bookstart_input;
	}

	public int getBookstart_output() {
		return bookstart_output;
	}

	public void setBookstart_output(int bookstart_output) {
		this.bookstart_output = bookstart_output;
	}

	public int getBookstart_usernum() {
		return bookstart_usernum;
	}

	public void setBookstart_usernum(int bookstart_usernum) {
		this.bookstart_usernum = bookstart_usernum;
	}

	public String getBookstart_date() {
		return bookstart_date;
	}

	public void setBookstart_date(String bookstart_date) {
		this.bookstart_date = bookstart_date;
	}

}
