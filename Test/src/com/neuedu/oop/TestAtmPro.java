package com.neuedu.oop;

import java.util.Scanner;

public class TestAtmPro {
	public static void main(String[] args) {
		//Ĭ�����룺123456���˻���� 2
		boolean flag ;
		Scanner sc ;
		int a[] ;
		int b ;
		System.out.println("���������룬6λ����");
		while(true){
			flag = true;
			sc = new Scanner(System.in);
			a = new int[6];
			for (int i = 0; i < a.length; i++) {
				a[i] =sc.nextInt(); 
			}
			
			for (int i = 0; i < a.length; i++) {
				if(a[i]!= i+1){
					System.out.println("�����������������");
					flag = false;
					break;
				}
			}
			if(flag == true){
				break;
			}
		}
		System.out.println("��ӭ��½ĳ��֧��");
		do{			
			System.out.println("������ȡ����");
			sc = new Scanner(System.in);
			b = sc.nextInt();
			if(b<=2 && b>=0 ){
				System.out.println("���۵���Ǯ������");
				System.out.println("�վ�");
				break;
			}else{
				System.out.println("����");
			}
		}while(true);
		
	}
}
