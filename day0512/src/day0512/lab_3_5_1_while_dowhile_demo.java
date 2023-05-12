package day0512;

public class lab_3_5_1_while_dowhile_demo {

	public static void main(String[] args) {

		int i=300;
		do {
			i=i+100;
		}while(i<300);
		System.out.println(i);	//後測迴圈先執行一次

		int j=300;
		while(j<300) {
			j=j+100;
		}
		System.out.println(j);	//前測迴圈先判斷才執行
		
	}

}
