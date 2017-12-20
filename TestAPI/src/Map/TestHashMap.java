package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import Collection.list.Iterator;

public class TestHashMap {
	public static void main(String[] args) {
		Map m1 = new TreeMap();
		
		
		m1.put("haha3", "xixi3");
		m1.put("haha1", "xixi1");
		m1.put("haha2", "xixi2");
		
		m1.put("haha4", "xixi4");
		m1.put("aaha4", "xixi4");
//		m1.put(1, "111");
//		m1.put(null, null);
//		System.out.println(m1.size());
//		System.out.println(m1.containsKey("haha"));
//		System.out.println(m1.get("haha"));
//		System.out.println(m1.remove("haha"));
//		System.out.println(m1.size());
//		
		
		//不建议遍历：性能差
		Set s =  m1.keySet();
		java.util.Iterator it = s.iterator();
		while (it.hasNext()) {
			 System.out.println(m1.get(it.next()));
			
		}
		
		Set se = m1.entrySet();
		java.util.Iterator ite = se.iterator();
		while(ite.hasNext()){
			Map.Entry me = ((Map.Entry)ite.next());
			System.out.println(me.getKey()+"   "+ me.getValue());
			
		}
		
	}
}
