package fnp.kr.co.kosmo.mvc.dto;

public class BankBookDTO {

	private int bankbook_num; // ���� INDEX
	private int result_usernum; // ���ΰ�����ȣ
	private int bankbook_number; // ���� ���¹�ȣ
	private String bankbook_pwd; // ���� ��й�ȣ
	private int bankbook_money; // ���� �ܾ�
	private String bankbook_date; // ���� ������

	public int getBankbook_num() {
		return bankbook_num;
	}

	public void setBankbook_num(int bankbook_num) {
		this.bankbook_num = bankbook_num;
	}

	public int getResult_usernum() {
		return result_usernum;
	}

	public void setResult_usernum(int result_usernum) {
		this.result_usernum = result_usernum;
	}

	public int getBankbook_number() {
		return bankbook_number;
	}

	public void setBankbook_number(int bankbook_number) {
		this.bankbook_number = bankbook_number;
	}

	public String getBankbook_pwd() {
		return bankbook_pwd;
	}

	public void setBankbook_pwd(String bankbook_pwd) {
		this.bankbook_pwd = bankbook_pwd;
	}

	public int getBankbook_money() {
		return bankbook_money;
	}

	public void setBankbook_money(int bankbook_money) {
		this.bankbook_money = bankbook_money;
	}

	public String getBankbook_date() {
		return bankbook_date;
	}

	public void setBankbook_date(String bankbook_date) {
		this.bankbook_date = bankbook_date;
	}

}
