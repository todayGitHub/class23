package Collection.list;

import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		al.add(2);
		al.add(3);
		al.add(2);
		al.add(1);
		
		al.remove(Integer.valueOf(2));
		for (int i = 0; i <al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
}
