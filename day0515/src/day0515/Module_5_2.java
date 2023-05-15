package day0515;

public class Module_5_2 {

	public static void main(String[] args) {
		
//二維陣列(陣列裡面放陣列)
//		int[][] arr=
//			{{1,2,3},
//			 {4,5,6},
//			 {7,8,9}};
//		for (int i = 0; i < arr.length; i++) {
//			//System.out.println(arr[i]);				//不列出陣列名稱
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]);
//				if(j==(arr[i].length-1)){break;}		//判斷是否要加逗號
//				System.out.print(",");
//			}
//			System.out.println("");
//		}
//		
//不使用new的話，參考位置一樣會造成資料同步改變		
//		int[][] arr = new int[5][];
//		int[] a = {1,2,3,4,5};
//		arr[0]=a;
//		arr[1]=a;
//		arr[2]=a;
//		arr[3]=a;
//		arr[4]=a;
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//			System.out.print("\t");
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println("");
//		}
//		a[2] = 8;
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//			System.out.print("\t");
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println("");
//		}
//		
//用for each loop 遍歷陣列	
//		int[][] arr = new int[5][];
//		for (int i = 0; i < arr.length; i++) {
//			int[] a = {i*1,i*2,i*3};
//			arr[i]= a; 
//		}
//		for(int[] arr_1:arr) {
//			for(int i:arr_1) {
//				System.out.print(i+",");
//			}
//			System.out.println();
//		}
//	
//反轉陣列後放入新陣列
//		int[][] arr = {{1,2},{3,4},{5,6},{7,8}};
//		int[][] arr_new = new int[arr[0].length][arr.length];	//隨便選一個位置來定義新陣列的範圍
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr_new[j][i] = arr[i][j];						//放入反轉後的值
//			}
//		}
//		for (int i = 0; i < arr_new.length; i++) {				//印出結果
//			for (int j = 0; j < arr_new[i].length; j++) {
//				System.out.print(arr_new[i][j]);				
//			}
//			System.out.println("");
//		}	


	}

}