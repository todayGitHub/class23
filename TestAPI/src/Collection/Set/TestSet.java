package Collection.Set;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

public class TestSet {
	
	
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add("123");
		hs.add(4);
		hs.add(new Date());
		System.out.println(hs.size());
		Object[]  o = hs.toArray();
		for (int i = 0; i < o.length; i++) {
			System.out.println(o[i]);
		}
		System.out.println("~~~~~~~~~");
		Iterator it1 = hs.iterator();
		while(it1.hasNext()){
			//System.out.println("��Ԫ��");
			System.out.println(it1.next());
		}
		
		
		
		
	}
}
