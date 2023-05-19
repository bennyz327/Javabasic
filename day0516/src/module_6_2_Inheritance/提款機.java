package module_6_2_Inheritance;
//郵局提款機
public class 提款機 {
	public int getMoney(int money,CriditCard_interface criditCard) {
		criditCard.setTotalMoney(criditCard.getTotalMoney()-money);
		return money;
	}
}
