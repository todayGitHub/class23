package com.neuedu.loop;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("������һ����");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if((a&1)==0){
			System.out.println("ż��");
		}else{
			System.out.println("����");
		}
	}
}
