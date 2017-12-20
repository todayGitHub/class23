package com.neuedu.oop;

public class Person {
//	
//	模拟人的一生
//	人 应该有名字，性别，年龄
//	人的一声应该先跟世界打个招呼，获取一个名字，过了一些年，
 //过年：20岁钱过年收红包，20岁之后给红包 ，有辛酸，有快乐，有痛苦
//	如果是男的就60岁退休，女的就55退休，
//	最后在等待一些年 就可以，100 之后就可以88了
	
	String name ="haha";
	int age;
	char sex;
	
	
	
	public Person(String a, int b, char c) {
		
		this.name = a;
		age = b;
		sex = c;
	}

	void sayHello(){
		System.out.println(name + "helloworld");
	}
	
	void waiting(){
		
		while(true){
			
			if(++age<=20){
				System.out.println("收红包，很快乐的童年时光");
			}else if(age>20 && age<=100){
				
				System.out.println("给红包，很痛苦，很无奈，反对国家二胎政策");
				
				if((age==60&& sex =='1' )||(age==55 && sex =='0')){
					out();
				}
			}else{
				System.out.println("88 world");
				break;
			}
			System.out.println("有辛酸，有快乐，有痛苦");
		}
		
	}
	
	void out(){
		System.out.println("退休了");
	}
	
}
