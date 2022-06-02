package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import ClassProject.MoneyManager;
import gui.AddMoney;
import gui.ViewMoney;
import gui.WindowFrame;

public class AddButtonListener implements ActionListener {
	WindowFrame frame;
	String kind;
	MoneyManager moneyManager;
	public AddButtonListener(WindowFrame frame, String kind, MoneyManager moneyManager){
		this.frame = frame;
		this.kind = kind;
		this.moneyManager = moneyManager;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		frame.setAddMoney(frame.getAddMoney(), kind, moneyManager);
		AddMoney adder = frame.getAddMoney();
		frame.setupPanel(adder); 
	}

}
