package com.neued.arrayt;

public class TestArray {
	public static void main(String[] args) {
		
		int a ; //������������
		a = 1; //��ͨ��int���͵ı���
				 //�����������ͣ������жѿռ� ,���������������͵�ջ�ռ䶼��Ĭ��4���ֽ�	
		int[] b ; //���������  ���ü����׼����һ���ڴ�ռ� ��ֱ��д����������������ջ�ռ䣩
		b = new  int [1000000]; //����Ĵ���new ����jvm ���Ұ��պ���ķ��������ڴ�ռ�
						  //5��ռ䣬һ��ռ�4���ֽڣ�new �������Ƕѿռ䣩
//		b[0]= 1;  //����ĸ�ֵ
//		b[1]= 2;
//		b[2]= 3;
//		b[3]= 4;
//		b[4]= 5;
		
		for (int i = 0; i < b.length; i++) {
			b[i] =  i+1;
			System.out.println(b[i]);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
		System.out.println(b[999]);
		
	}
}