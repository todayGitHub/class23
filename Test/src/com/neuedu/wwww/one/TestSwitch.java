package com.neuedu.wwww.one;

public class TestSwitch {
	public static void main(String[] args) {
		int  chengji = 56;
		//�ж� �ɼ��������ɵȣ�
		
		if(chengji>=90){
			System.out.println("����");
		}else if(chengji >=80 ){
			System.out.println("��");
		}else if(chengji >=60){
			System.out.println("����");
		}else{
			System.out.println("�»�Ŭ��");
		}
			
	
		switch (chengji/10) {  //switch ������ʽ ��ֵ���ͣ�int byte char short    String  ö�٣�
		case 10:   //����   ��׽ ƥ��
			System.out.println("����");
			break;//���� ��������break�����switch ����ѭ���飩
		case 9:
			System.out.println("����");
			break;
		case 8:
			System.out.println("��");
			break;		
		case 7:
			System.out.println("����");
			break;
		case 6:
			System.out.println("����");
			break;			
		default:  //������е�case��ֵ��û�б�ƥ��ͻᱻdefaultƥ�䵽
			System.out.println("�»�Ŭ��");
			break;
					
			
		}
		
	}
}