package com.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("��ӭʹ��neusoft���û�����ϵͳ");
		System.out.println("=====================");
		System.out.println("�û���¼---------------1");
		System.out.println("�û�ע��---------------2");
		System.out.println("�˳�����---------------3");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("��¼�ɹ�");
			break;
		case 2:
			System.out.println("�û�ע�����");
			System.out.println("=====================");
			System.out.println("����������û���");
			Scanner scname= new Scanner(System.in);
			String username = scname.next();
			System.out.println("�������������");
			String password = scname.next();
			System.out.println("�������������");
			String mail = scname.next();
			System.out.println("�û�ע��ɹ�");
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			Statement stat = conn.createStatement();
			stat.executeUpdate("insert into users values('"+username+"','"+password+"','"+mail+"','"+"1')");
		//	System.out.println("insert into users values('"+username+"','"+password+"','"+mail+"','"+"'1')");
			break;			

		case 3:
			System.out.println("��ӭʹ�ñ�ϵͳ");
			System.exit(0);
			
			break;			
		default:
			break;
		}
	}
}