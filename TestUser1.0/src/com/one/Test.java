package com.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("欢迎使用neusoft的用户管理系统");
		System.out.println("=====================");
		System.out.println("用户登录---------------1");
		System.out.println("用户注册---------------2");
		System.out.println("退出程序---------------3");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("登录成功");
			break;
		case 2:
			System.out.println("用户注册界面");
			System.out.println("=====================");
			System.out.println("请输入你的用户名");
			Scanner scname= new Scanner(System.in);
			String username = scname.next();
			System.out.println("请输入你的密码");
			String password = scname.next();
			System.out.println("请输入你的邮箱");
			String mail = scname.next();
			System.out.println("用户注册成功");
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			Statement stat = conn.createStatement();
			stat.executeUpdate("insert into users values('"+username+"','"+password+"','"+mail+"','"+"1')");
		//	System.out.println("insert into users values('"+username+"','"+password+"','"+mail+"','"+"'1')");
			break;			

		case 3:
			System.out.println("欢迎使用本系统321");
			System.exit(0);
			
			break;			
		default:
			break;
		}
	}
}
