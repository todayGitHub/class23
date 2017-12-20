package Collection.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;



public class TestTreeSet {
	public static void main(String[] args) {
		Set ts = new LinkedHashSet();
//		Integer String
//		ts.add(3);
//		ts.add(4);
//		ts.add(5);
//		ts.add(1);
//		ts.add(2);
		Person p1 = new Person("haha1",6);
		Person p2 = new Person("haha2",5);
		Person p3 = new Person("haha3",4);
		Person p4 = new Person("haha4",3);
		Person p5 = new Person("haha5",2);
		Person p6 = new Person("haha6",1);
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		ts.add(p5);
		ts.add(p6);
		
		
		
		Iterator it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(((Person)it.next()).name);
			
		}
		
	}
}
