package src.code;

import java.sql.*;

public class DBHandler {
	Connection conn = null;
	public DBHandler () { 
		try {
			 conn = DriverManager.getConnection("jdbc:sqlite:tasks.db");
		} catch (Exception e) { 
			System.err.println("Error: " + e);
		}
	} 
}
