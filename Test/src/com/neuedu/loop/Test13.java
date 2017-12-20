package com.neuedu.loop;

public class Test13 {
	public static void main(String[] args) {
		int sum = 0;
//		for (int i = 1; i < 101; i++) {
//			if(i%3 == 0){
//				sum = sum+i;
//				System.out.println(i);
//			}
//		}
//		int i = 1;
//		while( i < 101) {
//			if(i%3 == 0){
//				sum = sum+i;
//				System.out.println(i);
//			} 
//			i++;
//		}
		int i = 1;
		do{
			if(i%3 == 0){
				sum = sum+i;
				System.out.println(i);
			} 
			i++;
		}while( i < 101); 
		System.out.println(sum);
	}
}
