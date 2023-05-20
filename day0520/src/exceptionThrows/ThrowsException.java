package exceptionThrows;

public class ThrowsException {

	public static void main(String[] args) {
		try {			
			進餐廳();
		}catch(Exception e) {
			System.err.println(e.getMessage());
			System.out.println("叫警察並提告");
		}
	}

	private static void 進餐廳() throws Exception {	//表示有機會拋出Exception，不一定會拋出
		System.out.println("進餐廳");
		
		//兩種例外處理
		try {										
			//String str = null;					//1. try-catch的例外處裡
			//System.out.println(str.endsWith(str));
			System.out.println("用餐");
			throw new Exception("看到蟑螂");			//2. 主動拋出的例外處理
			//System.out.println("用餐完畢");		//拋出後的程式就停止，後續動作不會執行需要刪除
		}catch(NullPointerException e){
			System.out.println("叫經理出來");
			return;
		}finally{
			System.out.println("結帳");
		}
		//System.out.println("離開餐廳");			//拋出後的程式就停止，後續動作不會執行需要刪除
	}

}
