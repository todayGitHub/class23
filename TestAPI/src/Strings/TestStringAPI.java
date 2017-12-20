package Strings;

public class TestStringAPI {
	public static void main(String[] args) {
		String s1 = new String("ASSDDsd12   3123@@1    ");
		
		//构造器
		//无参
		//通过字符数组创建
		//通过字符串创建字符串
		//通过字节数组创建 编码
		
		//常量不能改变值，StringBuffer、StringBuilder
		//构造器   appened   toString
		
		
		//无用篇
		System.out.println("你".compareTo("我"));
		System.out.println(s1.concat("123"));
		
		//字符串操作类型
		System.out.println(s1.replace("a", "x"));
		System.out.println(s1.substring(1,4));
		String s [] = s1.split("@");
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.trim());
		
		//字符串信息
		System.out.println(s1.isEmpty());
		System.out.println(s1.length());
		System.out.println(s1.equals("abc"));
		System.out.println(s1.equalsIgnoreCase("ABc"));
		
		//字符串转换数组
		char c [] = s1.toCharArray();
		byte b [] = s1.getBytes();
		
		
		//字符串内容相关 字符和下标
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf("ab"));
		System.out.println(s1.indexOf("a",0));
		System.out.println(s1.lastIndexOf("a"));		
		System.out.println(s1.contains("b"));
		System.out.println(s1.endsWith("abc"));
		System.out.println(s1.startsWith("ab"));
		
		
		System.out.println(s1.hashCode());
		
		
		
		
		
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		
		
		
		
		//System.out.println(s1.valueOf("123"));
		
		
		
		
		
		
		
	}

}
