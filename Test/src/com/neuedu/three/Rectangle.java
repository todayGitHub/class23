package com.neuedu.three;

public class Rectangle {
	public Rectangle(){
		
	}
	public Rectangle(int width, int length) {
		super();
		this.width = width;
		this.length = length;
	}
	int width;
	int length;
	void getArea(){
		System.out.println(this.width *this.length);
	}
	void getPer(){
		System.out.println((this.width +this.length)*2);
	}
	void showAll(){
		System.out.println(this.length);
		System.out.println(this.width);
		getArea();
		getPer();
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10,30);
		r.getArea();
		r.getPer();
		r.showAll();
		
	}
}
