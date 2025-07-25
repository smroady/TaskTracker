package src.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class MainFrame extends JFrame implements ActionListener{
	private final int WIDTH = 500, HEIGHT = 650; 
	
	JPanel upperMenuPanel = new JPanel(); 
	JPanel taskBoardPanel = new JPanel();
	JPanel lowerButtonPanel = new JPanel();
	
	JButton clearButton = new JButton("Clear");
	
	public MainFrame() { 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setSize(WIDTH, HEIGHT);
		this.setLayout(null);
		this.setResizable(false);
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		setupPanels(this); 
		this.setVisible(true);
	}
	
	public void setupPanels(JFrame frame) { 
		upperMenuPanel.setBackground(Color.LIGHT_GRAY);
		upperMenuPanel.setBounds(0, 0, WIDTH, 75); 
		upperMenuPanel.setLayout(null);
		
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();
		Border raisedbevel = BorderFactory.createRaisedBevelBorder();
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
		lowerButtonPanel.add(clearButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
