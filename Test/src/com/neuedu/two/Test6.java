package com.neuedu.two;

public class Test6 {
	public static void main(String[] args) {
		int[] a = {2,3,5,1,2,4 ,6,3124,213};
		int index = 0;
		int temp = 0;
		
			for(int j = 1;j<=a.length-1;j++){				
				if(a[index]<a[j]){
					index = j;
				}	
			
			}
			
		System.out.println(index);
		System.out.println(a[index]);
	
	}
}
