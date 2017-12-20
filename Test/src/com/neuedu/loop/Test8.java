package com.neuedu.loop;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		pingrun();
	}
	
	public static void pingrun() {
		System.out.println("请输入一个数");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if((year%4==0&&year%100!=0 )||( year%400 ==0)){
			System.out.println("是闰年，如果你是这一年生人，恭喜你的亲人可以少花点钱");
		}else{
			System.out.println("平年");
		}
	}
}
