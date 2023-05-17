package palindromeNumber;

public class Test {

	public static void main(String[] args) {
//        if(x<0){return false;}
        int digit;
        int x = 10;
        
        int z=0;	//填寫答案的index
        int length = 0;	//數字有幾位

        //找出最大位數
        int lengthdigitcounter=1;
        digit=1;
        for(int i=1;!(!(i<=20)||!((x-digit)>0));i++){
            while(lengthdigitcounter<=i){digit=10*digit;lengthdigitcounter++;}
            length=i;
        }
        System.out.println("位數是"+length);
        int[] ans=new int[length];
        //找出每個位數的數字，放入ans陣列
        for(int i=length;i>=0;i--){
            digit=1;
            int j=0;
            
            while(j<i){digit=10*digit;j++;}	//這裡j用來求出每輪的位數
            //這裡j用來求出該位數的數字
            for(j=1;j<=10;j++) {
            	
            	if(x-(digit*j)<0) {
            		System.out.println(x+"小於"+(digit*j));
            		System.out.println((digit)+"位數的數字是"+(j-1));  
            		if(j-1>0) {
            			ans[z] = j-1;
            			z++;
            			}
            		break;
            	}
            }
        	x=x-(digit*(j-1));
        	System.out.println("扣除"+(digit*(j-1))+"現在X是"+x);
            System.out.println(digit+"位數檢查結束\n"); 
        }
        
       for (int i : ans) {
			System.out.println(i);
		}
       System.out.println(ans.length/2);
       System.out.println(ans.length);
       for(int i=0;i<=(ans.length/2)-1;i++) {
    	   if(ans[i]!=ans[ans.length-(i+1)]) {
    		   System.out.println("不是回文");
    		   break;
    	   }
    	   System.out.println("是回文");
       }
       
       //
       
//len =5
//0 len	0 4	<-
//1 len-1	1 3	<-
//2 len-2	2 2	=-
//3 len-3 3 2	>
//12321 O
//12222 X
//
//len =6
//0 len	0 5 <-
//1 len-1	1 4 <-
//2 len-2	2 3 <- 
//3 len-3 3 2 >
//123321
//123421

//        System.out.println(ans[0]);
       
	}

}
