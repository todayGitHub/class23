package com.neuedu.two;

public class Test8 {
	public static void main(String[] args) {
		int [] a = {1,2,3,1,1,1,2,3,54};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[j] == 0){
					continue;
				}
				if(a[i]==a[j]){
					a[j] =0;
				}
			}
			
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
