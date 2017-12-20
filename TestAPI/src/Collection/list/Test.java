package Collection.list;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		al.add(1);
		al.add("$");
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(13);
		
		al.add(new Date());
		
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		
		Iterator it = al.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}
}
