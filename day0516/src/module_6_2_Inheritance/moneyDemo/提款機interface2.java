package module_6_2_Inheritance.moneyDemo;

public interface 提款機interface2 {
	
//用來測試設定相同名稱的default產生的歧意
	default int getMoney(int money, CriditCard_interface criditCard) {
		criditCard.setTotalMoney(criditCard.getTotalMoney()-money);
		System.out.println("剩"+criditCard.getTotalMoney()+"\t(第二個的提款介面)");
		return money;
	};

}
