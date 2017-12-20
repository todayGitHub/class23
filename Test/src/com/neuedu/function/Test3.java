package com.neuedu.function;

public class Test3 {
	  public static void main(String[] args) {
		   int z=100;
		  zhishu();
		//System.out.println( zhishu());
		  
		
	}
	      public static void zhishu () {
	    	 int a= 201;
	  		int count=1;
	  		while(true){
	  			for (int i = 2; i <= a;i++) {
	  				if(a%i==0){
	  					count++;
	  					
	  				}
	  				if(count>2){
	  					break;
	  				}
	  			}
	  			
	  			if(count ==2){
	  				System.out.println(a);
	  				break;
	  			}
	  			a++;
	  			count = 1;
	  		}
	  	        //return a;  
	    	  
		
	}

}
