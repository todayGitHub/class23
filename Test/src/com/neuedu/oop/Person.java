package com.neuedu.oop;

public class Person {
//	
//	ģ���˵�һ��
//	�� Ӧ�������֣��Ա�����
//	�˵�һ��Ӧ���ȸ��������к�����ȡһ�����֣�����һЩ�꣬
 //���꣺20��Ǯ�����պ����20��֮������ �������ᣬ�п��֣���ʹ��
//	������еľ�60�����ݣ�Ů�ľ�55���ݣ�
//	����ڵȴ�һЩ�� �Ϳ��ԣ�100 ֮��Ϳ���88��
	
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
				System.out.println("�պ�����ܿ��ֵ�ͯ��ʱ��");
			}else if(age>20 && age<=100){
				
				System.out.println("���������ʹ�࣬�����Σ����Թ��Ҷ�̥����");
				
				if((age==60&& sex =='1' )||(age==55 && sex =='0')){
					out();
				}
			}else{
				System.out.println("88 world");
				break;
			}
			System.out.println("�����ᣬ�п��֣���ʹ��");
		}
		
	}
	
	void out(){
		System.out.println("������");
	}
	
}
