package com.neuedu.two;

public class Test4 {
	public static void main(String[] args) {
		int []a[] = {{2,3,4},{4,6,8}};
		int [][]b = {{1,5,2,8},{5,9,10,-3},{2,7,-5,-18}};
		int c[][] = new int[2][4];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				//c[0][0] = a[0][0]* b[0][0]+a[0][1]*b[1][0]+a[0][2]*b[2][0];
				//c[0][1] = a[0][0]* b[0][1]+a[0][1]*b[1][1]+a[0][2]*b[2][1];
				//c[0][2] = a[0][0]* b[0][2]+a[0][1]*b[1][2]+a[0][2]*b[2][2];
				//c[0][3] = a[0][0]* b[0][3]+a[0][1]*b[1][3]+a[0][2]*b[2][3];
				//c[1][0] = a[1][0]* b[0][0]+a[1][1]*b[1][0]+a[1][2]*b[2][0];
				c[i][j] = a[i][0]*b[0][j]+a[i][1]*b[1][j]+a[i][2]*b[2][j];
				System.out.print(c[i][j]+" , ");
			}
			System.out.println();
		}
	}
}
