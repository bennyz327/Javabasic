package module_6_2_Inheritance;

public class mainTest {
	
	//一般的block	建立物件的時候會執行一次，走建構方法前會執行這塊
	{
		System.out.println("HW");
	}
	
	//static block	類別被呼叫時會執行一次，並且不會執行第二次
	static {
		System.out.println("HW static");
	}

	
	public static void main(String[] args) {
		
		//繼承父類別的子類別創造的物件可以擁有父類別定義的方法
		//父類別創造的物件則不能使用子類別定義的方法
		aKindOfFish fish01=new aKindOfFish();
		fish01.swim();
		fish01.eat();
		fish01.走失();
		Fish fish02=new Fish();
		fish02.swim();
		fish02.eat();
		//無法使用子類別定義的方法
		//fish02.走失();
		
		//調用規則
		//non-static	=> 	static、non-static(類別內)
		//static 		=>	static
		
	}

}
