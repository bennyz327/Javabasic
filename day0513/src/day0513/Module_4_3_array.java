package day0513;

public class Module_4_3_array {

	public static void main(String[] args) {

//陣列宣告
//		//2種陣列宣告法
//		int[] arr1=new int[8];
//		//int[] arr1=new int[2147483648];					//超過範圍報錯，也不能放長整數
//		//int[] arr1=new int[2147483648L];				//也不能改放長整數		
//		int[] arr2= {1,2,3,4,5,6,7,8};
//		
//		//可以是布林或其他型態
//		boolean[] barr1= {true,true,true,true,true};	
//		
//		//代表陣列的中括號，可以寫在"型態"或是"變數"的名稱後面
//		int[] arrfront= {1,2,3,4};
//		int arrback[]= {1,2,3,4};
//		
//		//可以創建沒有物件的陣列
//		boolean[] barrNull= null;
//		int[] arrNull= null;
//		
//		//迴圈放值
//		for (int i = 0; i < arr1.length; i++) {
//			arr1[i]=i;
//			System.out.println("放了"+arr1[i]+"進去陣列");
//		}
//		
//		//延伸:陣列裡面再放陣列 
//		int[][] arrinarr=new int[8][8];
		
		
//一維陣列
		int[] arr1 = new int[8];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=i;
		}
		//直接取值
		System.out.println(arr1[7]);
		//利用"屬性"取值，取得陣列長度
		System.out.println(arr1.length);
		
	}

}
