package module_6_2_Inheritance.moneyDemo;

public class Banana_criditCard implements CriditCard_interface {
	private String pws="123456";
	private int totalMoney=10000;
	private int 紅利=0;
	
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

	public int get紅利() {
		return 紅利;
	}
	public void set紅利(int 紅利) {
		this.紅利 = 紅利;
	}
	
	

}
