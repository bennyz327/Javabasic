package module_6_2_Inheritance;

public class Fish extends Animal{
	
	//若父類別是一個抽象類別，則子類別就必須實作出這個方法，否則會報錯
	public void breath() {
		System.out.println("可以用腮呼吸");
	}
	
	public void swim() {
		System.out.println("魚的游泳");
	}
	public void eat() {
		System.out.println("魚的吃吃");
	}

}
