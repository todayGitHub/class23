package com.neuedu.loop;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		
		while(true){
			System.out.println("������һ����");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			if(a%5==0 && a%6==0){
				System.out.println("��ͬʱ��5,6����");
			}else if(a%5==0){
				System.out.println("�ܱ�5����");
			}else if(a%6==0){
				System.out.println("�ܱ�6����");
			}else{
				System.out.println("����");
			}	
		}
		
		
	}
}
