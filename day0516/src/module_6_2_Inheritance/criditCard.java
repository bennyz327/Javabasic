package module_6_2_Inheritance;
//郵局提款卡
public class criditCard implements CriditCard_interface {
	private String pws="123456";
	private int totalMoney=10000;

	@Override
	public String getPws() {
		return pws;
	}
	@Override
	public void setPws(String pws) {
		this.pws = pws;
	}

	@Override
	public int getTotalMoney() {
		return totalMoney;
	}
	@Override
	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}
	
}
