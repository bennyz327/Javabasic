package threadDemo;

public class SleepDemo {

	public static void main(String[] args) {
		System.out.println("請等5秒");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("再見");
	}

}
