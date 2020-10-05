package com.DBconnection.DBConnection_Maven.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnectionUtil {
@SuppressWarnings("unused")
public static Connection con;

static {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root", "12345678");
		System.out.println("Connection get Establish");
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
