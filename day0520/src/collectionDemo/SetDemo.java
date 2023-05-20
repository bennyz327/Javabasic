package collectionDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set myset=new HashSet();
		myset.add("Apple");
		myset.add("Banana");
		myset.add("Cat");
		
//		System.out.println(myset);
//		System.out.println(myset.size());
		
//		myset.clear();								//清空功能
//		System.out.println(myset.isEmpty());
		
//		System.out.println(myset.contains("Cat"));	//查詢確認後刪除
//		System.out.println(myset.remove("Cat"));
//		System.out.println(myset);
		
		for (Object object : myset) {				//取出方法用ForEach
			System.out.println(object);
		}
		
		
		
	}

}
