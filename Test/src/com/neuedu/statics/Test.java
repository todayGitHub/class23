package com.neuedu.statics;

public class Test {
	public static void main(String[] args) {
		Chinese c1 = new Chinese();
		Chinese c2 = new Chinese();
//		c1.gj = "haha";
//		System.out.println(c1.gj);//haha
//		System.out.println(c2.gj);// null
//		c2.gj = "hehe";
//		System.out.println(c1.gj);//haha
//		System.out.println(c2.gj);//hehe
		
		c1.hehe();
		Chinese.byebye();
		
		//static修饰的东西都可以被类名. ;也可以被对象.  ；但是非static只能被对象.
		//static 只能修饰类的成员，不能修饰局部内的任何东西
	}
}


class Chinese{
	String name;
	static String gj;
	void hehe(){
		int a =1;
		System.out.println(this);
		
	}
	
	static void byebye(){
//		System.out.println(super);
	}
}