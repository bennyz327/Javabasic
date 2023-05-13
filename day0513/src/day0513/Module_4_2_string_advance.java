package day0513;

import javax.swing.JOptionPane;

public class Module_4_2_string_advance {

	public static void main(String[] args) {
		
//正則表達式
//		System.out.println(" ".matches("\\s"));
//		System.out.println("a".matches("\\w"));
//		System.out.println("match any char".matches(".............."));
//		
//		System.out.println("boooooook".matches("b.*k"));
//		System.out.println("bk".matches("b.+k"));			//false
//		System.out.println("bok".matches("b.+k"));			//true
//		System.out.println("boooooook".matches("b.+k"));	//true
//		
		String idInput = JOptionPane.showInputDialog("請輸入身分證字號");
		System.out.println("[A-Z]{1}[12]{1}[0-9]{8}".matches(idInput));			
//
//		/*
//		 * 表字元種類
//		 * \s		符合空格
//		 * \w		符合包括底線的任何單字元
//		 * .		任一字元
//		 * []		指定字元
//		 * [abcde]	指定字元為abcde其中一個
//		 * [A-Z]	類推
//		 * [a-z]	類推
//		 * [0-9]	類推
//		 * $$和^		可以配合[]做出範圍篩選	[A-Z%%[^B-C]]
//		 * 
//		 * 表次數
//		 * *		代表0次~多次
//		 * ?		代表0次~1次
//		 * +		代表1次~多次
//		 * {n,m}	代表n次~m次
//		 * {n}		剛好n個
//		 * {n,}		n個以上
//		 * {0,n}	n個以下
//		 * */
		
		
//字串格式化	
//		String name="benny";
//		int weightKg=50;
//		double hightCm=20.5;
//		
//		//println格式
//		System.out.println("張三的體重是50公斤，身高20.5公分。");	
//		
//		//format格式
//		String formatString = String.format("%s的體重是%d公斤，身高%.1f公分。",name,weightKg,hightCm);	
//		System.out.println(formatString);
//		
//		//format格式，單行
//		System.out.printf("%s的體重是%d公斤，身高%.1f公分。", name,weightKg,hightCm);
//		
//		/*
//		 * %+06.2f
//		 * %(06.2f
//		 * +	代表顯示正負號
//		 * 6	指定總字元數
//		 * 0	代表空位元補零
//		 * .2	代表最多顯示小數後幾位
//		 * (	代表負數會被去除負號後被括號包起來
//		 * -	向左對其
//		 * 
//		 * %,d
//		 * ,	代表千位分隔逗號
//		 * */
		
	}

}
