package module_6_3_modifers.testPakage1;

public class AreaA {
	private int a_private;		//自己才能用
	int a;						//預設的修飾子，package內都能使用
	protected int a_protected;	//有繼承關係的可以用
	public int a_public;		//誰都能用
	
	public static void main(String[] args) {
		AreaA a=new AreaA();
		a.a_private=10;
		a.a=10;
		a.a_protected=10;
		a.a_public=10;
	}

}
