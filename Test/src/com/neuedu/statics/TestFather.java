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
		System.out.println("�вε�father������");
	}
	
	public Father(){
		super();
		a = 1;
		System.out.println("�޲ε�father������");
	}
	
	void haha(){
		System.out.println("father��haha ���� "+ name+","+ sex);
	}
	static void hehe(){
		
		System.out.println("father��hehe ���� "+","+ sex);
	}
	
	{
		System.out.println("father����ͨ������");
	}
	static{
		sex = '1';
		System.out.println("father�ľ�̬������"+sex);
	}
	
	void byebye(){
		System.out.println("father��byebye"+name);
	}
}

class Children extends Father{
	
	static char sex ;
	int age;
	
	
	
	public Children(String name, int age) {
		super(name);
		this.age = age;
		System.out.println("Children ���вι�����");
	}

	{
		System.out.println("Children����ͨ������");
	}
	static{
		System.out.println("Children�ľ�̬������"+sex);
	}
	
	public Children(){
		super();
		System.out.println("�޲ε�Children������");
	}
	static void hehe(){
		System.out.println("Children��hehe ���� "+","+ sex);
	}
	
	void haha(){
		System.out.println("Children��haha ���� "+ name+","+ sex);
	}
	
}
