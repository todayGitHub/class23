package com.neuedu.oopfour;

public class Players {

	private static int sum ;
	
	
	private Players (){
		System.out.println("������һ������");
		sum++;
	}
	
	public static Players create(){
		if(sum<11){
			return new Players();
		}else{
			System.out.println("�Բ����Ѿ�������11�����󣬲����ٴ���������");
			return null;
		}

	}
	public static void main(String[] args) {
		for (int i = 0; i < 13; i++) {
			create();
		}
	}
}
