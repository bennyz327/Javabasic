package day0512;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class module_3_2_Myscanner {

	public static void main(String[] args) {
		
//輸入遇到空格停止
//		Scanner sc=new Scanner(System.in);
//		String str = sc.next();
//		System.out.println(str);
//		sc.close();

		
//輸入遇到換行符號停止
//		Scanner sc=new Scanner(System.in);
//		String str = sc.nextLine();
//		System.out.println(str);
//		sc.close();

		
//彈出視窗給使用者輸入，會擷取完整字串
//		Scanner sc=new Scanner(System.in);
//		String str = JOptionPane.showInputDialog("請輸入文字");
//		System.out.println(str);
//		sc.close();
//有時間可以測試下面對話框
//		int opt=JOptionPane.showConfirmDialog(f,"YES_NO_CANCEL_OPTION","確認",
//        JOptionPane.YES_NO_CANCEL_OPTION,
//        JOptionPane.INFORMATION_MESSAGE);
		
		
//字串轉數值，自動轉換
		Scanner sc=new Scanner(System.in);
		String str = JOptionPane.showInputDialog("請輸入數字，不要輸入文字");
		Double dnum = Double.valueOf(str);
		//(parse)基本資料型別/(valueOf)參考資料型別(a){自動轉換(自動包裝)}
		System.out.println(dnum);
		sc.close();

	}

}
