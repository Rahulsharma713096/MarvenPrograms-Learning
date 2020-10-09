package com.DBconnection.DBConnection_Maven;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.DBconnection.DBConnection_Maven.factory.MysqlConnectionUtil;

public class App 
{
    public static void main( String[] args )
    {
    	Connection con = MysqlConnectionUtil.con;
    	String s="select * from info";
    	
    	try {
    		Statement cs = con.createStatement();
        	ResultSet res = cs.executeQuery(s);
        	System.out.println("usn \t Name \t m1 \t phy \t chem \t avg ");
        	while(res.next()) {
        		
        	System.out.println(res.getInt(1)+"\t"+res.getString(2)+"\t"+res.getInt(3)+"\t"+res.getString(4)+"\t"+res.getInt(5)+"\t"+res.getDouble(6));
        	}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
}
