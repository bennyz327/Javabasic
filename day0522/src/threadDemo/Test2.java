package threadDemo;

public class Test2 {

	public static void main(String[] args) {
		
		Runnable r1=new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("感謝的正拳runnable");
				}
			}
		};
		Thread t1=new Thread(r1);
		
		Thread t2=new Player_1();

		Thread t3=new Thread(new Player_2());
		
		//Lambda表示式
		Thread t4=new Thread(()-> {
			for (int i = 0; i < 100; i++) {
				System.out.println("嘿嘿");
			}
		});
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		for (int i = 0; i < 10000; i++) {
			System.out.println("感謝的正拳main");
		}
			
		
	}

}
