
package com.neued.arrayt;

import java.util.Arrays;

public class TestArrayCopy {
	public static void main(String[] args) {
		int []a = {1,2,3,4,5,6,7};
		int []b;
		b = new int[a.length];
//		for (int i = 0; i < b.length; i++) {
//			b[i]=a[i];
//			System.out.println(b[i]);
//		}
		System.arraycopy(a,0, b, 0,a.length);
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		
	}
}
