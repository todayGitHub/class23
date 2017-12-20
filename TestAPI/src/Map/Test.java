package Map;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		//E a = 1;
		//多少都能装，啥都能装
		al.add("123");
		al.add("123");
		al.add("123");
		al.add("123");
		al.add("123");
		al.add("123");
		al.add("123");
		//al.add(1);
		
		for (String string : al) {
			System.out.println(string.trim());
		}
	}
}
