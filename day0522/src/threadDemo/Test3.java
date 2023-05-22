package threadDemo;

public class Test3 {

	public static void main(String[] args) {
		Thread t1=new Thread(new Player_2_synchronized(),"A");
		Thread t2=new Thread(new Player_2_synchronized(),"B");
		t1.start();
		t2.start();
	}

}
