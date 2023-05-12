package day0512;

import javax.swing.JOptionPane;

public class module_3_3_controlFlow {

	public static void main(String[] args) {
		
//基本判斷
//		String ageStr = JOptionPane.showInputDialog(null,"請輸入年齡","偽造年齡可能會觸法",JOptionPane.INFORMATION_MESSAGE);
//		int age = Integer.parseInt(ageStr);
//		if(age>=18) {
//			System.out.println("成年");
//		}else {
//			System.out.println("未成年");
//		}
		
//瀑布式流程控制
		String scoreStr = JOptionPane.showInputDialog(null,"請輸入成績","成績評語",JOptionPane.INFORMATION_MESSAGE);
		int score = Integer.parseInt(scoreStr);
		
		if(score>=60) {
			JOptionPane.showMessageDialog(null, "你的成績是"+score+"\n還不錯，繼續努力");
			if(score>=90) {
				JOptionPane.showMessageDialog(null, "你的成績是"+score+"\n很優秀，值得嘉獎");
			}
			}else if(score<50) {
				JOptionPane.showMessageDialog(null, "你的成績是"+score+"\n太慘了吧");
			}else {
				JOptionPane.showMessageDialog(null, "你的成績是"+score+"\n差點及格，下次加油");
			}

	}

}
