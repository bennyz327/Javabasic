package module_6_2_Inheritance;

public class mainTest_2 {

	public static void main(String[] args) {
		
//多形的運用
//		//用父類別宣告子類別
//		Animal an1=new Fish();
//		Animal an2=new human();
//		
//		//透過多型宣告的物件，只能使用父類別提供的方法
//		an1.breath();
//		an2.breath();
//		an1.新陳代謝();
//		an1.新陳代謝();
//		//就算an1屬於Fish類別，且於類別中有swim方法，因為是多型宣告仍然會無法使用
//		//an1.swim();		
//		
//instanceof X物件是不是Y類型的物件
		Animal a=Random_animal.creatAnimal();
		if(a instanceof Fish) {
			Fish f;
			f=(Fish)a;	//強制轉型
			f.swim();
		}else {
			human h;
			h=(human)a;
			h.swim();
		}
		a.breath();
	}

}
