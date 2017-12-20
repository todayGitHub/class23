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
	
	public  boolean  compareTo(Student 应该不如我的学生){
		if(this.cj>=应该不如我的学生.cj){
			return true;
		}else {
			return false;
		}
		
	}
	
}
