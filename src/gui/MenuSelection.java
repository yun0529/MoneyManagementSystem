package gui;


import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ClassProject.MenuManager;
import ClassProject.MoneyManager;
import Listener.AddButtonListener;
import Listener.ExitButtonListener;
import Listener.KindButtonListener;
import Listener.ViewButtonListener;

public class MenuSelection extends JPanel{
	WindowFrame frame;
	MenuManager menuManager;
	MoneyManager moneyManager;
	public MenuSelection(WindowFrame frame,MoneyManager moneyManager,MenuManager menuManager) {
		this.frame = frame;
		this.menuManager = menuManager;
		this.moneyManager = moneyManager;
		this.setLayout(new BorderLayout());
		JPanel titlePanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		
		JButton btn1 = new JButton("Add Money");
		JButton btn2 = new JButton("Delete Money");
		JButton btn3 = new JButton("Edit Money");
		JButton btn4 = new JButton("View Money");
		JButton btn5 = new JButton("Exit Program");

		btn1.addActionListener(new KindButtonListener(frame));
		btn4.addActionListener(new ViewButtonListener(frame));
		btn5.addActionListener(new ExitButtonListener(frame, moneyManager, menuManager));
		titlePanel.add(label);
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		buttonPanel.add(btn1);
		buttonPanel.add(btn2);
		buttonPanel.add(btn3);
		buttonPanel.add(btn4);
		buttonPanel.add(btn5);
		
		this.add(titlePanel, BorderLayout.NORTH);
		this.add(buttonPanel,BorderLayout.CENTER);
	}
}
