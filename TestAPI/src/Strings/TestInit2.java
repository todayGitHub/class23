package Strings;

import java.io.UnsupportedEncodingException;

public class TestInit2 {
	public static void main(String[] args) throws UnsupportedEncodingException  {
		
		String s = "asd������";	
		byte b1 [] = s.getBytes("utf-8");
//		for (int i = 0; i < b1.length; i++) {
//			System.out.println(b1[i]);
//		}
		String siso8859 = new String(b1,"iso8859-1");
		System.out.println( siso8859);
		byte b2 [] = siso8859.getBytes("iso8859-1");
//		for (int i = 0; i < b2.length; i++) {
//			System.out.println(b2[i]);
//		}
		
		String sutf8 = new String(b2,"utf-8");
		System.out.println(sutf8);
		//System.out.println(getUtf8(s));
	
		
		
	}
	
	static String getUtf8(String s) throws UnsupportedEncodingException{
		String s1 = new String(s.getBytes("utf-8"),"iso8859-1");
		String s2 = new String(s1.getBytes("iso8859-1"),"utf-8");
		return s2;
	}
}
