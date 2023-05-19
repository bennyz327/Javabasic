package module_6_2_Inheritance.moneyDemo;

public interface 提款機interface {

	default int getMoney(int money, CriditCard_interface criditCard) {
		criditCard.setTotalMoney(criditCard.getTotalMoney()-money);
		System.out.println("剩"+criditCard.getTotalMoney());
		return money;
	};

}