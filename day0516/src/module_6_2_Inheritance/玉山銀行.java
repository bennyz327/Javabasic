package module_6_2_Inheritance;
//玉山提款機
public class 玉山銀行 {
	public int getMoney(int money,CriditCard_interface criditCard) {
		criditCard.setTotalMoney(criditCard.getTotalMoney()-money);
		return money;
	}
	public int 貸款(int money,玉山criditCard criditCard) {
		criditCard.set貸款(money);
		return money;
	}
}
