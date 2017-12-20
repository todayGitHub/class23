package com.neuedu.oopfour;

public class TestShape {
	public static void main(String[] args) {
		Shape r1 = new Rectangle(100, 300, "black");
		Shape c1 = new Circle(200,"red");	
		print(r1);
		print(c1);
	}
	
	public static void print(Shape r1){
		r1.getArea();
		r1.getArea();
		r1.showAll();
		if(r1 instanceof Circle){
			System.out.println(((Circle)r1).getRadius());
		}
		if(r1 instanceof Rectangle){
			System.out.println(((Rectangle)r1).getHeight());
		}
		
	} 
	
}
