package threadDemo;

public class Player_2_synchronized implements Runnable {
	static int total=100000;
	int i2 = 0;
	
	public static synchronized boolean getApple() {
//		System.out.println("P2取得1個蘋果");
		if(total>0) {
			total--;
			return true;
		}else {
			return false;
		}

	}
	
	@Override
	public void run() {
		while(getApple()) {
			i2++;
		}
		Thread currentThread=Thread.currentThread();
		System.out.println(currentThread.getName()+"有"+i2+"個蘋果");
	}

}
