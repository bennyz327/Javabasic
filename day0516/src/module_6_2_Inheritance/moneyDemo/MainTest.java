package module_6_2_Inheritance.moneyDemo;

public class MainTest {

	public static void main(String[] args) {
		玉山銀行 m=new 玉山銀行();
		Banana提款機 b=new Banana提款機();
		criditCard pC=new criditCard();					//郵局提款卡 
		玉山criditCard mC=new 玉山criditCard();			//玉山提款卡 
		Banana_criditCard bC=new Banana_criditCard();	//banana提款卡 
		
//		m.getMoney(500, mC);	//在玉山提款機用玉山銀行卡
//		b.getMoney(500, bC);	//在Banana銀行用Banana銀行卡
		m.getMoney(500, bC);
		
		
		/* default總整理
		 * 為了解決功能重複性高，並減少coding時間
		 * 
		 * 問題點
		 * 		A介面	吃飯default方法;
		 * 		B介面	也有吃飯default方法;
		 * 		if C imp A,B
		 * 		吃飯的default方法有衝突
		 * 解法	把吃飯override;
		 * */
		
		/* 介面中也可以使用static方法，但是不建議，靈活性低
		 * static方法寫在類別能實體化，會比較好操作
		 * 
		 * 介面最好不要帶有任何功能，除非逼不得已*/
		
	}

}
