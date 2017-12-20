package com.neuedu.loop;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		System.out.println("ÇëÊäÈë3¸öÊý");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();		
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("a:"+a+","+"b:"+b+","+"c:"+c);
		if(a>b){
			if(a>c){
				if(b>c){
					System.out.println("a,b,c");
				}else{
					System.out.println("a,c,b");
				}
			}else{
				System.out.println("c,a,b");
			}
		}else{
			if(b>c){
				if(a>c){
					System.out.println("b,a,c");
				}else{
					System.out.println("b,c,a");
				}
				
			}else{  //b<c && a<b<c
				if(a<c){
					System.out.println("c,b,a");
				}
			}
		}
		
	}
}
