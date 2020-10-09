package com.jdbcapp.mainapp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jdbcapp.factory.ConnectionFactory;

public class App {

	public static void main(String[] args) {

		try {
			//Use factory method to get the connection
			Connection connection = ConnectionFactory.getConnectionToDb();
			
			System.out.println("Connection object is :" + connection);
			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery("select * from `student`");
			System.out.println("Records of the table is :");
			System.out.println("SNO " + "\t" + "SNAME " + "\t" + "SADDRESS ");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("sid") + "\t" + resultSet.getString("sname") + "\t"
						+ resultSet.getString("saddress"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
