package com.ust.ioc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection implements Connection {
	
	private String url;
	private String dbUserName;
	private String dbPassWord;
	
	
	
	
	public String getUrl() {
		return url;
	}




	public void setUrl(String url) {
		this.url = url;
	}




	public String getDbUserName() {
		return dbUserName;
	}




	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}




	public String getDbPassWord() {
		return dbPassWord;
	}




	public void setDbPassWord(String dbPassWord) {
		this.dbPassWord = dbPassWord;
	}




	public  DBConnection getConnection()
	{
		
		try {
			java.sql.Connection con = DriverManager.getConnection(url,dbUserName,dbPassWord);

		System.out.println("connected to mysql....");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("get connection called...");
		return new DBConnection();
	}

}
