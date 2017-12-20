package com.neued.arrayt;

public class TestArraycopy2 {
	public static void main(String[] args) {
		int []a = {1,2,3,4,5};
		int []b = {6,7,8,9,10,11,12,13,14,15};
		
		int [] c = new int[a.length+b.length];
		
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[i+a.length] = b[i];
		}
		b = c;
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
