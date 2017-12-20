package com.neuedu.oopfour;

public class Vehicle {
	private String brand;
	private String color;
	private double speed;
	public Vehicle(String brand, String color) {
		super();
		this.brand = brand;
		this.color = color;
		this.speed = 0;
	}
	public String getBrand() {
		return brand;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public void run(){
		System.out.println("һ��"+this.color+"��ɫ��"+this.brand+"���ӵ�����������ÿСʱ"+this.speed+"���ٶȷɱ�����");
		
	}
	public static void main(String[] args) {
		new Vehicle("benz", "black").run();
		new Car("Honda","red",2).run();
	}
	
}


class Car extends Vehicle{
	private int loader;

	public Car(String brand, String color, int loader) {
		super(brand, color);
		this.loader = loader;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("���ܵ�ͬʱ����װ��"+this.loader+"����");
	}
	
	
}
