package day2;

public class module_3_EscapeCharacter {

	public static void main(String[] args) {

		/*
		 * 使用跳脫字元來運用一些會造成編譯問題的文字*/
		
		System.out.println("姓名\t性別\t職稱");	//使用"\t"可以達成一定程度的對齊
		System.out.println("王曉明\t男性\t學生");

		/*
		 * 其他跳脫字元還有
		 * "\""				雙引號
		 * "\r" "\n" "\r\n"	換行
		 * "\'"				單引號
		 * "\+u" (去掉+號)	unicode
		 * "\\"				反斜線
		 * */
	}

}
