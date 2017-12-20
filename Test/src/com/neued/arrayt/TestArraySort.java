package com.neued.arrayt;

import java.util.Arrays;

public class TestArraySort {
	public static void main(String[] args) {
		int []a = {12,1,234,89,76,23,32,17,91};
		
//		//冒泡排序
//		//找到当前最大的数
//		for (int i = 1; i < a.length; i++) {
//			for (int j = 0; j < a.length-i; j++) {
//				if(a[j]>a[j+1]){
//					a[j] = a[j]^a[j+1];
//					a[j+1] = a[j]^a[j+1];
//					a[j] = a[j]^a[j+1];
//				}
//				
//			}
//		}
//		
		
		//选择排序
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
		for (int x = 0; x < a.length; x++) {
			System.out.print(a[x]+",");
		
		}
	
		
		
		
		
      		

		
	
	}
}
