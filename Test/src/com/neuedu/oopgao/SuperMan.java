package com.neuedu.oopgao;

public  class SuperMan  implements fly,B{
	void sayHello(){
		System.out.println("hello");
	}

	@Override
	public int fly() {
		// TODOAuto-generated method stub
		return 1;
	}
	
	
	//有抽象方法 的类一定是抽象类
	//抽象类可以有抽象方法也可以没有抽象方法
	//抽象类不可以被实例化
	
	public static void main(String[] args) {
		fly f =  new SuperMan();
		System.out.println(f.a);
		f.hehe();
		
	}

	@Override
	public void hehe() {
		// TODO Auto-generated method stub
		System.out.println("123");
	}
	
	
}
