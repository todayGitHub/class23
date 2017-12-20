package com.neuedu.three;

public class Person {
	String name;
	double high;
	double tz;
	
	public Person(String name, double high, double tz) {
		super();
		this.name = name;
		this.high = high;
		this.tz = tz;
	}

	void sayHello(){
		System.out.println("hello my name is "+name);
	}
}
