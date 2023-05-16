package module_6_3_modifers.testPakage2;

import module_6_3_modifers.testPakage1.AreaA;

public class AreaC extends AreaA {

	public static void main(String[] args) {
		AreaA a=new AreaA();
//		a.a_private=10;		//無法使用
//		a.a=10;				//無法使用
//		a.a_protected=10;	//因為繼承自AreaA，應該要可以用?
		a.a_public=10;		//誰都能用

	}

}
