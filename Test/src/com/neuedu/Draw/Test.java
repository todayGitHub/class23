package com.neuedu.Draw;

public class Test {
	
	public Test(){
		
	}
	
	public Test(int a){
		this();
		
		
	}
	
	
	public static void main(String[] args) {
		Drawer d = new smallDrawer("123",1);
		Drawer sd = new Drawer("123",1);
		//Test t = new Test();
		//System.out.println(new smallDrawer("123",1) instanceof Drawer);
		
//		
//		byte b = 1;
//		int a = b;
//		b = (byte)a;
		
		haha(d);
		
	}
	
	static void haha(Drawer d��){
		if(d��  instanceof  smallDrawer) {
			((smallDrawer)d��).sex="123";
			System.out.println(d��  instanceof  smallDrawer);
		}
		
		Tuhao runtu = new Tuhao();		
		d��.draw(runtu.pay());
	}
} 
