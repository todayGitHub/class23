package com.neued.arrayt;

public class TestArray2 {
	public static void main(String[] args) {
		int []a ;  //��̬��ʼ��
		a = new int [3];
		a[0] = 1;
		a[1] = 1;
		a[2] = 1;
		//
		int []b = new int [3];
		b[0] = 1;
		b[1] = 1;
		b[2] = 1;
		
		//
		int []c = new int[]{1,2,3,4};
		//��̬��ʼ��
		int []d =  {1,2,3};
		
		System.out.println(c.length);
		//��������
		
		for (int i = 0; i < c.length; i++) {
			//System.out.println(c[i]);
			c[i] = c[i]*2;
			System.out.println(c[i]);
		}
		
		
		
	}
}
