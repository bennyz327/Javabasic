package module_6_2_Inheritance;

public  class Random_animal {
	
	public static Animal creatAnimal() {
		int i=(int)(Math.random()*100+1);
		return (i>50)?new Fish():new human();
	}
	
}
