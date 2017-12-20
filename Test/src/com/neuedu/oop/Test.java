package com.neuedu.oop;

import com.neuedu.oop.Outer.Inner;

public class Test {
	B b = new B() {
		
		@Override
		public int xixi() {
			// TODO Auto-generated method stub
			return 0;
		}
	};
	
	
	public static void main(String[] args) {
		new Outer().xixi();
//		System.out.println(new Outer().new Inner().xixi());
//		Inner inner = new Outer().new Inner();
//		Inner i = new Outer().new Inner();
//		new Outer().new Inner();
//		Inner inner = new Outer.Inner();
		
		
		A a = new A() {
			
			@Override
			public void xixi() {
				// TODO Auto-generated method stub
				
			}
		};
		
	}
}


class i implements A{

	@Override
	public void xixi() {
		// TODO Auto-generated method stub
		
	}
	
}