package com.ust.ioc;

public class Login {
	
	private String username;
	private String password;
	DBConnection db;//it is a dependency
	
	
	
	
	public DBConnection getDb() {
		return db;
	}


	public void setDb(DBConnection db) {
		this.db = db;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String validate()
	{
		//obtain connection and write sql
		//to verify username  and password from db
	// db = new DBConnection();
	Connection con  = db.getConnection();
	
	
	
	return "Login validated...";
	}

}
