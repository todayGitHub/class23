package com.neuedu.three;

public class School {
	public static void main(String[] args) {
		Student s1 = new Student("lilei", 68.5, 1);
		Student s2 = new Student("hanmeimei", 77, 2);
		Student s3 = new Student("fangfang", 98, 3);
		Student s4 = new Student("haha",89, 4);
		Student s5 = new Student("heihei", 32, 5);
		Student s6 = new Student("xixi", 67, 6);
		Student s7 = new Student("gaga",100, 7);
		Student s8 = new Student("hehe", 54, 8);
		Student s9 = new Student("liuliu", 21, 9);
		
		Student [] ss  = {s1,s2,s3,s4,s5,s6,s7,s8,s9};
		StudentSort(ss);
		
		//System.out.println(s1);
		//System.out.println(s2);
		
		
		
	}
	
	
	public static void StudentSort(Student [] ss){
		//ÅÅĞò
		Student temp;
		for (int i = 1; i < ss.length; i++) {
			for (int j = 0; j < ss.length-i; j++) {
				if(ss[j].compareTo(ss[j+1])){
					temp = ss[j];
					ss[j] = ss[j+1];
					ss[j+1] = temp;
				}
				
			}
	}
		
		for (int i = ss.length-1; i >= 0; i--) {
			System.out.println(ss[i].name+","+ss[i].cj+","+ss[i].id);
		}
	}
}
