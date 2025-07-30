package src.code;

import java.util.Random;

public class Task {
	private final int ID_LENGTH = 8; 
	
	private String taskID; 
	private String title;
	private String Description; 
	private boolean  isComplete; 

	public Task(String title, String Description) {
		 this.taskID = createID(); 
		 this.title = title; 
		 this.Description = Description; 
		 this.isComplete = false; 
	}
	
	public String getTaskID() { 
		return this.taskID;
	}
	
	public String getTitle() { 
		return this.title; 
	}
	
	public String getDescription() { 
		return this.Description; 
	}	
	
	public void setIsComplete() { 
		this.isComplete = true; 
	}
	
	private String createID() { 
		Random rand = new Random(); 
		StringBuilder id = new StringBuilder();
		for(int i = 0; i < ID_LENGTH; i++) {
			int temp = rand.nextInt(10);
			id.append(temp); 
		}
		return id.toString();
	}
}
