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
		
		//static���εĶ��������Ա�����. ;Ҳ���Ա�����.  �����Ƿ�staticֻ�ܱ�����.
		//static ֻ��������ĳ�Ա���������ξֲ��ڵ��κζ���
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