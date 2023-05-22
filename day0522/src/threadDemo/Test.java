package threadDemo;

public class Test {

	public static void main(String[] args) {

//Thread和主程式互相交錯
//		/***建立匿名(類別)的物件***/
//		Thread t1=new Thread() {
//			@Override
//			public void run() {
//				for (int i = 0; i < 10000; i++) {
//					System.out.println("感謝的正拳");
//				}
//			}
//		};
//		/***建立物件結束***/
//		
//		t1.start();
//		for (int i = 0; i < 10000; i++) {
//			System.out.println("感謝的正拳main");
//		}
		

//執行序行為觀察
		Thread t2=new Player_1();
		t2.start();

		for (int i = 0; i < 10000; i++) {
			System.out.println("感謝的正拳main");
		}
		

	}

}
