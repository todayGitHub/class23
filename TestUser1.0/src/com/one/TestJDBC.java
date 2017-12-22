package com.one;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		Statement stat = conn.createStatement();
		ResultSet rs = stat.executeQuery("select ename,job from  emp where empno = 7369");
		while(rs.next()){
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
		}
		rs.close();
		stat.close();
		conn.close();
	}
}
