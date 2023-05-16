package module_6_2_Inheritance;

public class aKindOfFish extends Fish {
	
	@Override
	public void swim() {				//同樣名稱、同數量同型態參數，會變成覆寫
		super.swim();					
		System.out.println("可以遊");
	}
	public void 走失() {
		System.out.println("走失了");
	}
	
	/* 子類別會繼承父類別"公開、保護"，的變數、方法和建構子，父類別和祖父類別同理
	 * 
	 * 子類別如果叫祖父類別的方法，等於呼叫父類別中從祖父類別繼承下來的方法
	 * 若該方法為祖父類別的私有方法，則子類別則無法呼叫該方法，因為父類別沒有繼承到該方法
	 * 
	 * 若是父類別覆寫了從祖父類別繼承的方法，則子類別無法直接呼叫祖父類別的方法
	 * 真的需要乎叫祖父類別的方法，則方法才能呼叫*/

}
