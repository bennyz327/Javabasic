package collectionDemo;

import java.util.ArrayList;
import java.util.List;
//ctrl+shift+o	快速import

public class ListDemo {

	public static void main(String[] args) {

		List<String> list1=new ArrayList<>();		//加上泛型
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Cat");
		list1.add(1,"Duck");						//插入該索引值，後面的元素則往後推
		
		for (String string : list1) {				//用泛型，就能指定物件類別為字串
			System.out.println(string);
		}
		//list1.add(1.2);							//也能防止不同的資料型態加進來
		
		
//		System.out.println(list1);
//		System.out.println(list1.get(2));			//拿出索引值2的元素
//		System.out.println(list1.remove("yanana"));	//移除該名稱的的元素，並回傳是否成功刪除的布林值
//		System.out.println(list1.remove(0));		//移除該索引值的元素，並回傳該索引值的元素		
//		System.out.println(list1);
		
//		System.out.println(list1);
//		System.out.println(list1.indexOf("Cat"));	//查詢該值的索引
//		System.out.println(list1.set(4, "Egg"));	//取代該索引值的值，並回傳原本位置的元素
//		System.out.println(list1);
		
		
//自動裝箱讓基本資料型別也可以直接放到List或使用其他的方法
//		Integer i=10;	//自動裝箱	(JDK>1.5)
//		int i2=i;		//自動拆箱
//		System.out.println(i.getClass().getName());
	}

}
