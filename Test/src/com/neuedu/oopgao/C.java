package com.neuedu.oopgao;

public class C extends B implements A {
	   public void print(){
			  //System.out.println(a);
		   }
		   public static void main(String[] args) {
			  (new C()).print();
		   }
}
 abstract interface  A{
	   String x = "A";
	   int a = 1;
	}
	class B{
	   String x ="A";
	   int a = 2;
	   
	}
