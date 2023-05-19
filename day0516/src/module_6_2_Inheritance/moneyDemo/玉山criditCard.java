package module_6_2_Inheritance.moneyDemo;
//玉山提款卡
public class 玉山criditCard implements CriditCard_interface{
	private String pws="123456";
	private int totalMoney=10000;
	private int 貸款=0;

	public String getPws() {
		return pws;
	}
	public void setPws(String pws) {
		this.pws = pws;
	}

	public int getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}

	public int get貸款() {
		return 貸款;
	}
	public void set貸款(int 貸款) {
		this.貸款 = 貸款;
	}
	
	
}
