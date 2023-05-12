package day2;

public class module_2_DataType {

	public static void main(String[] args) {
		
		byte b = 5;          //占用 4Bytes
                             //常用於網路資料傳輸的東西，老師沒有多講

		int a = 5;				//占用 4Bytes
		int a1 = 2147483647;	//最常用的整數表示法，上限是正負21億，不要用來儲存可能會超過上限的數字
	//	int a2 = 2147483648;	//超過大小限制，造成錯誤
		
		short c = 5;			//占用 2Bytes
								//以前為了節省記憶體而用，目前較少用
		
		long d = 5L;			//占用 8Bytes
		long d1 = 5678956789L;	//整數中範圍最大的型態，宣告時需要在最後加上L
		
		float e = 5f;			//占用 4Bytes
								//用來儲存浮點數，範圍比Double小，具體可以參考課本，宣告時需要在最後加上f
		
		double f = 5D;			//占用 8Bytes
								//用來儲存浮點數，範圍比Float大，具體可以參考課本，宣告時最後加上的D，可加可不加
		//因二進制儲存方式的原因，，Float和Double不推薦直接進行計算，會出現誤差，解法可參考lab_2_1_BigDecimal
		
		char g = 'a';			//占用 2Bytes
		char g1 = 65500;		//用來儲存單一字元，字元需要使用單引號包起來，也可以賦值0~65535，會出現相應的字元
		char g2 = '\u6543';		//支援unicode，範圍0000~ffff
		
		boolean h = true;		//占用 1"bit"
		
		System.out.println(a);
		System.out.println(a1);
		System.out.print('\n');
		System.out.println(b);
		System.out.print('\n');
		System.out.println(c);
		System.out.print('\n');
		System.out.println(d);
		System.out.println(d1);
		System.out.print('\n');
		System.out.println(e);
		System.out.print('\n');
		System.out.println(f);
		System.out.print('\n');
		System.out.println(g);
		System.out.println(g1);
		System.out.println(g2);
		System.out.print('\n');
		System.out.println(h);
		
	}

}
