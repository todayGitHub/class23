package com.neuedu.loop;

public class Test16 {
	public static void main(String[] args) {
		zhishu();
	}
	
	public static void zhishu() {
		int a = 201;
		int count=1;
		while(true){
			for (int i = 2; i <= a; i++) {
				if(a%i==0){
					count++;
					
				}
				if(count>2){
					break;
				}
			}
			
			if(count ==2){
				System.out.println("最小的质数是"+a);
				break;
			}
			a++;
			count = 1;
		}
	}
}
