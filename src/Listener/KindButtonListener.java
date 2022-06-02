package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import gui.AddMoney;
import gui.SelectKindMoney;
import gui.ViewMoney;
import gui.WindowFrame;

public class KindButtonListener implements ActionListener {
	WindowFrame frame;
	public KindButtonListener(WindowFrame frame){
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		SelectKindMoney adder = frame.getSelectKindMoney();
		frame.setupPanel(adder);
	}
}