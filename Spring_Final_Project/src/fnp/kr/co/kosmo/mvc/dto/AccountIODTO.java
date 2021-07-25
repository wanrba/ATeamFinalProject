package fnp.kr.co.kosmo.mvc.dto;

public class AccountIODTO {
    private int account_index;
    private int accountio_num;           
    private int deposit;
    private int withdraw;
    private int accountio_usernum;
    private String accountio_date;
	public int getAccount_index() {
		return account_index;
	}
	public void setAccount_index(int account_index) {
		this.account_index = account_index;
	}
	public int getAccountio_num() {
		return accountio_num;
	}
	public void setAccountio_num(int accountio_num) {
		this.accountio_num = accountio_num;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	public int getAccountio_usernum() {
		return accountio_usernum;
	}
	public void setAccountio_usernum(int accountio_usernum) {
		this.accountio_usernum = accountio_usernum;
	}
	public String getAccountio_date() {
		return accountio_date;
	}
	public void setAccountio_date(String accountio_date) {
		this.accountio_date = accountio_date;
	}
    
}
