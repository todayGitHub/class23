package IO;

import java.io.Serializable;

public class Daxiang implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	transient int age;
	
	public Daxiang(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	void hehe(){
		System.out.println(name+"���������ĺǺǺ�"+"  "+age);
	}
	
}