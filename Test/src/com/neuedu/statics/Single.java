package com.neuedu.statics;

import java.util.ArrayList;

public class Single {
	//����ϣ��������һ���࣬��������new�������󣬵�����Զֻ��newһ������
	
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
