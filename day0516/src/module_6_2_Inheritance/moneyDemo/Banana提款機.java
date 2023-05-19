package module_6_2_Inheritance.moneyDemo;

public class Banana提款機 implements 提款機interface {
//Banana提款機
	
	@Override
	public int getMoney(int money, CriditCard_interface criditCard) {
		criditCard.setTotalMoney(criditCard.getTotalMoney()-money);
		if(criditCard instanceof Banana_criditCard) {
			((Banana_criditCard)criditCard).set紅利((((Banana_criditCard)criditCard).get紅利())+money/100);
		}
		System.out.println("Banana帳戶剩"+criditCard.getTotalMoney());
		System.out.println("您的紅利點數是:"+((Banana_criditCard)criditCard).get紅利());
		return money;
	}

}
