package fnp.kr.co.kosmo.mvc.dto;

public class AccountDTO {
	private String account_name;  
    private int account_index; 
    private int account_num; 
    private int account_pwd; 
    private int account_bal; 
    private String account_odate;
    private int couple_num;
    
    
	public int getCouple_num() {
		return couple_num;
	}
	public void setCouple_num(int couple_num) {
		this.couple_num = couple_num;
	}
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public int getAccount_index() {
		return account_index;
	}
	public void setAccount_index(int account_index) {
		this.account_index = account_index;
	}
	public int getAccount_num() {
		return account_num;
	}
	public void setAccount_num(int account_num) {
		this.account_num = account_num;
	}
	public int getAccount_pwd() {
		return account_pwd;
	}
	public void setAccount_pwd(int account_pwd) {
		this.account_pwd = account_pwd;
	}
	public int getAccount_bal() {
		return account_bal;
	}
	public void setAccount_bal(int account_bal) {
		this.account_bal = account_bal;
	}
	public String getAccount_odate() {
		return account_odate;
	}
	public void setAccount_odate(String account_odate) {
		this.account_odate = account_odate;
	}
    
    
}
