package com.neuedu.wwww.one;

import java.util.Scanner;





public class TestFenshou {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int jiubianzi ;
//		
//		
//		while(true){
//			
//			jiubianzi = sc.nextInt();
//			if(jiubianzi>=3){
//				System.out.println("开水");
//				continue;					
//			}else{
//				System.out.println("不和你计较");
//			}
//		}
		
		
//		for (int i = 0; i < 7; i++) {
//			if(i== 3){
//				System.out.println("这次不爽，走人，今天请假");
//				continue;
//			}
//			System.out.println(i);
//		}
		
		a:for (int i = 1; i <= 9; i++) {
			b:for (int j = 1; j <=i; j++) {
				if(i == 3){
					break a;
				}
				System.out.print(i+"*" +j+"="+i*j +",");
				
			}
			System.out.println("b结束了");
			System.out.println();
		}
		System.out.println("a结束了");
		
	}
}
