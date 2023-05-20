package exceptionThrows;

public class TestNullCase {

	public static void main(String[] args) {
		
		String str=(Math.random()>=0.5)?null:"Hello";
		if(str!=null) {
			System.out.println("有文字可以呼叫方法");
		}else {
			System.out.println("沒有文字");
		}
		
	}

}
