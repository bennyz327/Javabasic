package day0512;

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
		

//		
		
		
//for的本質		
//		int i=0;
//		for(i++;ture;i++); 

	}

}
