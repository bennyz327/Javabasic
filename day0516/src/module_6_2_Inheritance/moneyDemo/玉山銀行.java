package module_6_2_Inheritance.moneyDemo;

public class 玉山銀行 implements 提款機interface,提款機interface2 {	
//玉山提款機
	
//若每個型態都有一樣的需要，可以在介面使用default就來達到省略的功能
//	public int getMoney(int money,CriditCard_interface criditCard) {
//		criditCard.setTotalMoney(criditCard.getTotalMoney()-money);
//		return money;
//	}
//	
//若實作多個介面時有方法的名稱產生歧意，可以讓IDE自動生成解決語法
	@Override
	public int getMoney(int money, CriditCard_interface criditCard) {
		return 提款機interface.super.getMoney(money, criditCard);
	}
//解決衝突的語法結束
	
	public int 貸款(int money,玉山criditCard criditCard) {
		criditCard.set貸款(money);
		return money;
	}

}
