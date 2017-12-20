package com.neuedu.loop;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		System.out.println("请输入一个数");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println(1);
			break;
		case 5:
			System.out.println(5);
			break;
		case 10:
			System.out.println(10);
			break;			

		default:
			System.out.println("none");
			break;
		}
	}
}
