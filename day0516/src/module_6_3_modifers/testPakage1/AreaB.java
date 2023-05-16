package module_6_3_modifers.testPakage1;

public class AreaB {

	public static void main(String[] args) {
		AreaA a=new AreaA();
//		a.a_private=10;		//無法使用
		a.a=10;
		a.a_protected=10;
		a.a_public=10;

	}

}
