package src.code;

public class Task {
	private String taskID; 
	private String title;
	private String Description; 
	private boolean  isComplete; 
	
	public Task(String taskID, String title, String Description) {
		 this.taskID = taskID; 
		 this.title = title; 
		 this.Description = Description; 
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
}
