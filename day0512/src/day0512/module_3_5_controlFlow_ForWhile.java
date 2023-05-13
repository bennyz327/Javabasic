package day0512;

import javax.swing.JOptionPane;

public class module_3_5_controlFlow_ForWhile {

	public static void main(String[] args) {

//標準for迴圈					
//		for (int i=0 ; i<100 ; i++) {
//			System.out.println(i);
//		}	
//上下效果相同
//		int i=0;
//		for (;;) {
//			System.out.println(i);
//			i++;
//			if(i<100) {}else {break;}
//		}	

		
//疊加完成之後顯示X1+i=X2
//		int total=0;
//		for(int i=0 ; i<=100 ; i++) {
//			System.out.println(total+"+"+i+"="+(total+i)+"");
//			total=total+i;
//		}
		
		
//經典十九十九乘法迴圈
//*一般寫法*/
//		for(int i=1; i<=19; i++) {
//			for(int j=2; j<=19; j++) {
//				System.out.print(j+"X"+i+"="+(j*i)+"\t\t");
//				if(i<10&&j<10) {
//					System.out.print("\t");
//				}
//			}
//			System.out.println("");
//		}
//*格式化寫法*/	
//		for(int i=1; i<=19; i++) {
//			for(int j=2; j<=19; j++) {
//			System.out.printf("%02dX%02d=%03d\t",j,i,(j*i));
//			}
//			System.out.println("");
//		}
		

//break和continue用法
//內層迴圈遇到6就跳出該迴圈
//		for(int i=1; i<=19; i++) {
//			for(int j=2; j<=19; j++) {
//				System.out.printf("%02dX%02d=%03d\t",j,i,(j*i));
//				if(j>5)break;/*只有一個指令可以省略大括號*/
//			}
//			System.out.println("");
//			
//		}
//內層迴圈遇到5就跳出該迴圈的"那次迴圈"，導致不會秀出乘法表5的那列
//		for(int i=1; i<=19; i++) {
//			for(int j=2; j<=19; j++) {
//				if(j==5)continue;
//				System.out.printf("%02dX%02d=%03d\t",j,i,(j*i));
//			}
//			System.out.println("");
//		}

		
//fot搭配標籤語法
//		tag:for(int i=1; i<=19; i++) {
//			for(int j=2; j<=19; j++) {
//				/*if(j==5)break tag;	可以直接break指定的標籤的迴圈*/
//				/*if(j==5)continue tag;	可以直接continue指定的標籤的迴圈*/
//				System.out.printf("%02dX%02d=%03d\t",j,i,(j*i));
//			}
//			System.out.println("");
//		}
		
		
//for的本質
//		for(;;);
		
		
//While用例
//		int ans = (int)(Math.random()*100+1);	//強制轉型會捨去小數點
//		String numStr = JOptionPane.showInputDialog(null,"請輸入數值\n輸入exit可以離開遊戲","1-100猜數字",JOptionPane.INFORMATION_MESSAGE);
//		while(!numStr.equals("exit")) {
//			int num = Integer.parseInt(numStr);
//			if(num>ans) {
//				System.out.println("小一點");
//			}
//			if(num<ans){
//				System.out.println("大一點");
//			}
//			if(num==ans) {
//				System.out.println("答對了");
//				break;
//			}
//			numStr = JOptionPane.showInputDialog(null,"請輸入數值\n輸入exit可以離開遊戲","1-100猜數字",JOptionPane.INFORMATION_MESSAGE);
//		}

			
//do-while寫法
		int ans = (int)(Math.random()*100+1);
game:	do{
			String numStr = JOptionPane.showInputDialog(null,"請輸入數值\n輸入exit可以離開遊戲","1-100猜數字",JOptionPane.INFORMATION_MESSAGE);
			if("exit".equals(numStr)==true) {break game;}
			while(!numStr.matches("\\d*")||numStr.matches("")) {
	            System.out.println("請輸入數字");
	            numStr = JOptionPane.showInputDialog(null,"請輸入數值\n輸入exit可以離開遊戲","1-100猜數字",JOptionPane.INFORMATION_MESSAGE);
			}
			int num = Integer.parseInt(numStr);
			
//不太會用	try{
//				String numStr = JOptionPane.showInputDialog(null,"請輸入數值\n輸入exit可以離開遊戲","1-100猜數字",JOptionPane.INFORMATION_MESSAGE);
//				int num = Integer.parseInt(numStr);
//			}catch(java.io.IOException ex) {
//				ex.printStackTrace() ;
//			}
			
			if(num>ans) {
				System.out.println("小一點");
			}
			if(num<ans){
				System.out.println("大一點");
			}
			if(num==ans) {
				System.out.println("答對了");
				break;
			}
		}while(true);
		
		/*
		 * while與do-while意義上的差別
		 * while	屬於前測迴圈，是在執行 前 測試條件的迴圈
		 * do-while	則是後測迴圈，是在執行 後 測試條件的迴圈*/	

		
	}

}
