package gui;


import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame{
	public MenuSelection(String frameTitle) {
		super(frameTitle);
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel titlePanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		
		JButton btn1 = new JButton("Add Money");
		JButton btn2 = new JButton("Delete Money");
		JButton btn3 = new JButton("Edit Money");
		JButton btn4 = new JButton("View Money");
		JButton btn5 = new JButton("Exit Program");
		
		titlePanel.add(label);
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		buttonPanel.add(btn1);
		buttonPanel.add(btn2);
		buttonPanel.add(btn3);
		buttonPanel.add(btn4);
		buttonPanel.add(btn5);
		
		this.add(titlePanel, BorderLayout.NORTH);
		this.add(buttonPanel,BorderLayout.CENTER);
		this.setVisible(true);
	}
}
