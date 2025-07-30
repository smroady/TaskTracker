package src.code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHandler {
	private Connection conn; 
	
	public DBHandler() { 
		createConnection(); 
		createTaskTable(); 
	}

	private void createConnection() {
		try {
			 String url = "jdbc:sqlite:tasks.db";
			 conn = DriverManager.getConnection(url); 
			 System.out.println("Database created"); 
		} catch(SQLException e) {
			System.out.println("Error connection: " + e.getMessage()); 
		}
	}
	
	private void createTaskTable() { 
		String table = "CREATE TABLE IF NOT EXISTS tasks"
				+ "id INTEGER PRIMARY KEY, "
				+ "name TEXT NOT NULL, "
				+ "description TEXT, " ;
		try (Statement stmt = conn.createStatement()) { 
			stmt.execute(table); 
			System.out.println("Table created."); 
		} catch(SQLException e) { 
			System.out.println("Error making table: " + e.getMessage()); 
		}
	}
	
	public void addNewTack(Task task) { 
		String sqlStatement = "INSERT INTO tasks(id, title, description) VALUES (?, ?, ?)"; 
		 try (PreparedStatement pstmt = conn.prepareStatement(sqlStatement)) {
	            pstmt.setString(1, task.getTaskID());
	            pstmt.setString(2, task.getTitle());
	            pstmt.setString(3, task.getDescription());

	            pstmt.executeUpdate();
	            System.out.println("Task inserted.");
	        } catch (SQLException e) {
	            System.out.println("Insert Error: " + e.getMessage());
	        }
	}
	
	public Connection getConnection() { 
		return conn; 
	}
	
}