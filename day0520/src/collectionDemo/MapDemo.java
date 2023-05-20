package collectionDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.naming.ldap.StartTlsResponse;

public class MapDemo {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		map.put("A", "Apple");
		map.put("B", "Banana");
		map.put("C", "Cat");
		System.out.println(map);
		System.out.println(map.get("A"));		//取值
		System.out.println(map.remove("C"));	//刪除值，拋出被刪除的值
		System.out.println(map.get("C"));		//刪除後取值會是NULL
		System.out.println(map.size());			//取map大小
		
		//2種Map的迭代方法
		System.out.println("\n利用Keyset");	
		Set<String> mapKeyset = map.keySet();
		for (Object o : mapKeyset) {
			System.out.println("key="+o+","+"value="+map.get(o));
		}
		System.out.println("\n利用Entry套件");
		Set<Entry<String,String>> mapEntryset = map.entrySet();
		for (Entry<String, String> e : mapEntryset) {
			System.out.print(e+"\t");
			System.out.println("key="+e.getKey()+","+"value="+e.getValue());
		}

	}

}
