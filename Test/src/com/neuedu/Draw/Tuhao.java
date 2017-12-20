package com.neuedu.Draw;

public class Tuhao extends Object{
	String name;
	double money = 100000;
	
	double pay(){
		this.money = this.money - 1000;
		return 1000;
	}
	
	public Tuhao(){
		pay();
	}
	
	public Tuhao(int a){
		this();
	}
	public int  say()
	{ System.out.print("Hi"); 
		return 2; 
	} 
	
	
	

}
