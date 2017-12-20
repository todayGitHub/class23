package com.neuedu.loop;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("请输入一个数");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if((a&1)==0){
			System.out.println("偶数");
		}else{
			System.out.println("奇数");
		}
	}
}
