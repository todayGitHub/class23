package Collection.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(23);
		l.add(1);
		l.add(3);
		l.add(79);
		l.add(4);
		Collections.sort(l);
		System.out.println(l);
		int [] a = {1,3,234,213,123};
		Arrays.sort(a);
		for (int i : a) {
			System.out.println(i);
		}
		
		for (int j = 0 ;j<a.length ;j++){
			System.out.println();
		}
		
		for (Object i : l) {
			System.out.println(i);
		}
	}
}
