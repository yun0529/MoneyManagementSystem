package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import ClassProject.MenuManager;
import ClassProject.MoneyManager;
import gui.MenuSelection;
import gui.WindowFrame;

public class ExitButtonListener implements ActionListener {
	WindowFrame frame;
	MenuManager menuManager;
	MoneyManager moneyManager;
	public ExitButtonListener(WindowFrame frame, MoneyManager moneyManager, MenuManager menuManager){
		this.frame = frame;
		this.menuManager = menuManager;
		this.moneyManager = moneyManager;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		menuManager.putObject(moneyManager,"moneyManager.ser");
		System.exit(0);
	}
}
