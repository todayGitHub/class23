package com.neuedu.function;

import java.util.Arrays;

public class Test1 {
	
	public static void main(String[] args) {
		int []n = {1,2,3,6,3,4};
		int []a = {1,2,3,6,3,4};
		int [] b= {1,2,3,6,3,4};
		//sort(a);
		haha(123,123);
		
	}
	static void haha(int a,char c){
		System.out.println("haha");
	}
	static void haha(int a,int  asdasdsadasasdasdasdsadd){
		System.out.println("hehe");
	}
	
	 static void printArray(int[] a) {		
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	
	public static void sort(int [] a) {

		//Ñ¡ÔñÅÅĞò
				int index = 0;
				int temp = 0;
				for (int i = 1; i < a.length; i++) {
					for(int j = 1;j<=a.length-i;j++){				
						if(a[index]<a[j]){
							index = j;
						}	
						temp= a[a.length-i];
						a[a.length-i]=a[index];
						a[index] = temp;
					}
					
					index = 0;
					temp = 0;
					
				}
				printArray(a);
	}
	
	
}
