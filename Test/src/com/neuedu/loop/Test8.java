package com.neuedu.loop;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		pingrun();
	}
	
	public static void pingrun() {
		System.out.println("������һ����");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if((year%4==0&&year%100!=0 )||( year%400 ==0)){
			System.out.println("�����꣬���������һ�����ˣ���ϲ������˿����ٻ���Ǯ");
		}else{
			System.out.println("ƽ��");
		}
	}
}
