package threadDemo;

public class Player_1 extends Thread {
	
	public void getApple() {
		System.out.println("P1取得1個蘋果");

	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int p = 0; p < 100; p++) {
			this.getApple();
			System.out.println("P1有"+p+"個蘋果");
		}
	}

}
