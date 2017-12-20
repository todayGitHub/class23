package com.neuedu.two;

public class Test7 {
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		int [] b = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[a.length-i-1];
		}
		a = b;
		for (int i = 0; i < b.length; i++) {
			System.out.println(a[i]);
		}
	}
}
