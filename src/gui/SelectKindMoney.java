package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import ClassProject.MoneyManager;
import Listener.AddButtonListener;
import Listener.BackButtonListener;
import Listener.ExitButtonListener;
import Listener.ViewButtonListener;

public class SelectKindMoney extends JPanel{
	WindowFrame frame;
	MoneyManager moneyManager;
	public SelectKindMoney(WindowFrame frame, MoneyManager moneyManager) {
		this.frame = frame;
		this.moneyManager = moneyManager;
		this.setLayout(new BorderLayout());
		JPanel titlePanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		JLabel label = new JLabel("Kind Selection");
		JPanel backButtonPanel = new JPanel();
		JButton btn1 = new JButton("Checking Account");
		JButton btn2 = new JButton("Saving Account");
		JButton btn3 = new JButton("Loan Money");
		JButton btn4 = new JButton("back");

		btn1.addActionListener(new AddButtonListener(frame, "Checking Account",moneyManager));
		btn2.addActionListener(new AddButtonListener(frame, "Saving Account",moneyManager));
		btn3.addActionListener(new AddButtonListener(frame, "Loan",moneyManager));
		btn4.addActionListener(new BackButtonListener(frame));
		titlePanel.add(label);
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		buttonPanel.add(btn1);
		buttonPanel.add(btn2);
		buttonPanel.add(btn3);
		backButtonPanel.add(btn4);
		this.add(titlePanel, BorderLayout.NORTH);
		this.add(buttonPanel,BorderLayout.CENTER);
		this.add(backButtonPanel,BorderLayout.SOUTH);
	}
}
