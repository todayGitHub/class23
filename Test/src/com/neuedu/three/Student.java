package com.neuedu.three;

public class Student {
	String name;
	double cj;
	int id;
	public Student(String name, double cj, int id) {
		super();
		this.name = name;
		this.cj = cj;
		this.id = id;
		
	}
	
	public  boolean  compareTo(Student Ӧ�ò����ҵ�ѧ��){
		if(this.cj>=Ӧ�ò����ҵ�ѧ��.cj){
			return true;
		}else {
			return false;
		}
		
	}
	
}
