package com.neuedu.three;

public class PersonCreate {
	public static void main(String[] args) {
		Person p1 = new Person("zhangsan", 1.73, 33);
		Person p2 = new Person("lisi", 1.74, 44);
		p1.sayHello();p2.sayHello();
	}
}
