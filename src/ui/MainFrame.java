package src.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class MainFrame extends JFrame implements ActionListener{
	private final int WIDTH = 500, HEIGHT = 650; 
	private ButtonHandler buttonHandle = new ButtonHandler(); 
	
	JPanel upperMenuPanel = new JPanel(); 
	JPanel taskBoardPanel = new JPanel();
	JPanel lowerButtonPanel = new JPanel();
	
	JButton makeNewTask = new JButton("Create New Task +"); 	
	JButton clearButton = new JButton("Clear");
	
	JButton[] buttons = {
			makeNewTask, clearButton
	};
	
	public MainFrame() { 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setSize(WIDTH, HEIGHT);
		this.setLayout(null);
		this.setResizable(false);
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		setupPanels(this); 
		buttonSetup(); 
		this.setVisible(true);
	}
	
	public void setupPanels(JFrame frame) { 
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();
		Border raisedbevel = BorderFactory.createRaisedBevelBorder();
		
		upperMenuPanel.setBackground(Color.LIGHT_GRAY);
		upperMenuPanel.setBounds(0, 0, WIDTH - 25 , 75); 	
		upperMenuPanel.setLayout(new FlowLayout(FlowLayout.TRAILING));
		makeNewTask.setBackground(Color.LIGHT_GRAY); 
		makeNewTask.setBounds(WIDTH - 150, 15, 100, 50);
		makeNewTask.setBorder(raisedbevel);	
		
		taskBoardPanel.setBorder(loweredbevel);
		taskBoardPanel.setBounds(5, 75, WIDTH - 25, HEIGHT - 200);
		taskBoardPanel.setBackground(Color.GRAY);
		taskBoardPanel.setLayout(new BorderLayout());
		
		lowerButtonPanel.setBounds(0, HEIGHT - 125 , WIDTH, 80); 
		lowerButtonPanel.setBackground(Color.LIGHT_GRAY);
		lowerButtonPanel.setLayout(null);
		clearButton.setBackground(Color.LIGHT_GRAY); 
		clearButton.setBounds(WIDTH - 150, 15, 100, 50);
		clearButton.setBorder(raisedbevel);
	
		frame.add(upperMenuPanel);
		frame.add(taskBoardPanel);
		frame.add(lowerButtonPanel); 
		upperMenuPanel.add(makeNewTask); 
		lowerButtonPanel.add(clearButton);
	}
	
	private void buttonSetup() { 
		ActionListener listener = e -> {
		    String command = e.getActionCommand();
		    buttonHandle.handleRequest(command, this);
		};
		for (JButton button : buttons) {
            button.addActionListener(listener);
        }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
