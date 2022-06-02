package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

import ClassProject.MoneyManager;
import Exception.ClassificationException;
import Money.CheckingAccount;
import Money.Money;
import Money.MoneyInput;
import gui.MenuSelection;
import gui.WindowFrame;

public class SaveButtonListener implements ActionListener {
	WindowFrame frame;
	MoneyManager moneyManager;
	MoneyInput moneyInput;
	String kind;
	JTextField classification;
	JTextField moneyName;
	JTextField amountText;
	public SaveButtonListener(WindowFrame frame,MoneyManager moneyManager, String kind, JTextField classification,
			JTextField moneyName, JTextField amount){
		this.frame = frame;
		this.moneyManager = moneyManager;
		this.kind = kind;
		this.classification = classification;
		this.moneyName = moneyName;
		this.amountText = amount;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		MenuSelection viewer = frame.getMenuSelection();
		String c = classification.getText();
		String m = moneyName.getText();
		String a = amountText.getText();
		
		moneyInput = new CheckingAccount();
		
		moneyInput.setKind(kind);
		try {
			moneyInput.setClassification(c);
		} catch (ClassificationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		moneyInput.setMoneyName(m);
		moneyInput.setAmount(Integer.parseInt(a));
		moneyManager.addMoneyList(moneyInput);
		//System.out.println(moneyInput.toString());
		frame.setupPanel(viewer);
	}

}
