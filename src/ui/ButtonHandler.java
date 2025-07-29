package src.ui;

import javax.swing.JFrame;

public class ButtonHandler {
	public ButtonHandler() { 
		
	}
	
	public void handleRequest(String command, JFrame frame) { 
		if(command.equals("Create New Task +")) { 
			CreateTaskWindow newTask = new CreateTaskWindow(frame);
		} else if(command.equals("Clear")) {
			//do nothing rofl  
		}
	}
}
