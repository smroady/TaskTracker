package src.ui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class CreateTaskWindowLayout extends JPanel{ 
	private GridBagConstraints gbc = new GridBagConstraints(); 
	
	public CreateTaskWindowLayout() {  
		this.setLayout(new GridBagLayout()); 
		this.setBackground(Color.LIGHT_GRAY);
		panelBuild();
		this.setVisible(true);
	}

	private void panelBuild() {
		Border raisedbevel = BorderFactory.createRaisedBevelBorder();
		gbc.insets = new java.awt.Insets(5, 5, 5, 5);
		//grid y = 0 
		JLabel titlePane = new JLabel("Title: ");
		gbc.gridx = 0; 
		gbc.gridy = 0; 
		gbc.fill = GridBagConstraints.NONE; 
		gbc.anchor = GridBagConstraints.WEST;
		this.add(titlePane, gbc); 
		
		JTextField titleField = new JTextField(40); 
		gbc.gridx = 1; 
		gbc.gridy = 0; 
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.WEST;
		this.add(titleField, gbc); 
		
		//grid y = 3
		JLabel descriptionPane = new JLabel("Description: "); 
		gbc.gridx = 0; 
		gbc.gridy = 3; 
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;  
		this.add(descriptionPane, gbc); 
		
		JTextArea descriptionArea = new JTextArea(5, 40);
		descriptionArea.setLineWrap(true);
		descriptionArea.setWrapStyleWord(true);
		JScrollPane scrollPane = new JScrollPane(descriptionArea,
		        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
		        JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		gbc.gridx = 1; 
		gbc.gridy = 3; 
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		this.add(descriptionArea, gbc);		
		
		//grid y = 5
		JButton cancel = new JButton("Cancel"); 
		cancel.setBorder(raisedbevel);
		cancel.setBackground(Color.LIGHT_GRAY);
		gbc.gridx = 2;
		gbc.gridy = 4;
		gbc.gridwidth = 1; 
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;  
		this.add(cancel, gbc); 
		
		JButton save = new JButton(" Save "); 
		save.setBorder(raisedbevel);
		save.setBackground(Color.LIGHT_GRAY);
		gbc.ipadx = 1; 
		gbc.gridx = 3;
		gbc.gridy = 4;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;  
		this.add(save, gbc); 
	}
}
