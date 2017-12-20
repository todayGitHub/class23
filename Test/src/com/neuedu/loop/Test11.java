package com.neuedu.loop;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		System.out.println("请输入1个数");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int  i = 1;
		int  j = 1;
		while(true){
			if(x/(10*i)== 0){
				break;
			}
			i*=10;
			j++;
		}
	
		int [] array = new int[j];
		
		
		for (int k = 0,q=1; k < array.length; k++,q*=10) {
			array[k]= x/q%10;
		}
		System.out.print("翻转之后的结果：");
		for (int k =0; k <array.length; k++) {
			System.out.print(array[k]);
		}
		
	}
}
