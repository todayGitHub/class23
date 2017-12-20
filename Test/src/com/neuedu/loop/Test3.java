package com.neuedu.loop;

public class Test3 {
	public static void main(String[] args) {
		double yearsal=40000;
		double zzl=0.15;
		
		for (int i = 0; i < 17; i++) {
			yearsal = yearsal*(1+zzl);
		}
		
		
		System.out.println(yearsal);
		
		
	}
}
