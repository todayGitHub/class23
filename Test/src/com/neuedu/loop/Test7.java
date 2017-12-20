package com.neuedu.loop;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		
		while(true){
			System.out.println("请输入一个数");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			if(a%5==0 && a%6==0){
				System.out.println("能同时被5,6整除");
			}else if(a%5==0){
				System.out.println("能被5整除");
			}else if(a%6==0){
				System.out.println("能被6整除");
			}else{
				System.out.println("不能");
			}	
		}
		
		
	}
}
