package com.neuedu.oopfour;

public class Players {

	private static int sum ;
	
	
	private Players (){
		System.out.println("创建了一个对象");
		sum++;
	}
	
	public static Players create(){
		if(sum<11){
			return new Players();
		}else{
			System.out.println("对不起，已经创建了11个对象，不能再创建对象了");
			return null;
		}

	}
	public static void main(String[] args) {
		for (int i = 0; i < 13; i++) {
			create();
		}
	}
}
