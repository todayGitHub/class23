package Map;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		//E a = 1;
		//���ٶ���װ��ɶ����װ
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
