package com.neuedu.oopfour;

public abstract class Shape {
	private double area;
	private double per;
	private String color;
	public Shape() {
		super();
	}
	public Shape(double area, double per, String color) {
		super();
		this.area = area;
		this.per = per;
		this.color = color;
	}
	public void  setColor(String color){
		this.color = color;
	}
	public void  getColor(){
		System.out.println(this.color);
	}
	abstract public void  getPer();
	abstract public void  getArea();
	abstract public void  showAll();
}


class Rectangle extends Shape{
	private double width;
	private double height;
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Rectangle(double width, double height,String color) {
		super();
		this.width = width;
		this.height = height;
		super.setColor(color);
	}

	public Rectangle() {
		super();
	}

	@Override
	public void getPer() {
		// TODO Auto-generated method stub
		System.out.println((height+width)*2);
	}

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println(height*width);
	}

	@Override
	public void showAll() {
		// TODO Auto-generated method stub
		getArea();
		getPer();
		System.out.println(height );
		System.out.println(width );
		getColor();
	}
	
}

class Circle extends Shape{
	private double radius;
	
	public Circle() {
		super();
	}
	
	

	public Circle(double radius,String color) {
		super();
		this.radius = radius;
		super.setColor(color);
	}



	@Override
	public void getPer() {
		// TODO Auto-generated method stub
		System.out.println(2*radius*Math.PI);
	}

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println(radius*radius*Math.PI);
	}

	@Override
	public void showAll() {
		// TODO Auto-generated method stub
		getArea();
		getPer();
		System.out.println(radius );
		getColor();
	}



	public double getRadius() {
		return radius;
	}



	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}


	

