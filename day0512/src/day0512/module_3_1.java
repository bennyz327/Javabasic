package day0512;

import java.util.Scanner;

public class module_3_1 {

	public static void main(String[] args) {
		
		//用scanner物件(?) 獲取使用者輸入的資料
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入年齡");
		//test
		String ageStr = sc.next();
		int age = Integer.parseInt(ageStr);
		
		if (age>18&age<80) {
			System.out.println("範圍內");
		}
		else {
			System.out.println("範圍外");
		}
		sc.close();
		
	}

}
