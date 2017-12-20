package com.neuedu.Draw;

public class Drawer {
	
//	String name;
	double money;
	
	
	String name;
	public Drawer(String name, double money) {
		super();
		this.name = name;
		this.money = money;
	}




	void draw(double money){
		if(money>=1000){
			this.money = this.money+money;
			System.out.println(this.name+"画了"+"山水美人");
		}
		
	}
}
