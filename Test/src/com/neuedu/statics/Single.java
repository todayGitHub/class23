package com.neuedu.statics;

import java.util.ArrayList;

public class Single {
	//我们希望做出来一中类，这个类可以new出来对象，但是永远只能new一个对象。
	
	private static Single ss ;
	int a = 1;
	
	 private Single(){
		super();
	}
	
	public  static Single getInstance(){
		if(ss == null){
			ss = new Single();
		}
		return ss;
		
	}
	
	class x{
		ArrayList<E>
	}
}
