package Strings;

public class TestQuick {
	public static void main(String[] args) {
		String s1 = "abc";
//		for (int i = 0; i < 100000; i++) {
//			StringBuffer sbs = new StringBuffer(s1);
//			sbs.append(1);
//			s1 = sbs.toString();
//		}
//		
		
		
//		for (int i = 0; i < 1000000; i++) {
//			s1 = s1+i;
//		}
//		StringBuffer
		StringBuilder sb = new StringBuilder("abc");
//		for (int i = 0; i < 10000; i++) {
//			sb.append(i);
//		}
		
		System.out.println(sb);
	}
}
