package com.neuedu.oop;

import java.util.Scanner;

public class TestAtmPro {
	public static void main(String[] args) {
		//默认密码：123456，账户余额 2
		boolean flag ;
		Scanner sc ;
		int a[] ;
		int b ;
		System.out.println("请输入密码，6位数字");
		while(true){
			flag = true;
			sc = new Scanner(System.in);
			a = new int[6];
			for (int i = 0; i < a.length; i++) {
				a[i] =sc.nextInt(); 
			}
			
			for (int i = 0; i < a.length; i++) {
				if(a[i]!= i+1){
					System.out.println("密码错误，请重新输入");
					flag = false;
					break;
				}
			}
			if(flag == true){
				break;
			}
		}
		System.out.println("欢迎登陆某软支行");
		do{			
			System.out.println("请输入取款金额");
			sc = new Scanner(System.in);
			b = sc.nextInt();
			if(b<=2 && b>=0 ){
				System.out.println("哇哇的吐钱，恶额额");
				System.out.println("收据");
				break;
			}else{
				System.out.println("余额不足");
			}
		}while(true);
		
	}
}
