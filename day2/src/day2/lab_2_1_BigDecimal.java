package day2;

import java.math.BigDecimal;

public class lab_2_1_BigDecimal {

	public static void main(String[] args) {
		
	      double a = 0.1;
	      double b = 0.2;
	      System.out.println("錯誤的\t0.1 + 0.2 = " + (a+b));	//浮點數直接相加會產生誤差
	      
	      BigDecimal BIGa = new BigDecimal("0.1");
	      BigDecimal BIGb = new BigDecimal("0.2");
	      BigDecimal result = BIGa.add(BIGb);
	      System.out.println("正確的\t0.1 + 0.2 = " + result);	//透過BigDecimal類別可以達成精確計算

	}
	
}
