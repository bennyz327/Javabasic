package module_6_2_Inheritance;

public class human extends Animal implements Swimmer {
//public class human implements Animal_interface {	//直接改介面實作寫法，不推薦

	@Override
	public void breath() {
		System.out.println("用肺呼吸");

	}
	public void swim() {
		System.out.println("人的游泳");
		
	}

}
