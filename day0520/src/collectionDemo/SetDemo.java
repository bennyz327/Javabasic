package collectionDemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set myset=new HashSet();
		myset.add("Apple");
		myset.add("Banana");
		myset.add("Cat");
		System.out.println(myset);
		System.out.println(myset.size());
		
//		myset.clear();
//		System.out.println(myset.isEmpty());	//清空功能
		
	}

}
