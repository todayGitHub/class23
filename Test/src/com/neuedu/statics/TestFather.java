package com.neuedu.statics;

public class TestFather {
	public static void main(String[] args) {
//		new Father("haha");
//		new Father("haha");
		new Children("asd", 1);
	}
}


class Father{
	final int a ;
	String name;
	static char sex;
	public Father(String name) {
		this();
		this.name = name;
		System.out.println("有参的father构造器");
	}
	
	public Father(){
		super();
		a = 1;
		System.out.println("无参的father构造器");
	}
	
	void haha(){
		System.out.println("father的haha 方法 "+ name+","+ sex);
	}
	static void hehe(){
		
		System.out.println("father的hehe 方法 "+","+ sex);
	}
	
	{
		System.out.println("father的普通匿名块");
	}
	static{
		sex = '1';
		System.out.println("father的静态匿名块"+sex);
	}
	
	void byebye(){
		System.out.println("father的byebye"+name);
	}
}

class Children extends Father{
	
	static char sex ;
	int age;
	
	
	
	public Children(String name, int age) {
		super(name);
		this.age = age;
		System.out.println("Children 的有参构造器");
	}

	{
		System.out.println("Children的普通匿名块");
	}
	static{
		System.out.println("Children的静态匿名块"+sex);
	}
	
	public Children(){
		super();
		System.out.println("无参的Children构造器");
	}
	static void hehe(){
		System.out.println("Children的hehe 方法 "+","+ sex);
	}
	
	void haha(){
		System.out.println("Children的haha 方法 "+ name+","+ sex);
	}
	
}
