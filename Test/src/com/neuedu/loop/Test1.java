package com.neuedu.loop;

public class Test1 {
	
	
	
	public static void main(String[] args) {
		double lirun = 10000;
		double comm;
		
		if(lirun<=10){
			comm = lirun*0.1;
		}else if(lirun<=20){
			comm = 1+(lirun-10)*0.075;
		}else if(lirun<=40){
			comm = 1+0.75+(lirun-20)*0.05;
		}else if(lirun<=60){
			comm = 1.75+1+(lirun-40)*0.03;
		}else if(lirun<=100){
			comm = 2.75+0.6+(lirun-60)*0.015;
		}else{
			comm = 3.95+(lirun-100)*0.01;
		}
					
				
			
		
		System.out.println(comm);
	}
}
