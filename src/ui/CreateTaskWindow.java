package src.ui;

import java.awt.Color;
import java.awt.Component;

import javax.swing.*;

public class CreateTaskWindow {
	private JDialog popup;
	private CreateTaskWindowLayout layout;
	  
	public CreateTaskWindow(JFrame frame) {
		this.popup = new JDialog(frame, "New Task", true);
		this.popup.setSize(500, 200);
        this.popup.setLocationRelativeTo(frame); 
        this.popup.setBackground(Color.LIGHT_GRAY);
        this.popup.add(windowSetup()); 
        this.popup.setVisible(true);
	}
	
	private JPanel windowSetup() {
		layout =  new CreateTaskWindowLayout(); 
		return layout; 
	}

	public Component getWindow() {
		return this.popup; 
	}
}
