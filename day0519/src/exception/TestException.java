package exception;

import javax.swing.JOptionPane;

public class TestException {

	public static void main(String[] args) {
		
		/*
		 * JAVA中例外分為兩大類
		 * RunTimeException
		 * Checked Exception*/

		/*
		 * 各種例外狀況
		 * 空指標例外(調null物件的方法)
		 * 超出索引值例外
		 * 算術例外(除0)
		 * 找不到檔案例外
		 * 資料庫例外		
		 * 無法分類的例外*/
		
		
//用day0512寫的猜數字遊戲為例
		int ans = (int)(Math.random()*100+1);
game:	do{
			String numStr = JOptionPane.showInputDialog(null,"請輸入數值\n輸入exit可以離開遊戲","1-100猜數字",JOptionPane.INFORMATION_MESSAGE);
			if("exit".equals(numStr)==true) {break game;}
			
			int num=0;
			
			///增加例外處理
			try {
				num = Integer.parseInt(numStr);
			}catch(NumberFormatException e) {
//				e.printStackTrace();					//顯示錯誤名稱
				System.out.println(e.getMessage());		//顯示錯誤名稱
				System.out.println("輸入錯誤");
				if(e.getMessage()=="null") {
					System.out.println("別輸入空值");
					break game;}
				if (numStr.isEmpty()) {
					System.out.println("別輸入空值");
				    continue;}
				continue;
			}
			///增加例外處理結束
			
			num = Integer.parseInt(numStr);
			
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
//猜數字結束

	}

}
