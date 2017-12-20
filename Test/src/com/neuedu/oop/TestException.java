package com.neuedu.oop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;

public class TestException {
	public static void main(String[] args) throws FileNotFoundException {				
		
		try {
			haha() ;
		} catch (hahaException e) {
			// TODO Auto-generated catch block
			System.out.println("跳出之前所在的函数");
		}
			
		
	}
	static void hehe() throws hahaException {
		haha();
	}
	static void haha() throws hahaException{
		int hour = 10;
		if(hour>3){
			
				throw new hahaException();
			
		}else{
			System.out.println("轻松一笑");
		}
	
	}
	
	
}

