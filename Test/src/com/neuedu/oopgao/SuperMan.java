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
	
	
	//�г��󷽷� ����һ���ǳ�����
	//����������г��󷽷�Ҳ����û�г��󷽷�
	//�����಻���Ա�ʵ����
	
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
