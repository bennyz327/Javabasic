package day0512;

import javax.swing.JOptionPane;

public class module_3_4_controlFlow_switch {

	public static void main(String[] args) {
		
		String monthStr = JOptionPane.showInputDialog(null,"請輸入月份","",JOptionPane.INFORMATION_MESSAGE);
		int month = Integer.parseInt(monthStr);
		int monthcase = (month>12||month<1)?4:((month==2)?3:(month>7)?((month%2==0)?1:2):((month%2==0)?2:1));
		switch(monthcase) {
		//case 1,3,5,7,9:						//jdk14以上才能用
		case 1:
			System.out.println("有31天");
			break;
		case 2:
			System.out.println("有30天");
			break;
		case 3:
			System.out.println("有28天");
			break;
		default:
			break;
		}
		//不使用break的話，會在進入case之後不管case判斷，直接往下執行，直到break或是switch語句結束
		

	}

}
